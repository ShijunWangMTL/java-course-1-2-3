package stockdemo1;

public class StockDemo1
{
    public static void main(String[] args)
    {
        // create objects
        Stock xyzCompany = new Stock("XYZ", 9.62);

        // calling toString method implicitly
        System.out.println(xyzCompany);

        // to call explicitly, use:
        //System.out.println(xyzCompany.toString());
    }
}
