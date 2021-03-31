package bankaccountandsavingsaccount;

// Declare a subclass of BankAccount class
public class SavingsAccount extends BankAccount
{
    // Declare class variables
    private boolean status;  // represent an active or inactive account.

    // Create the constructor
    public SavingsAccount(double balance, double rate)
    {
        super(balance, rate);
    }

    // Create setter and getter for status
    public void setStatus(double balance)
    {
        balance = super.getBalance();
        if (balance < 25.0)
            this.status = false;   // inactive account
        else
            this.status = true;   // active account
    }

    public boolean getStatus()
    {
        return this.status;
    }

    // Override withdraw method:
    public void withdraw(double amount)
    {
        this.setStatus(super.getBalance());
        if (status)
            super.withdraw(amount);
    }

    // Override deposit method:
    // determine whether the account is inactive before a deposit is made.
    // If the account is inactive and the deposit brings the balance above $25, the account becomes active again.
    // The deposit is then made by calling the superclass version of the method.
    public void deposit(double amount)
    {
        this.setStatus(super.getBalance());
        if (!status)
        {
            double balance = super.getBalance() + amount;
            if(balance >= 25.0)
            {
                this.setStatus(balance);
                super.deposit(amount);
            }
        }
        else
            super.deposit(amount);
    }
    /*  Question: if balance<25 after this deposit, account remains inactive, is deposit allowed?
        if deposit is allowed anyway, this method can be simplified as:
         public void deposit(double amount)
        {
            super.deposit(amount);
            this.setStatus(balance);
        }
    */


    // Override monthlyProcess method:
    // If the number of withdrawals for the month is more than 4, a service charge of $1 for
    // each withdrawal above 4 is added to monthly service charges.
    public void monthlyProcess()
    {
        double extraCharges = 0.0;
        if (getNumWithdrawals() > 4)
            extraCharges = (getNumWithdrawals() - 4) * 1.0;
        super.setMonthlyServiceCharge(extraCharges);
        super.monthlyProcess();
        this.setStatus(getBalance());
    }

    // Create a method to display the monthly statement.
    public void getStatement()
    {
        System.out.println("Monthly Statement:");
        System.out.println("------------------");
        System.out.printf("Monthly Interests: $%,.2f.\n", getMonthlyInterest());
        System.out.printf("Ending Balance: $%,.2f.\n", getBalance());
        if (getStatus() == true)
            System.out.println("Account Status: active.");
        else
            System.out.println("Account Status: inactive.");
    }

} // end class
