package com.nath.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nath.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

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
			System.out.println("Creating 3 Student object");
			Student demoStudent1 = new Student("Adinath", "Puri", "adi@nath.com");
			Student demoStudent2 = new Student("Yash", "Joshi", "yash@nath.com");
			Student demoStudent3 = new Student("Saurav", "Khambe", "saurav@nath.com");
			Student demoStudent4 = new Student("Jay", "Shinde", "jay@nath.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save a student object
			System.out.println("Saving a student...");
			session.save(demoStudent1);
			session.save(demoStudent2);
			session.save(demoStudent3);
			session.save(demoStudent4);
			
			// commit a transaction
			session.getTransaction().commit();
			
			System.out.println("Commited!");
				
			} catch (Exception e) {
				factory.close();
			}
		}
}

