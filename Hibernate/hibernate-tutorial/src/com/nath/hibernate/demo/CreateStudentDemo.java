package com.nath.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nath.hibernate.demo.entity.Student;

public class CreateStudentDemo {
	
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class).
								buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// use the session objects to save java project
			
			// create a student object
			System.out.println("Creating a new Student object");
			Student demoStudent = new Student("Paul", "Walker", "paul@nath.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save a student object
			System.out.println("Saving a student...");
			session.save(demoStudent);
			
			// commit a transaction
			session.getTransaction().commit();
			
			System.out.println("Commited!");
			
		} catch (Exception e) {
			factory.close();
		}
	}

}
