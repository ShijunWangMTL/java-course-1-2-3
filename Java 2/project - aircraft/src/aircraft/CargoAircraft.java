package aircraft;

public class CargoAircraft extends Aircraft
{
    // declare fields
    private int capacityTonnage;

    // create constructor
    public CargoAircraft(String name, String year, int num)
    {
        super(name, year);
        this.capacityTonnage = num;
    }

    // create methods
    public int getCapacityTonnage()
    {
        return capacityTonnage;
    }

    @Override
    public String toString()
    {
        String str;
        str = "Aircraft Name: " + getAircraftName()
                + "\nCargo Capacity: " + capacityTonnage;
        return str;
    }

} // end class
