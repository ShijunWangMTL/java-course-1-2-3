package bankaccountandsavingsaccount;

/** Program purpose: Design BankAccount class and SavingsAccount to manipulate data for account activities.
 *  Developed by: Shijun Wang.
 *  Script date: August 20, 2020.
 */

// Declare an abstract class
public abstract class BankAccount
{
    // Declare class variables
    private double balance;  // store the account balance
    private int numDeposits;  // store the number of deposits this month
    private int numWithdrawals;  // store the number of withdrawals this month
    private double annualInterestRate;  // store the annual interest rate
    private double monthlyServiceCharge;  // store the monthly service charges
    private double monthlyInterest;  // store the monthly interest earned based on the ending balance

    // Create the constructor, accept arguments for the starting balance and annual interest rate.
    public BankAccount(double balance, double rate)
    {
        this.balance = balance;
        this.annualInterestRate = rate;
    }

    // Create getBalance method
    public double getBalance()
    {
        return this.balance;
    }

    // Create deposit method: accept an argument for the amount of the deposit
    public void deposit(double amount)
    {
        this.balance += amount;
        this.numDeposits++;
    }

    public int getNumDeposits()
    {
        return this.numDeposits;
    }

    // Create withdraw method:  accept an argument for the amount of the withdrawal
    public void withdraw(double amount)
    {
        this.balance -= amount;
        this.numWithdrawals++;
    }

    public int getNumWithdrawals()
    {
        return this.numWithdrawals;
    }

    // Create setter and getter for monthlyServiceCharge
    public void setMonthlyServiceCharge(double charge)
    {
        this.monthlyServiceCharge = charge;
    }
    public double getMonthlyServiceCharge()
    {
        return this.monthlyServiceCharge;
    }

    // Create calcInterest method:
    // calculate monthly interest earned and add this interest to the balance.
    public void calcInterest()
    {
        this.monthlyInterest = this.annualInterestRate / 12 * this.balance;
        this.balance += this.monthlyInterest;

    }

    // Create a method to return monthly interest
    public double getMonthlyInterest()
    {
        return this.monthlyInterest;
    }

    // Create monthlyProcess method:
    // subtract the monthly service charges from the balance, calls the calcInterest method,
    // then sets number of withdrawals,number of deposits, and monthly service charges to zero.
    public void monthlyProcess()
    {
        this.balance -= this.monthlyServiceCharge;
        this.calcInterest();
        this.numWithdrawals = 0;
        this.numDeposits = 0;
        this.monthlyServiceCharge = 0.0;
    }

} // end class
