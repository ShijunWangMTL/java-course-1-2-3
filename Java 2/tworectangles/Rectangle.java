package tworectangles;

public class Rectangle
{
    private double length;
    private double width;

    // no-arg constructor
    public Rectangle()
    {
        this.length = 0.0;
        this.width = 0.0;
    }

    // constructor with parameters
    public Rectangle(double len, double w)
    {
        this.length = len;
        this.width = w;
    }

    // setters are void methods
    public void setLength(double len)
    {
        length = len;
    }

    public void setWidth(double w)
    {
        width = w;
    }

    public void set(double len, double w)
    {
        length = len;
        width = w;
    }

    // getters
    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    // method to calculate area of rectangle
    public double getArea()
    {
        return this.length * this.width;
    }


}
