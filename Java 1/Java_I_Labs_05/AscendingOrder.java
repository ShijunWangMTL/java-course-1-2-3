package Java_I_Labs_05;

/** AscendingOrder.java
 * returns numbers in ascending order.
*/

/**
 * @author: Khattar
*/


/* prompt user to enter 3 numbers and then compare them  */

import java.util.*;

public class AscendingOrder {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double num1, num2, num3;
        double temp;

        System.out.print("Enter the three numbers: ");

        num1 = console.nextDouble();
        num2 = console.nextDouble();
        num3 = console.nextDouble();

        System.out.println();

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // Now num1 is less than or equal to num2

        System.out.print("The numbers in nondescending order are: ");

        if (num3 <= num1) {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else {
            System.out.println(num1 + " " + num2 + " " + num3);
        }

    } // end method main
} // end class MaxNumber