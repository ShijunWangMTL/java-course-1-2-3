// ConvertLength.java
/**
 * Purpose: to convert and output the lengths given in feet and inches into centimeters.
 * Developed by: Shijun Wang
 * Script date: July 7, 2020
*/

// import java package
import java.util.*;

// declare a class
public class ConvertLength
{
	// create an instance of the Scanner class
	static Scanner keyboard = new Scanner(System.in);

	// declare constant
	static final int IN_PER_FT = 12;
	static final double CM_PER_IN = 2.54;

	// main method begins execution of java application
	public static void main(String[] args)
	{
		// declare variables
		int feet, inches, totalInches;
		double centimeters;

		// Get the length in feet and inches
		System.out.print("Enter an integer for feet: ");
		feet = keyboard.nextInt();
		System.out.print("Enter an integer for inches: ");
		inches = keyboard.nextInt();

		// Convert the length into total inches
		totalInches = feet * IN_PER_FT + inches;

		// Convert total inches into centimeters
		centimeters = totalInches * CM_PER_IN;

		// output
		System.out.println("The numbers you entered are " + feet + " for feet and " + inches + " for inches.");
		System.out.println("The total number of inches = " + totalInches);
		System.out.println("The number of centimeters = " + centimeters);

	} // end main method
} // end ConvertLength class

/*	Problem Analysis and Algorithm Design:
	1. Get the length in feet and inches.
	2. Convert the length into total inches.
	3. Convert total inches into centimeters.
	4. Output centimeters.
*/