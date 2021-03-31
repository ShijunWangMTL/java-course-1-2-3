package  weeklypay;

public class Pay
{
    // create a method
    public static double getWeeklyPay(int hours, double payRate)
    {
        return hours * payRate;
    }

    // create a method
    public static double getWeeklyPay(double yearlySalary)
    {
        return yearlySalary / 52;
    }
}
