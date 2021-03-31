// ClassAverageSCR.java
// Solving the class-average problem using sentinel controlled repetition

/*
A class of ten students took a quiz. The grades (integers in the range 0–100) for this quiz are available to you. Determine the class average on the quiz.
*/
import java.util.Scanner; // program uses class Scanner

public class ClassAverageSCR {
    public static void main(String[] args) {
        // 1. declare control variable
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // 2. initialization phase
        int total = 0; // initialize sum of grades entered by the user
        int gradeCounter = 0; // initialize # of grade to be entered next
        int grade;
        double average;

        // 3. processing phase uses counter-controlled repetition
        // prompt for input and read grade from user
        System.out.print("Enter grade or -1 to quit: ");
        grade = input.nextInt();

        while (grade != -1) {
            total += grade;// Add grade into total
            gradeCounter++; // Add one to the grade counter

            // prompt for input and read grade from user
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();                       
        } // end while loop

        // 4. termination phase
        // if user entered at least one grade
        if (gradeCounter != 0) {
            average = (double) total / gradeCounter;
            // display total and average of grades (with two digits of precision)
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.println();
        } // end if block
        else // no grades were entered, so output appropriate message
        {
            System.out.println("No grades were entered");
        }
    } // end method main
} // end class ClassAverageCC