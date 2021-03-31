// InterestOne.java
/*
Consider the following problem statement:
A person invests $1000.00 in a savings account
yielding 5 percent interest. Assuming that all
interest is left on deposit in the account,
calculate and print the amount of money in the
account at the end of each year for 10 years.
Use the following formula for determining
these amounts:

	fv = pv (1 + r)^n

Where
	pv is the original amount invested (i.e., the principal or present value)
	r is the annual rate,
	n is the number of years, and
	fv is the amount on deposit at the end of the nth year (future value)

This problem involves a loop that performs the
indicated calculation for each of the 10 years
the money remains on deposit.
*/

public class InterestOne {
    // Initialization Phase

    public static void main(String[] args) {
        // Declaration Phase
        double RATE = 0.05; // Interest annual rate
        double PV = 1000.00; // present value of deposit before interest
        double fv; // future value at the end of each year
        int NUMBER_OF_YEARS = 10;
        // Processing Phase
        System.out.printf("%s%20s%n", "Year", "Amount on Deposit");
        System.out.printf("%s%20s%n", "====", "=================");

        // calculate amout on deposit (future value) for each year
        for (int year = 1; year <= NUMBER_OF_YEARS; year++) {
            /*
             * Math.pow(double x, double y) - returns the value of the first argument raised
             * by the power of the second argument
             */
            fv = PV * (Math.pow(1 + RATE, year));
            // Termination Phase
            // display the year and amount with interest
            System.out.printf("%4d%,20.2f%n", year, fv);
        } // end for loop

    } // end method main
} // end class InterestOne