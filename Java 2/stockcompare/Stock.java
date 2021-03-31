package stockcompare;

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

    // create compare method
    public boolean equals(Stock object2)
    {
        boolean status;
        // determine whether this object's symbol and sharePrice
        // are equal to object2's symbol and sharePrice
        if(symbol.equals(object2.symbol) && sharePrice == object2.sharePrice)
        {
            status = true;
        }
        else
            {
                status = false;
            }
        return status;
    }


}