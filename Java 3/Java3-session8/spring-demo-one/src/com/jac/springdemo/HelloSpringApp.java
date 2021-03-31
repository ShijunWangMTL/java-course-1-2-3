package com.jac.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// 1. load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//<bean id="myCoach" class="com.jac.springdemo.TrackCoach">

		// 2. retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class); 
		//get bean by id "myCoach" and identify the interface ICoach.class
		
		// 3. call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call the new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// 4.close the context
		context.close();
	}

}

// output: 
// Run a hard 5K

