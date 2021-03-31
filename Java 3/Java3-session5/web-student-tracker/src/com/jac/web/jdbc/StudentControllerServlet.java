package com.jac.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDbUtil StudentDbUtil;
	
	// define datasource/connection pool for Resource Injection
	@Resource(name="jdbc/web_student_tracker")	// import javax.annotation.Resource;
	private DataSource dataSource;	// import javax.sql.DataSource
	
	
	
	@Override
	// init() method is called by JAVA EE server - tomcat, when the servlet is first loaded or initialized
	public void init() throws ServletException {
		super.init();
		// create student db util, and pass in the conn pool/datasource
		try {
			StudentDbUtil = new StudentDbUtil(dataSource);
		} 
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}




	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// list the students .. in mvc fashion
		try {
			listStudents(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}




	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get students from db util
		List<Student> students = StudentDbUtil.getStudents();
		
		// add students to the request
		request.setAttribute("STUDENT_LIST", students);
		
		// send to JSP page(view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
		dispatcher.forward(request,  response);
			
	}

}
