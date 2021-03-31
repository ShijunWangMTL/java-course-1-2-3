package com.jac.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// controller method to read form data and add the data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// 1. read request parameter from HTML form
		String theName = request.getParameter("studentName");
		
		// 2. convert the data to all caps
		theName = theName.toUpperCase();
		
		// 3. create the message
		String result = "Yo! " + theName;
		
		// 4. add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";

	}
	
	// Practice
	@RequestMapping("/pageTest")
	public String pageTest() {
		return "aNewPage";
	}
	
}
