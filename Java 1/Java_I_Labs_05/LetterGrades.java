package Java_I_Labs_05;

/** LetterGrades.java
 * LetterGrades class uses switch statement to count letter grades.
*/

/**
 * @author: Khattar
*/

import java.util.Scanner;

public class LetterGrades
{
    public static void main(String[] args)
    {
       int total = 0; // sum of grades
       int gradeCounter = 0; // number of grades entered
       int aCount = 0; // count of A grades
       int bCount = 0; // count of B grades
       int cCount = 0; // count of C grades
       int dCount = 0; // count of D grades
       int fCount = 0; // count of F grades
        int grade;
       Scanner input = new Scanner(System.in);

       System.out.println("Please enter a grade");
        grade = input.nextInt();

        //  increment appropriate letter-grade counter

        switch (grade) {
            case 90:
            case 100:
                System.out.println("Passed! Excellent Job");
                break;
            case 80:
            	System.out.println("Passed! Well done");
            	break;
            case 70:
            	System.out.println("Passed! Good Job");
            	break;
            case 60:
            	System.out.println("Passed!");
            	break;
            default: //grade less than 60
            	System.out.println("Faild! Retake the course");
            	break;
        } // end switch
    } // end method main
} // end class LetterGrades