// CustomerTesterOne.java
/*
	Developed By: Your Name
	Script Date: July 14, 2020
*/
// create 3 instances of Customer and invoke accessor methods

// create class CustomerTesterOne
public class CustomerTesterThree {

    public static void main(String args[]) {
        // define the reference variables
        Customer2 firstCustomer, secondCustomer, thirdCustomer;

        		// create three Customer instances with attribute values
		firstCustomer = new Customer2("Eleanor", "Atlanta", "123-4567");
		secondCustomer = new Customer2("Mike", "Boston", "467-1234");
		thirdCustomer = new Customer2("JoAnn", "St. Louis", "765-4321");

		// retrieve & display names for all three customers without using variables
				System.out.println("customer 1 name is " + firstCustomer.getName());
				System.out.println("customer 2 name is " + secondCustomer.getName());
		System.out.println("customer 3 name is " + thirdCustomer.getName());

    }// end method main
} // end class CustomerTesterOne
