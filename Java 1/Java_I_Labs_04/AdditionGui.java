package Java_I_Labs_04;

/** AdditionGui.java
Addition program that inputs two numbers
then displays their sum.*/

/**
 * @author: Khattar
*/

/* import java extension package */
import javax.swing.JOptionPane; //import class JOptionPane

public class AdditionGui {
    // main method begins execution of Java Application
    public static void main(String[] args) {
        /* 1. Declaration Phase */
        String firstNumber; // first string entered by user
        String secondNumber; // second string entered by user

        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2

        /* 2. Initialization Phase */
        /* read in first nuumber from a user as a string */
        firstNumber = JOptionPane.showInputDialog("Enter first integer");

        /* read in second nuumber from a user as a string */
        secondNumber = JOptionPane.showInputDialog("Enter second integer");

		/* 3. Processing Phase */
		/* convert numbers from type string to int */
		number1 = Integer.parseInt( firstNumber);
        number2 = Integer.parseInt( secondNumber);        
        
		// add the numbers
		sum = number1 + number2;

		/* 4. Termination (Output) Phase */
        //display result
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Addition Result", JOptionPane.INFORMATION_MESSAGE);

        // terminate app
        System.exit(0);
        
    } // end main method
} // end class AdditionGui