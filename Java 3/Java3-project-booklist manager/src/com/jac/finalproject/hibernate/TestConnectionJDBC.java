package com.jac.finalproject.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnectionJDBC {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/book_tracker?useSSL=false&serverTimezone=UTC";
		String user = "jacstudent";
		String pass = "studentjac";

		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Database connection successful!");
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}
}
