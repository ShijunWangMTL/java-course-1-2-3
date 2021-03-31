package interfacedemo;

public class Person implements displayable
{
    // declare fields
    private String name;

    // constructor
    public Person(String n)
    {
        this.name = n;
    }

    // override method from interface
    @Override
    public void display()
    {
        System.out.println("The name is: " + this.name);
    }

} // end class
