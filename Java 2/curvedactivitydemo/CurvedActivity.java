package curvedactivitydemo;

public class CurvedActivity extends GradeActivity
{
    // declare fields
    double rawScore;
    double percentage;

    // create constructor
    public CurvedActivity(double percentage)
    {
        this.percentage = percentage;
        this.rawScore = 0.0;
    }

    // create inherited class methods
    @Override
    public void setScore(double s)
    {
        this.rawScore = s;
        super.setScore(this.rawScore * this.percentage); // revoke setScore from superclass
    }

    public double getRawScore()
    {
        return rawScore;
    }

    public double getPercentage()
    {
        return percentage;
    }

} // end class
