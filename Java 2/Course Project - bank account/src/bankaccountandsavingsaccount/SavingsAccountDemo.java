package bankaccountandsavingsaccount;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class SavingsAccountDemo
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Create an instance of SavingsAccount class
        SavingsAccount myAccount = new SavingsAccount(500.00, 0.02);

        // Create instances of Scanner class and File class and read deposit file
        File depositFile = new File("Deposits.txt");
        Scanner depositReader = new Scanner(depositFile);

        while (depositReader.hasNext())
            myAccount.deposit(depositReader.nextDouble());

        // Create instances of Scanner class and File class and read withdrawal file
        File withdrawalFile = new File("Withdrawals.txt");
        Scanner withdrawalReader = new Scanner(withdrawalFile);

        while (withdrawalReader.hasNext())
            myAccount.withdraw(withdrawalReader.nextDouble());

        // process monthly data
        myAccount.monthlyProcess();

        // display results
        myAccount.getStatement();

    } // end main method
} // end class
