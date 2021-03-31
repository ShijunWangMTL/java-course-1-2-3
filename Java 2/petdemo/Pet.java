package petdemo;

public class Pet 
{
    private String name;
    private String type;
    private int age;

    public void setName(String n)
    {
        this.name = n;
    }
    public void setType(String t)
    {
        this.type = t;
    }
    public void setAge(int a)
    {
        this.age = a;
    }
    
    public String getName()
    {
        return this.name;
    }
    public String getType()
    {
        return this.type;
    }
    public int getAge()
    {
        return this.age;
    }
}