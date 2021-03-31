package curvedactivitydemo;

import java.util.Scanner;

public class CurvedActivityDemo
{
    public static void main(String[] args)
    {
        double score, curvePercent;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the student's raw numeric score: ");
        score = keyboard.nextDouble();
        System.out.print("Enter the curve percentage: ");
        curvePercent = keyboard.nextDouble();

        // declare an instance of class CurvedActivity
        CurvedActivity curvedExam = new CurvedActivity(curvePercent);

        curvedExam.setScore(score);

        System.out.println("The raw score is " + curvedExam.getRawScore() + " points.");
        System.out.println("The curved score is " + curvedExam.getScore() + " points.");
        System.out.println("The final grade is " + curvedExam.getGrade() + ".");


    } // end main method
} // end class
