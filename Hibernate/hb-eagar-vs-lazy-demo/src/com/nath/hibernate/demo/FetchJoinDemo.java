package com.nath.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.nath.hibernate.demo.entity.Course;
import com.nath.hibernate.demo.entity.Instructor;
import com.nath.hibernate.demo.entity.InstructorDetail;
import com.nath.hibernate.demo.entity.Student;

public class FetchJoinDemo {
	
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
			
			// get the instructor from db
			int theId = 1;
			
			Query<Instructor> query = 
					session.createQuery("select i from Instructor i "
										+"JOIN FETCH i.courses "
										+ "where i.id=:theInstructorId", 
										Instructor.class);
			
			// set a parameter on query
			query.setParameter("theInstructorId", theId);
			
			// execute query and get instructor
			Instructor tempInstructor = query.getSingleResult();
			
			System.out.println("Nath: Instructor: "+tempInstructor);
			
			
			// commit a transaction
			session.getTransaction().commit();
			
			// close the session
			session.close();
			
			System.out.println("\nSession is closed\n");
						
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
