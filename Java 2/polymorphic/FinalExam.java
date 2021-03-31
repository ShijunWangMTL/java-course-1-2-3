package polymorphic;

public class FinalExam extends GradedActivity
{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    // create constructor
    public FinalExam(int questions, int missed)
    {
        double numericScore;
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);
    } // end constructor

    // create methods
    public double getPointsEach()
    {
        return pointsEach;
    }

    public int getNumMissed()
    {
        return numMissed;
    }
    // end methods

} // end class