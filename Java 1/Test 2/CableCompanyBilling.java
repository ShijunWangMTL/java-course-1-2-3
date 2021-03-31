// CableCompanyBilling.java
/*
    Developed by: Shijun Wang
    Script date: July 12, 2020
    Purpose: write a program to calculate a customer's bill for a cable company
*/

// import java package
import java.util.Scanner;
// declare a class
public class CableCompanyBilling {
    // create an instance of Scanner
    static Scanner input = new Scanner(System.in);
    // declare constants
    static final double R_BILL_PROC_FEE = 4.50;
    static final double R_BASIC_SERV_COST = 20.50;
    static final double R_COST_PREM_CHANNEL = 7.50;
    static final double B_BILL_PROC_FEE = 15.00;
    static final double B_BASIC_SERV_COST = 75.00;
    static final double B_BASIC_CONN_COST = 5.00;
    static final double B_COST_PREM_CHANNEL = 50.00;

    // main method
    public static void main(String[] args) {
        // declare variables
        int accountNumber;
        char customerType;
        int noOfPremChannels;
        int noOfBasicServConn;
        double amountDue;

        // display description of the program
        System.out.println("This program computes a cable bill.");
        // prompt user to enter information
        System.out.print("Enter the account number: ");
        accountNumber = input.nextInt();
        System.out.print("Enter the customer type(R or r for Residential,B or b for Business): ");
        customerType = input.next().charAt(0);

        // use switch to execute for different customer types
        switch(customerType) {
            case 'R':
            case 'r':
                System.out.print("Enter the number of premium channels: ");
                noOfPremChannels = input.nextInt();
                amountDue = R_BILL_PROC_FEE + R_BASIC_SERV_COST + R_COST_PREM_CHANNEL * noOfPremChannels;
                System.out.println("Account number: " + accountNumber);
                System.out.printf("%s%.2f%n", "Amount due: $", amountDue);
                break;
            case 'B':
            case 'b':
                System.out.print("Enter the number of basic service connections: ");
                noOfBasicServConn = input.nextInt();
                System.out.print("Enter the number of premium channels: ");
                noOfPremChannels = input.nextInt();
                if(noOfBasicServConn <= 10) {
                    amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + B_COST_PREM_CHANNEL * noOfPremChannels;
                }
                else {
                    amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + B_BASIC_CONN_COST * (noOfBasicServConn - 10) + B_COST_PREM_CHANNEL * noOfPremChannels;
                }
                // end if else statement
                System.out.println("Account number: " + accountNumber);
                System.out.printf("%s%.2f%n", "Amount due: $", amountDue);
                break;
            default:
                System.out.println("Invalid customer type!");
        } // end switch

    } // end main method
} // end CableCompanyBilling class

/*
    Algorithm:
    1. Prompt user to enter account number;
    2. Get account number;
    3. Prompt user to enter customer type;
    4. Get customer type;
    5. If R/r type:
        5.1. Prompt user to enter number of premium channels;
        5.2. Get number of premium channels;
        5.3. Use formula to calculate amountDue;
        5.4. display account number and amountDue;
    6. If B/b type:
        5.1. Prompt user to enter number of basic service connections;
        5.2. Get number of basic service connections;
        5.3. Prompt user to enter number of premium channels;
        5.4. Get number of premium channels;
        5.5. Use formula to calculate amountDue;
        5.6. display account number and amountDue;
    7. If other character than R/r/B/b, display "invalid" message.
*/