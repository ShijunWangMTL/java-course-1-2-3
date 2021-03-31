package phonebookdemo;

public class PhoneBookEntry
{
    private String name;
    private String phoneNumber;

    // create constructor
    public PhoneBookEntry(String n, String pn)
    {
        this.name = n;
        this.phoneNumber = pn;
    }

    // create methods
    public void setName(String n)
    {
        this.name = n;
    }

    public void setPhoneNumber(String pn)
    {
        this.phoneNumber = pn;
    }

    public String getName()
    {
        return this.name;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }


} // end class
