package com.jac.finalproject.book;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public class BookDAO {

	private List<Book> thebooks = new ArrayList<>();
	private Book abook = new Book();

	public List<Book> list() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			thebooks = session.createQuery("from Book").getResultList();
			//displayBooks();
		} finally {
			factory.close();
		}
		return thebooks;
	}


	public List<Book> showResult(HttpServletRequest request) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			String sql = "from Book s where s." + request.getParameter("searchBy") + " LIKE '%"
					+ request.getParameter("keyword") + "%'";
			System.out.println(sql);
			thebooks = session.createQuery(sql).getResultList();
			//displayBooks();
		} finally {
			factory.close();
		}
		return thebooks;
	}

	
	public void save(Book book) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			session.save(book);
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

	
	public void delete(int id) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			abook = session.get(Book.class, id);
			session.delete(abook);
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

	
	public Book edit(HttpServletRequest request) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			int id = Integer.parseInt(request.getParameter("id"));
			abook = session.get(Book.class, id);
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
		return abook;
	}

	
	public void update(Book book) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			session.update(book);
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

	// method for debugging
	private void displayBooks() {
		for (Book tempbook : thebooks) {
			System.out.println(tempbook);
		}
	}
	
}
