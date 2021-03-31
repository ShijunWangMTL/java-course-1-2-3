package com.jac.finalproject.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateBook {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.buildSessionFactory();

		// create a session
		Session session = factory.getCurrentSession();
		
		try {
			
			int bookId = 5;
			
			// start transaction
			session.beginTransaction();
			
			// retrieve book by id
			System.out.println("\nGetting book with id: " + bookId);
			Book myBook = session.get(Book.class, bookId);
			System.out.println("\nThe book to be updated: " + myBook);
			
			// update
			System.out.println("Updating book ... ");
			myBook.setPublisher("another one");
			System.out.println("\nUpdated book: " + myBook);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}
		finally {
			factory.close();
		}

	}

}
