package com.nath.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nath.hibernate.demo.entity.Student;

public class QueryStudentDemo {
	
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class).
								buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").list();
			
			// display the students
			displayStudents(theStudents);
			
			// query students, last name shinde
			theStudents = session.createQuery("from Student s where s.lastName='Shinde'").list();
			
			// display students
			System.out.println("\n\nStudents with last name");
			displayStudents(theStudents);
			
			// commit a transaction
			session.getTransaction().commit();
			
			System.out.println("Commited!");
			
		} catch (Exception e) {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
