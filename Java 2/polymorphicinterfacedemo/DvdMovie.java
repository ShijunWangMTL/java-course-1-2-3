package polymorphicinterfacedemo;

public class DvdMovie implements RetailItem
{
    // declare fields
    private String title;
    private int runningTime;
    private double retailPrice;

    // create constructor
    public DvdMovie(String dvdTitle, int runTime, double dvdPrice)
    {
        title = dvdTitle;
        runningTime = runTime;
        retailPrice = dvdPrice;
    }

    // create methods
    public String getTitle()
    {
        return title;
    }

    public int getRunningTime()
    {
        return runningTime;
    }

    @Override
    public double getRetailPrice()
    {
        return retailPrice;
    }
} // end class
