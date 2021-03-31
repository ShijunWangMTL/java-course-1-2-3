package aircraft;

public class Aircraft
{
    // declare fields
    private String aircraftName;
    private String aircraftYear;

    // create constructor
    public Aircraft(String name, String year)
    {
        this.aircraftName = name;
        this.aircraftYear = year;
    }

    // create methods
    public String getAircraftName()
    {
        return aircraftName;
    }

    public String getAircraftYear()
    {
        return aircraftYear;
    }

    public String toString()
    {
        String str;
        str = "Aircraft Name: " + aircraftName
                + "\nAircraft Year: " + aircraftYear;
        return str;
    }

} // end class
