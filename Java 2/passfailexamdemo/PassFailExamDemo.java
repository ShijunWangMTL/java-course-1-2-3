package passfailexamdemo;

import java.util.Scanner;

public class PassFailExamDemo
{
    public static void main(String[] args)
    {
        // declare variables
        int questions, missed;
        double minPassing;

        // prompt user to enter data
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many questions are on the exam? ");
        questions = keyboard.nextInt();

        System.out.print("How many questions did the student miss? ");
        missed = keyboard.nextInt();

        System.out.print("What is the minimum passing score? ");
        minPassing = keyboard.nextDouble();

        // create an instance of class PassFailExam
        PassFailExam exam = new PassFailExam(questions, missed, minPassing);

        System.out.println("Each question counts " + exam.getPointsEach() + " point.");
        System.out.println("The exam score is " + exam.getScore());
        System.out.print("The exam grade is " + exam.getGrade());

    } // end main method
} // end class
