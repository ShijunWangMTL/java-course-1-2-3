package Java_I_Labs_03;

// PersonInfo
/* Purpose: This program illustrates how to read strings and numeric data
   Script Date: July 03, 2020
 */

// import java package

import java.util.*;

// declare a class
public class PersonInfo {
    // create an instance of the Scanner class
    static Scanner console = new Scanner(System.in);

    // main method begins execution of Java application
    public static void main(String[] args) {
        // declare variables
        String firstName;
        String lastName;

        int age;
        double weight;

        // initialize variables
        System.out.println("Enter first name, last name, " 
                        + "age, and wieght seperated " 
                        + "by spaces. ");

        firstName = console.next();
        lastName = console.next();
        age = console.nextInt();
        weight = console.nextDouble();

        // display out values
        System.out.println("Name: " + firstName + " " + lastName);

        System.out.println("Age: " + age);
        System.out.println("Weigth: " + weight);

    } // end method main

} // end class Welcome1
