package coursegradesinterfacedemo;

public class CourseGrades implements Analyzable
{
    // declare fields
    public final int NUM_GRADES = 4;
    private GradedActivity[] grades;

    // create constructor
    public CourseGrades()
    {
        // initialize grades
        grades = new GradedActivity[NUM_GRADES];
    }

    // create methods
    public void setLab(GradedActivity aLab)
    {
        grades[0] = aLab;
    }

    public void setPassFailExam(PassFailExam aPassFailExam)
    {
        grades[1] = aPassFailExam;
    }

    public void setEssay(Essay anEssay)
    {
        grades[2] = anEssay;
    }

    public void setFinalExam(FinalExam aFinalExam)
    {
        grades[3] = aFinalExam;
    }

    @Override
    public double getAverage()
    {
        double total = 0.0;
        double average;

        for (int i = 0; i < grades.length; i++)
        {
            total += grades[i].getScore();
        }
        average = total / grades.length;
        return average;
    }

    @Override
    public GradedActivity getHighest()
    {
        double highScore = grades[0].getScore();
        int index = 0;

        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i].getScore() > highScore)
            {
                highScore = grades[i].getScore();
                index = i;
            }
        }
        return grades[index];
    }

    @Override
    public GradedActivity getLowest()
    {
        double lowScore = grades[0].getScore();
        int index = 0;

        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i].getScore() < lowScore)
            {
                lowScore = grades[i].getScore();
                index = i;
            }
        }
        return grades[index];
    }

    @Override
    public String toString()
    {
        String str;
        str = "Lab Score: " + grades[0].getScore() + "\tGrade: " + grades[0].getGrade()
                + "\nPass/Fail Exam: " + grades[1].getScore() + "\tGrade: " + grades[1].getGrade()
                + "\nEssay: " + grades[2].getScore() + "\tGrade: " + grades[2].getGrade()
                + "\nFinal Exam: " + grades[3].getScore() + "\tGrade: " + grades[3].getGrade();
        return str;
    }


} // end class
