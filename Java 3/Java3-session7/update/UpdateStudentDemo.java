package com.jac.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jac.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		// create the session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create the session
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 2;

			// start a transaction
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentId);
			Student myStudent = session.get(Student.class,  studentId);
			
			// update student
			System.out.println("Updating student... ");
			myStudent.setFirstName("Scooby");
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done! 1st");
			
			
			// update email for all students
			// get a new session
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// update
			System.out.println("Update email for all students... ");
			session.createQuery("update Student set email='foo@jac.com'").executeUpdate();
			
			session.getTransaction().commit();
			
			System.out.println("Done! 2nd");
			
		}
		finally {
			factory.close();
		}
	}

}
