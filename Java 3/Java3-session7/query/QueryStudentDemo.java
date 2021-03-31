package com.jac.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jac.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// create the session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create the session
		Session session = factory.getCurrentSession();
		
		try {			
			// 1. start a transaction
			session.beginTransaction();
			
			// 2. query student
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// 3. display the students
			displayStudents(theStudents);	
			/*	
			for(Student tempStudent : theStudents) {
				System.out.println(tempStudent);
			}
			*/
			
			// query students: lastName='Doe'
			theStudents = session.createQuery("from Student s where s.lastName='Doe'").getResultList();
			// display the students
			System.out.println("\n\nStudents who have last name of Doe: ");
			displayStudents(theStudents);
			
			// query students: lastName='Doe' OR fistName='Daffy'
			theStudents = session.createQuery("from Student s where s.lastName='Doe' OR s.firstName='Daffy'").getResultList();
			// display the students
			System.out.println("\n\nStudents who have last name of Doe or fistName of Daffy: ");
			displayStudents(theStudents);
			
			// query students: have email LIKE '%gmail.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();
			// display the students
			System.out.println("\n\nStudents who have email with 'gmail.com': ");
			displayStudents(theStudents);
			
			// query students: have email LIKE '%jac.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%jac.com'").getResultList();
			// display the students
			System.out.println("\n\nStudents who have email with 'jac.com': ");
			displayStudents(theStudents);						
						
					
			// 4. commit transaction
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}
	
	//net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
