package com.nath.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nath.hibernate.demo.entity.Course;
import com.nath.hibernate.demo.entity.Instructor;
import com.nath.hibernate.demo.entity.InstructorDetail;
import com.nath.hibernate.demo.entity.Review;
import com.nath.hibernate.demo.entity.Student;

public class CreateCoursesAndStudentsDemo {
	
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			
			// start a transaction
			session.beginTransaction();
			
			// create a course
			Course tempCourse = new Course("Pacman - How to score 1M Points");
			
			// save the course
			System.out.println("\nSaving the course....");
			session.save(tempCourse);
			System.out.println("Saved the course: " +tempCourse);
			
			// create the students 
			Student tempStudent1 = new Student("John","Doe","john@nath.com");
			Student tempStudent2 = new Student("Mary","Public","mary@nath.com");
			
			// add students to course
			tempCourse.addStudent(tempStudent1);
			tempCourse.addStudent(tempStudent2);
			
			// save the students
			System.out.println("\nSaving Students");
			session.save(tempStudent1);
			session.save(tempStudent2);
			System.out.println("Saved Students: "+tempCourse.getStudents());
			
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
