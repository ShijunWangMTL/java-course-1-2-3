package polymorphic;

public class Polymorphic
{
    public static void main(String[] args)
    {
        // declare arrayList for GradedActivity
        GradedActivity[] tests = new GradedActivity[3];

        // initializing
        tests[0] = new GradedActivity(); // superclass
        tests[0].setScore(95);

        tests[1] = new PassFailExam(20, 5, 60); // subclass of PassFailActivity, which is subclass of GradedActivity

        tests[2] = new FinalExam(50, 7); // subclass of GradedActivity

        // use for loop to display the arrayList
        for(int i=0;i<tests.length;i++)
        {
            System.out.println("Test " + (i+1) + " : " + tests[i].getScore()
                        + ", grade " + tests[i].getGrade());
        }

        // to call method from PassFailExam class, use class name with parentheses
        System.out.println(((PassFailExam)tests[1]).getPointsEach());

    } // end main method
} // end class
