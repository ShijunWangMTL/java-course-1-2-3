package showvaluedemo;

public class SubClass extends SuperClass
{

    // create subclass methods
    // overriding
    @Override
    public void showValue(int arg)
    {
        System.out.println("SUBCLASS: The int argument was " + arg);
    }

    // overloading
    public void showValue(double arg)
    {
        System.out.println("SUBCLASS: The double argument was " + arg);
    }

} // end class
