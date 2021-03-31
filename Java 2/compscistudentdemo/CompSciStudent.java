package compscistudentdemo;

public class CompSciStudent extends Student
{
    // declare constants
    private final int MATH_HOURS = 20, CS_HOURS = 40, GEN_ED_HOURS = 60;

    // declare fields
    private int mathHours, csHours, genEdHours;

    // create constructor
    public CompSciStudent(String n, String id, int year)
    {
        super(n, id, year); // invoke the constructor of superclass
    }

    // create methods
    public void setMATH_HOURS(int math)
    {
        this.mathHours = math;
    }

    public void setCS_HOURS(int cs)
    {
        this.csHours = cs;
    }

    public void setGenEdHours(int genEd)
    {
        this.genEdHours = genEd;
    }

    @Override
    public String toString()
    {
        String str;
        str = super.toString() + "\nMajor: Computer Science" +
                "\nMath Hours Taken: " + mathHours +
                "\nComputer Science Hours Taken: " + csHours +
                "\nGeneral Ed Hours Taken: " + genEdHours;
        return str;
    }

    @Override
    public int getRemainingHours()
    {
        int reqHours, remainingHours;
        reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
        remainingHours = reqHours - ( mathHours + csHours + genEdHours);
        return remainingHours;
    }

} // end class
