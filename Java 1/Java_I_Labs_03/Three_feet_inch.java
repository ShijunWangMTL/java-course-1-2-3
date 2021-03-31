package Java_I_Labs_03;

// Three_feet_inch
/* Purpose: This program illustrates how input statements work
   Script Date: July 03, 2020
 */

// import java package

import java.util.*;

// declare a class
public class Three_feet_inch {
    // create an instance of the Scanner class
    static Scanner console = new Scanner(System.in);

    // main method begins execution of Java application
    public static void main(String[] args) {
        // declare variables
        int feet;
        int inches;
        char ch;

        // initializa variables
        feet = 35;
        inches = 6;
        System.out.println("Total inches = " + (12 * feet + inches));

        // read data from a user entry

        System.out.print("Enter feet: ");
        feet = console.nextInt();

        System.out.println();

        System.out.print("Enter inches: ");
        inches = console.nextInt();

        ch = console.next().charAt(0);
        // display out the variables and their values
        System.out.println();
        System.out.print("Total inches = " + (12 * feet + inches));
    } // end method main

} // end class Welcome1
