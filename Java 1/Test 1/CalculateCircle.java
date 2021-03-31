// CalculateCircle.java
/**
 * Purpose: use a given radius to calculate diameter, circumference and area of a circle
 * Developed by: Shijun Wang
 * Script date: July 7, 2020
*/

// import java package
import java.util.*;

// declare a class
public class CalculateCircle
{
	// create an instance of the Scanner class
	static Scanner keyboard = new Scanner(System.in);

	// main method begins execution of java application
	public static void main(String[] args)
	{
		// declare variables
		int radius, diameter;
		double circumference, area;

		// initialize variables
		System.out.print("Enter an integer for radius: ");
		radius = keyboard.nextInt();

		// process data
		diameter = radius * 2;
		circumference = 2 * Math.PI * radius; // predefined constant Math.PI
		area = Math.PI * radius * radius;

		// output results
		System.out.printf("The diameter of the circle = %d%nThe circumference of the circle = %.2f%nThe area of the circle = %.2f%n%n", diameter, circumference, area);

	} // end main method

} // end CalculateCircle