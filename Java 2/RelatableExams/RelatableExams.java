package RelatableExams;

public class RelatableExams
{
    public static void main(String[] args)
    {
        // create instances of class FinalExam
        FinalExam exam1 = new FinalExam(100, 20);
        FinalExam exam2 = new FinalExam(100, 30);
        // display scores of exam1 and exam2
        System.out.println("Exam 1: " + exam1.getScore());
        System.out.println("Exam 2: " + exam2.getScore());
        // call methods
        if(exam1.equals(exam2))
            System.out.println("The exam scores are equal.");
        if(exam1.isGreater(exam2))
            System.out.println("The exam 1 score is the highest.");
        if(exam1.isLess(exam2))
            System.out.println("The exam 1 score is the lowest.");

    } // end main method
} // end class
