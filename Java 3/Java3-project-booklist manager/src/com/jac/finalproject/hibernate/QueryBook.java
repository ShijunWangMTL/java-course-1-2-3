package com.jac.finalproject.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryBook {

	public static void main(String[] args) {
		// create the session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.buildSessionFactory();

		// create the session
		Session session = factory.getCurrentSession();

		List<Book> books = new ArrayList<Book>();
		
		try {
			// 1. start a transaction
			session.beginTransaction();

			// 2. query all books
			books = session.createQuery("from Book").getResultList();

			// 3. display the books
			displayBooks(books);

			// query book whose author is J. K. Rowling
			books = session.createQuery("from Book s where s.author='j. k. rowling'").getResultList();


			// display books whose author is J. K. Rowling
			System.out.println("\n\nBooks who have the author J. K. Rowling: ");
			displayBooks(books);

			// query books published in 2020
			books = session.createQuery("from Book s where s.publishDate LIKE '2020%'").getResultList();
			// display the books
			System.out.println("\n\nBooks published in 2020: ");
			displayBooks(books);

			// 4. commit transaction
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

	private static void displayBooks(List<Book> books) {
		for (Book tempBook : books) {
			System.out.println(tempBook);
		}
	}

}
