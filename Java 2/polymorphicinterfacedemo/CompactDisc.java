package polymorphicinterfacedemo;

public class CompactDisc implements RetailItem
{
    // declare fields
    private String title;
    private String artist;
    private double retailPrice;

    // create constructor
    public CompactDisc(String cdTitle, String cdArtist, double cdPrice)
    {
        title = cdTitle;
        artist = cdArtist;
        retailPrice = cdPrice;
    }

    // create methods
    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    @Override
    public double getRetailPrice()
    {
        return retailPrice;
    }
} // end class
