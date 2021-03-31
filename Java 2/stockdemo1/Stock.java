package stockdemo1;

public class Stock
{

    // declare fields
    private String symbol;
    private double sharePrice;

    // create constructor with parameters
    public Stock(String sym, double price)
    {
        symbol = sym;
        sharePrice = price;
    }

    // create methods
    public String getSymbol()
    {
        return symbol;
    }

    public double getSharePrice()
    {
        return sharePrice;
    }

    public String toString()
    {
        String str = "Trading symbol: " + symbol + "\nShare price: " + sharePrice;
        return str;
    }


}
