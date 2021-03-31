package com.jac.finalproject.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddBook {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.buildSessionFactory();

		// create a session
		Session session = factory.getCurrentSession();

		try {

			// create a new Book object
			System.out.println("Creating new book object ...");
			Book tempBook = new Book("A NEW BOOK", "A NEW AUTHOR", "ONE PUBLISHER", "20201122");

			// start transaction
			session.beginTransaction();

			// save the object
			System.out.println("saving the book ...");
			session.save(tempBook);
			System.out.println("Saved book: " + tempBook);

			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");

		} finally {
			factory.close();
		}

	}

}
