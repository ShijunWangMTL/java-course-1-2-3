package Java_I_Labs_04;

// import java packages
import java.util.*;
import java.io.*;

public class InputOutput {

    // declare constant
    static final double PI = 3.14159;

    // main method begins execution of Java Application
    public static void main(String[] args) throws FileNotFoundException {
        /* 1) Decalration Phase */
        double length, width;
        double radius;
        String firstName, lastName;
        int age;
        double beginningBalance, interestRate;
        char ch;
        double parameter;
        double area, areaC;
        double circumference;
        double EOMBalance;

        Scanner inFile = new Scanner(new FileReader(
                "I:\\JAC_2020\\PV3_Java_1_July_2020\\Khattar_Programming_I_July_2020\\Java_I_Labs_04\\inData.txt"));
        PrintWriter outFile = new PrintWriter("outData.txt");

        /* 2. Initialization Phase */
        length = inFile.nextDouble();
        width = inFile.nextDouble();
        // radius of a circle
        radius = inFile.nextDouble();

        // firstname, lastname, and age
        firstName = inFile.next();
        lastName = inFile.next();
        age = inFile.nextInt();

        // starting balance and interest
        beginningBalance = inFile.nextDouble();
        interestRate = inFile.nextDouble();

        // initialiaze ch character
        ch = inFile.next().charAt(0);


        /* 3. Processing Phase */
        parameter = 2 * (length + width);
        area = length * width; // area of a rectangle
        circumference = 2 * PI * radius;
        areaC = PI * radius * radius; // area of a circle
        EOMBalance = beginningBalance * (1 + interestRate/(12 * 100));

        /* 4. Termination (Output) Phase */
        outFile.printf("Rectangle: %nLength = %.2f, width = %.2f" + ", area = %.2f, parameter = %.2f %n%n", length,
                width, area, parameter);

        outFile.printf("Circle: %nRadius = %.2f, area of circle = %.2f," + " circumference = %.2f%n%n", radius, areaC,
                circumference);

        outFile.println("Name: " + firstName + " " + lastName + ", age: " + age);

        outFile.printf("Beginning balance = $%.2f"
        + ", interest rate = %.2f%n"
        + "Balance at the end of the month = $%.2f%n%n",
       beginningBalance, interestRate,EOMBalance);

               outFile.println("The character that comes after " + ch
                     + " in the ASCII set is " + (char)((int)(ch) + 1));

        // close the outFile
        outFile.close();
    } // end main method
} // end class InputOutput