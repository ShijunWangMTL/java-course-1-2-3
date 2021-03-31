package polymorphicinterfacedemo;

public class PolymorphicInterfaceDemo
{
    public static void main(String[] args)
    {
        // create instances
        CompactDisc cd = new CompactDisc("Greatest Hits", "Joe Looney Band", 18.95);
        DvdMovie movie = new DvdMovie("Wheels of Fury", 137, 12.95);

        // display
        System.out.println("Item 1: " + cd.getTitle());
        showPrice(cd);
        System.out.println("Item 2: " + movie.getTitle());
        showPrice(movie);

    } // end main method

    // create showPrice method
    private static void showPrice(RetailItem item)
    {
        System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
    } // end showPrice method
} // end class
