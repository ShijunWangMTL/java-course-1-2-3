package compscistudentdemo;

public abstract class Student
{
    // declare fields
    private String name;
    private String idNumber;
    private int yearAdmitted;

    // create instructor
    public Student(String n, String id, int year)
    {
        this.name = n;
        this.idNumber = id;
        this.yearAdmitted = year;
    }

    // create method
    public String toString()
    {
        String str;
        str = "Name: " + name
                + "\nID: " + idNumber
                + "\nYear Admitted: " + yearAdmitted;
        return str;
    }

    // create abstract method
    public abstract int getRemainingHours();

} // end class
