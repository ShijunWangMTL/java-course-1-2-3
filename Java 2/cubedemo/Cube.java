package cubedemo;

// declare a subclass
public class Cube extends Rectangle
{
    private double height;

    // create subclass constructor
    public Cube(double len, double w, double h)
    {
        super(len, w); // invoke superclass constructor
        this.height = h;
    }

    // create methods
    public double getHeight()
    {
        return height;
    }

    public double getSurfaceArea()
    {
       return 2 * (getLength() * getWidth() + getWidth() * this.height + getLength() * this.height);
    }

    public double getVolume()
    {
        return getArea() * this.height;
    }
    // end methods

} // end class
