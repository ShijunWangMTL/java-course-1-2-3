package compscistudentdemo;

public class CompSciStudentDemo
{
    public static void main(String[] args)
    {
        // create an instance of CompSciStudent
        CompSciStudent csStudent = new CompSciStudent("John Doe", "1234", 2012);

        // initialization
        csStudent.setMATH_HOURS(50);
        csStudent.setCS_HOURS(12);
        csStudent.setGenEdHours(20);

        // display
        System.out.println(csStudent);
        System.out.println("Remaining Hours: " + csStudent.getRemainingHours());

    } // end main method
} // enc class
