package com.nath.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nath.hibernate.demo.entity.Student;

public class DeleteStudentDemo {
	
public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class).
								buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 3;
			
			// get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: "+studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			// delete the student 
			//System.out.println("Deleting student: "+myStudent);
			//session.delete(myStudent);
			
			// delete student of id 2
			System.out.println("Delete Student of id 2");
			session.createQuery("delete from Student where id=2").executeUpdate();
			
			// commit the transaction
			session.getTransaction().commit();
			
			
			
			System.out.println("Commited!");
			
		} catch (Exception e) {
			factory.close();
		}
	}

	
}
