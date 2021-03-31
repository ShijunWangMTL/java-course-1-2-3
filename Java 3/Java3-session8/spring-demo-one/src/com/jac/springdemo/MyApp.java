package com.jac.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// 1. create the object
		ICoach theCoach = new BaseballCoach();
		
		// 2. use the object
		System.out.println(theCoach.getDailyWorkout());
		
		// 1. create the object
		ICoach theCoachTwo = new TrackCoach();
				
		// 2. use the object
		System.out.println(theCoachTwo.getDailyWorkout());
	}
}
