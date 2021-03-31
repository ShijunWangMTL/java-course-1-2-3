package Java_I_Labs_03;

// One_feet_inch
/* Purpose: This program illustrates how input statements work
   Script Date: July 03, 2020
 */

 // import java package

import java.util.*;

 // declare a class
 public class One_feet_inch {
	 // create an instance of the Scanner class
	 static Scanner console = new Scanner(System.in);

	// main method begins execution of Java application
	public static void main(String[] args) {
		// declare variables
		int feet;
		int inches;

		// read data from a user entry
		System.out.println("Enter 2 integers seperated by spaces.");

		// store values into feet and inches
		feet = console.nextInt();
		inches = console.nextInt();

		// display out the variables and their values
		System.out.println("vsfeet = " + feet);
		System.out.println("inches = " + inches);

	} // end method main

 } // end class Welcome1

