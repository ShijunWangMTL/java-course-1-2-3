package com.jac.web.jdbc;

import java.io.IOException;
import java.io.PrintWriter;	// to use PrintWriter
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.sql.*;

import javax.annotation.Resource;   // to use @Resource annotation
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;	// to use DataSource

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	// define datasource/connection pool for Resource Injection
	@Resource(name="jdbc/web_student_tracker")	// import javax.annotation.Resource;
	private DataSource dataSource;	// import javax.sql.DataSource
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Step 1: set up the printwriter
		PrintWriter out = response.getWriter();	// import java.io.PrintWriter;
		response.setContentType("text/plain");
		
		// Step 2: get a connection to the database
		// import java.sql.*;
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = dataSource.getConnection();
			
			// Step 3: create SQL statements
			String sql = "select * from student";
			myStmt = myConn.createStatement();
			
			// Step 4: execute SQL query
			myRs = myStmt.executeQuery(sql);
			
			// Step 5: Process the result set 
			while (myRs.next()) {
				String email = myRs.getString("email");
				out.println(email);
			}
			
		} catch (Exception exc) {
			exc.printStackTrace();			
		}
		
	}

}
