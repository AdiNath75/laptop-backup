package com.nath.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nath.hibernate.demo.entity.Course;
import com.nath.hibernate.demo.entity.Instructor;
import com.nath.hibernate.demo.entity.InstructorDetail;
import com.nath.hibernate.demo.entity.Student;

public class DeleteCourseDemo {
	
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
			
			// get a course
			int theId = 10;
			Course tempCourse = session.get(Course.class, theId);
			
			// delete a course
			System.out.println("Deleting course: " +tempCourse);
			
			session.delete(tempCourse);
			
			// commit a transaction
			session.getTransaction().commit();
			
			System.out.println("Commited!");
			
		} catch (Exception e) {
			factory.close();
		}
		finally {
			// add clean up
			
			session.close();
			factory.close();
		}
	}

}
