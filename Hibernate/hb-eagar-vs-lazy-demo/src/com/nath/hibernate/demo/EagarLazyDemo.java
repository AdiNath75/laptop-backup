package com.nath.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nath.hibernate.demo.entity.Course;
import com.nath.hibernate.demo.entity.Instructor;
import com.nath.hibernate.demo.entity.InstructorDetail;
import com.nath.hibernate.demo.entity.Student;

public class EagarLazyDemo {
	
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			
			// start a transaction
			session.beginTransaction();
			
			// option 2: Hibernate query with HQL
			
			// get the instructor from db
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			System.out.println("Nath: Instructor: "+tempInstructor);
			
			System.out.println("Nath: Courses: "+tempInstructor.getCourses());

			
			// commit a transaction
			session.getTransaction().commit();
			
			// close the session
			session.close();
			
			System.out.println("\nSession is closed\n");
			
			// option 1: call getter method while session is open
			
			// get course for instructor
			System.out.println("Nath: Courses: "+tempInstructor.getCourses());
						
			
			System.out.println("Nath: Commited!");
			
		}
		finally {
			// add clean up
			
			session.close();
			factory.close();
		}
	}

}
