package com.jac.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// 1. Load Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScopes-applicationContext.xml");
		
		// 2. Retrieve bean from Spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		ICoach alphaCoach = context.getBean("myCoach", ICoach.class);
		
		// 3. Check if the two beans are the same
		boolean result = (theCoach == alphaCoach);
		
		// 4. Print the result
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// 5. Close the context
		context.close();
	}

}

/* output: (default bean scope - singleton)
	Pointing to the same object: true
	Memory location for theCoach: com.jac.springdemo.TrackCoach@f381794
	Memory location for alphaCoach: com.jac.springdemo.TrackCoach@f381794
*/
/* output: (bean scope - prototype)
	Pointing to the same object: false
	Memory location for theCoach: com.jac.springdemo.TrackCoach@f381794
	Memory location for alphaCoach: com.jac.springdemo.TrackCoach@2cdd0d4b
*/