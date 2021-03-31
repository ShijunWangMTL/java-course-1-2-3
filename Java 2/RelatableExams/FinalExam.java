package RelatableExams;

public class FinalExam extends GradedActivity implements Relatable
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

    // override methods from interface Relatable
    @Override
    public boolean equals(GradedActivity g)
    {
        boolean status;
        if (this.getScore() == g.getScore())
            status = true;
        else
            status = false;
        return status;
    }

    public boolean isGreater(GradedActivity g)
    {
        boolean status;
        if (this.getScore() > g.getScore())
            status = true;
        else
            status = false;
        return status;
    }

    public boolean isLess(GradedActivity g)
    {
        boolean status;
        if (this.getScore() < g.getScore())
            status = true;
        else
            status = false;
        return status;
    }

} // end class