package objectarray;

public class InventoryItem
{
    private String description;
    private int units;

    // no-arg constructor
    public InventoryItem()
    {
        description = "";
        units = 0;
    }

    // constructor with one argument
    public InventoryItem(String d)
    {
        description = d;
        units = 0;
    }

    // constructor with two arguments
    public InventoryItem(String d, int u)
    {
        description = d;
        units = u;
    }

    // setter methods
    public void setDescription(String d)
    {
        description = d;
    }

    public void setUnits(int u)
    {
        units = u;
    }

    // getter methods
    public String getDescription()
    {
        return description;
    }

    public int getUnits()
    {
        return units;
    }


} // end class
