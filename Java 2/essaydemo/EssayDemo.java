package essaydemo;

public class EssayDemo
{
    public static void main(String[] args)
    {
        // create instance
        Essay termPaper = new Essay(); // use default constructor

        termPaper.setScore(25.0, 18.0, 20.0, 25.0);

        System.out.println("Term Paper: ");
        System.out.println("Grammar Points: " + termPaper.getGrammar());
        System.out.println("Spelling Points: " + termPaper.getSpelling());
        System.out.println("Length Points: " + termPaper.getCorrectLength());
        System.out.println("Content Points: " + termPaper.getContent());
        System.out.println("Total Points: " + termPaper.getScore());
        System.out.println("Grade: " + termPaper.getGrade());

    } // end main method
} // end class
