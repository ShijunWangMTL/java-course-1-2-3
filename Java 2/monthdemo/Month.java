package monthdemo;

public class Month<month>
{
    // declare field
    private int monthNumber;

    // create constructors
    public Month()
    {
        this.monthNumber = 1;
    }

    public Month(int m)
    {
        if (m < 1 || m > 12)
        {
            this.monthNumber = 1;
        }
        else
        {
            this.monthNumber = m;
        }
    }

    public Month(String name)
    {
        if (name.equalsIgnoreCase("january"))
            monthNumber = 1;
        else if (name.equalsIgnoreCase("february"))
            monthNumber = 2;
        else if (name.equalsIgnoreCase("march"))
            monthNumber = 3;
        else if (name.equalsIgnoreCase("april"))
            monthNumber = 4;
        else if (name.equalsIgnoreCase("may"))
            monthNumber = 5;
        else if (name.equalsIgnoreCase("june"))
            monthNumber = 6;
        else if (name.equalsIgnoreCase("july"))
            monthNumber = 7;
        else if (name.equalsIgnoreCase("august"))
            monthNumber = 8;
        else if (name.equalsIgnoreCase("september"))
            monthNumber = 9;
        else if (name.equalsIgnoreCase("october"))
            monthNumber = 10;
        else if (name.equalsIgnoreCase("november"))
            monthNumber = 11;
        else if (name.equalsIgnoreCase("december"))
            monthNumber = 12;
        else
            monthNumber = 1;
    }

    public void setMonthNumber(int m)
    {
        if (m < 1 || m > 12)
        {
            this.monthNumber = 1;
        }
        else
        {
            this.monthNumber = m;
        }
    }

    public int getMonthNumber()
    {
        return this.monthNumber;
    }

    public String getMonthName()
    {
        String name;
        switch (monthNumber)
        {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            case 6:
                name = "June";
                break;
            case 7:
                name = "July";
                break;
            case 8:
                name = "August";
                break;
            case 9:
                name = "September";
                break;
            case 10:
                name = "October";
                break;
            case 11:
                name = "November";
                break;
            case 12:
                name = "December";
                break;
            default:
                name = "Unknown";
        }
        return name;
    }

    public String toString()
    {
        return this.getMonthName();
    }

    public boolean equals(Month month2)
    {
        boolean status;
        if (month2.getMonthNumber() == this.monthNumber)
            status = true;
        else
            status = false;
        return status;
    }

    public boolean greaterThan(Month month2)
    {
        boolean status;
        if (this.monthNumber > month2.getMonthNumber())
            status = true;
        else
            status = false;
        return status;
    }

    public boolean lessThan(Month month2)
    {
        boolean status;
        if (this.monthNumber < month2.getMonthNumber())
            status = true;
        else
            status = false;
        return status;
    }

} // end class
