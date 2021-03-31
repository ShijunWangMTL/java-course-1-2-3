package Java_I_Labs_04;

/** Addition.java
 * Addition program that inputs two numbers
 * then display their sum
*/

/**
 * @author: Khattar
*/

// import the class Scanner
import java.util.Scanner;

// declare the class Addition
public class Addition {
    // static Scanner input = new Scanner(System.in);
    /** main method begins execution of Java application */
    public static void main(String[] args) {
        /* 1) Decalration Phase */
        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2

        // reference variable (input)
        // Syntax: class_name object_name = new class_name()
        Scanner input = new Scanner(System.in);

        /* 2) Initialization Phase */
        // prompt the user to enter numbers
        System.out.print("Enter first number: ");
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second number: ");
        number2 = input.nextInt(); // read second number from user

        /* 3) Processing Phase */
        // add numbers, then store them in variable sum
        sum = number1 + number2;

        /* 4) Termination (Output) Phase */
        System.out.print("The sum of " + number1 +
		" and " + number2 + " is " + sum);
		System.out.print("\n");

    } // end method main
} // end class Addition