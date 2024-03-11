package com.nath.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nath.hibernate.demo.entity.Instructor;
import com.nath.hibernate.demo.entity.InstructorDetail;
import com.nath.hibernate.demo.entity.Student;

public class DeleteInstructorDetailDemo {
	
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
			
			// get the instructor detail object
			int theId = 3;
			InstructorDetail tempInstructorDetail = 
					session.get(InstructorDetail.class, theId);
			
			// print the instructor detail
			System.out.println("tempInstructorDetail: "+tempInstructorDetail);
			
			// print the associated instructor
			System.out.println("The Associated instructor: " +
							tempInstructorDetail.getInstructor());
			
			// delete the instructor detail
			System.out.println("Deleting tempInstructorDetail: "
										+ tempInstructorDetail);
			
			// remove the associated object reference
			// break bi-directional link
			
			tempInstructorDetail.getInstructor().setInstructorDetail(null);
			
			session.delete(tempInstructorDetail);
			
			// commit a transaction
			session.getTransaction().commit();
			
			System.out.println("Commited!");
			
		} catch (Exception e) {
			e.printStackTrace();
			factory.close();
		}finally {
			// handle connection leak issue
			session.close();
			
			factory.close();
			
		}
	}

}
