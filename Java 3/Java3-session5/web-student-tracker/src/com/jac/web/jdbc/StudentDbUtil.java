package com.jac.web.jdbc;

import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

import javax.sql.DataSource;

public class StudentDbUtil {
	
	// declare a reference dataSource
	private DataSource dataSource;	// import javax.sql.DataSource;
	
	// constructor
	public StudentDbUtil(DataSource theDataSource) {
		dataSource = theDataSource; 
	}
	
	// methods
	// import java.util.List;
	public List<Student> getStudents() throws Exception{
		
		List<Student> students = new ArrayList<>();	// import java.util.List;
		
		//import java.sql.*;
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			// get a connection
			myConn = dataSource.getConnection();
			
			// create sql statement
			String sql = "select * from student order by last_name";
			
			myStmt = myConn.createStatement();
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			// process the result set
			while (myRs.next()) {
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
				
				// create a new student object
				Student tempStudent = new Student(id, firstName, lastName, email);
				
				// add to the list of students
				students.add(tempStudent);
			}
			return students;
			
		}
		finally {
			// close all the JDBC objects
			close(myConn, myStmt, myRs);
		}
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		try {
			if (myConn != null) {
				myConn.close();
			}
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}
	
}
