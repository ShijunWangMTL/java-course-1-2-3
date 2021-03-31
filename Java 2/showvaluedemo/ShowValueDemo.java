package showvaluedemo;

public class ShowValueDemo
{
    public static void main(String[] args)
    {
        // create an instance of SubClass
        SubClass myObj = new SubClass();

        myObj.showValue(10); // overrided method from subclass
        myObj.showValue(12.5); // method from subclass
        myObj.showValue("Hello"); // method from superclass

    } // end main method
} // end class
