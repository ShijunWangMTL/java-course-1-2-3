package aircraft;

public class RecreationalAircraft extends Aircraft
{
    // declare fields
    private int maxPassengerNum;

    // create constructor
    public RecreationalAircraft(String name, String year, int num)
    {
        super(name, year);
        this.maxPassengerNum = num;
    }

    // create methods
    public int getMaxPassengerNum()
    {
        return maxPassengerNum;
    }

    @Override
    public String toString()
    {
        String str;
        str = "Aircraft Name: " + getAircraftName()
                + "\nMaximum Number of Passengers: " + maxPassengerNum;
        return str;
    }

} // end class
