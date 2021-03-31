// MaximumFinder.java
// Programmer-declared method maximum with three double parameters.
// obtain three floating-point values and determine maximum value

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        // create Scanner for input from command window
        Scanner input = new Scanner(System.in);
        double number1, number2, number3;
        double result;
        // prompt for and input three floating-point values
        System.out.print("Enter three floating-point values separated by spaces: ");
        number1 = input.nextDouble(); // read first double
        number2 = input.nextDouble(); // read second double
        number3 = input.nextDouble(); // read third double

        // determine the maximum value
        result = maximum(number1, number2, number3);
        // display maximum value
        System.out.println("Maximum is: " + result);
    } // end method main

    // returns the maximum of its three double parameters
    public static double maximum(double x, double y, double z) {
        double maximumValue;
        maximumValue = x; // assume x is the largest to start

        // determine whether y is greater than maximumValue
        if (y > maximumValue) {
            maximumValue = y;
        }

        // determine whether z is greater than maximumValue
        if (z > maximumValue) {
            maximumValue = z;
        }

        // return the maximumValue
        return maximumValue;
    } // end method maximum

} // end class MaximumFinder