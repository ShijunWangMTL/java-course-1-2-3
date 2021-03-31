package Java_I_Labs_05;

/** PositiveNegative.java
 * returns the message Positive, Negative or zero number.
/**
 * @author: Khattar
*/

import java.util.*;

public class PositiveNegative {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double num;

        System.out.print("Enter a number: ");
        num = console.nextDouble();
        System.out.println();

        System.out.print("The number you entered is " + num + " and this is a ");

        if (num < 0) {
            System.out.println("negative number.");
        } // end if block
        else if (num > 0) {
            System.out.println("positive number.");
        } // end else if block
        else {
            System.out.println("zero");
        }
    } // end method main
} // end class PositiveNegative