package com.nath.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nath.hibernate.demo.entity.Student;

public class ReadStudentDemo {
	
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
			System.out.println(demoStudent);
			session.save(demoStudent);
			
			// commit a transaction
			session.getTransaction().commit();
			
			// My new Code 
			
			// find out the students id: primary key
			System.out.println("Saved student. Generated ID: "+demoStudent.getId());
			
			// get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: "+demoStudent.getId());
			
			Student myStudent = session.get(Student.class, demoStudent.getId());
			
			System.out.println("Get Complete: "+demoStudent);
			
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Commited!");
			
		} catch (Exception e) {
			factory.close();
		}
	}

	
}
