package com.nath.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nath.hibernate.demo.entity.Instructor;
import com.nath.hibernate.demo.entity.InstructorDetail;
import com.nath.hibernate.demo.entity.Student;

public class DeleteDemo {
	
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			
			// start a transaction
			session.beginTransaction();
			
			// get instructor by primary key
			int theId = 1;
			Instructor tempInstructor = 
					session.get(Instructor.class, theId);
					
			System.out.println("Found Instructor: "+tempInstructor);
			
			// delete instructor
			if(tempInstructor != null) {
				System.out.println("Deleting: "+tempInstructor);
				
				// Note: will delete associated details
				session.delete(tempInstructor);
			}
			
			// commit a transaction
			session.getTransaction().commit();
			
			System.out.println("Commited!");
			
		} catch (Exception e) {
			factory.close();
		}
	}

}
