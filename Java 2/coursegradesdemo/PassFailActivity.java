package coursegradesdemo;

public class PassFailActivity extends GradedActivity
{
    // declare fields
    private double minPassingScore;

    // create constructor
    public PassFailActivity (double mps)
    {
        this.minPassingScore = mps;
    }

    // override superclass method
    @Override
    public char getGrade()
    {
        char letterGrade;
        if(super.getScore() >= this.minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';
        return letterGrade;
    }

} // end class
