package coursegradesinterfacedemo;

public class PassFailExam extends PassFailActivity
{
    // declare fields
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    // create constructor
    public PassFailExam(int questions, int missed, double minPassing)
    {
        super(minPassing);
        double numericScore;

        this.numQuestions = questions;
        this.numMissed = missed;

        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);
    }

    // create methods
    public double getPointsEach()
    {
        return pointsEach;
    }

    public int getNumMissed()
    {
        return numMissed;
    }

}
