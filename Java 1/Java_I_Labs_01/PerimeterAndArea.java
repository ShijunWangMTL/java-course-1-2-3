// PerimeterAndArea.java


// design an algorithm to find the perimeter and area of a rectangle.

/*
The algorithm to find the perimeter and area of the rectangle is:
1. Get the length of the rectangle.
2. Get the width of the rectangle.
3. Find the perimeter using the following equation:
	perimeter = 2  (length + width)
4. Find the area using the following equation:
	area = length  width
*/

// declare PerimeterAndArea class
public class PerimeterAndArea {
	// main method begins execution of Java application
	public static void main(String[] args) {
		// declare variables
		int length; // the length of the rectangle
		int width; // the width of the rectangle
		int perimeter; // the perimeter of the rectangle
		int area; // the area of the rectangle

		// initialize variables
		length = 1;
		width = 2;

		// Find the perimeter using the following equation
		perimeter = 2 * (length + width);

		// Find the area using the following equation:
		area = length * width;

		// display the result
		System.out.println("the perimeter of the rectangle is: " + perimeter);
		System.out.println("");
		System.out.println("the area of the rectangle is: " + area);
	} // end method main

} // end class PerimeterAndArea