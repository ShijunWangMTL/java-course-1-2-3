package Java_I_Labs_05;

/** WeeklyWages.java
 * determines an employee�s weekly wages. If the hours worked
 * exceed 40, then wages include overtime payment.
 */

/**
 * @author: Khattar
*/

import java.util.*;

public class WeeklyWages {
    // decalre an instance of Scanners
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double wages, rate, hours;

        System.out.print("Enter the working " + "hours: ");
        hours = console.nextDouble();
        System.out.println();

        System.out.print("Enter the pay " + "rate: ");
        rate = console.nextDouble();
        System.out.println();

        // if an employee works more than 40 hours, the rate will be 1.5
        if (hours > 40.0) {
            wages = (40 * rate) + 1.5 * rate * (hours - 40);
        } //
        else {
            wages = hours * rate;
        }

        System.out.printf("The wages are $%.2f %n", wages);
        System.out.println();
    } // end method main

} // end class WeeklyWagess