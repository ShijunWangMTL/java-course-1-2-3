package aircraft;

public class AircraftDemo
{
    public static void main(String[] args)
    {
        // declare variables
        final int NUM_CRAFTS = 3;
        Aircraft[] aircrafts = new Aircraft[NUM_CRAFTS];

        aircrafts[0] = new Aircraft("Wright Flyer", "1903");
        aircrafts[1] = new RecreationalAircraft("Pegasus Quantum", "1996", 2);
        aircrafts[2] = new CargoAircraft("Antonov An-225", "1988", 640);

        // display
        System.out.println("Aircrafts Information: ");
        System.out.println("---------------------");
        for(int i=0;i<aircrafts.length;i++)
        {
            System.out.println("Aircraft " + (i+1) + ":\n" + aircrafts[i]);
            System.out.println();
        }

    } // end main method
} // end class
