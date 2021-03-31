// ClassAverageCCR.java
// Solving the class-average problem using counter-controlled repetition

/*
A class of ten students took a quiz. The grades (integers in the range 0–100) for this quiz are available to you. Determine the class average on the quiz.
*/
import java.util.Scanner; // program uses class Scanner

public class ClassAverageCCR {
    public static void main(String[] args) {
        // 1. declare control variable
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // 2. initialization phase
        int total = 0; // initialize sum of grades entered by the user
        int gradeCounter = 1; // initialize # of grade to be entered next
        int StudentCount = 10; // number of students
        int grade; 
        int average; 
        // 3. processing phase uses counter-controlled repetition
        while (gradeCounter <= StudentCount) // loop 10 times
        {
            System.out.print("Enter student grade"); //prompt
            grade = input.nextInt(); // input next grade
            total += grade;// Add grade into total

            gradeCounter++; // Add one to the grade counter
        } // end while loop

        // 4. termination phase
        average = total / StudentCount; // integer division yields integer result

        // display total and average of grades
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
        System.out.println();
    } // end method main
} // end class ClassAverageCC