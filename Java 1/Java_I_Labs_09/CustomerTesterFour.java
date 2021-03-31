// CustomerTesterOne.java
/*
	Developed By: Your Name
	Script Date: July 14, 2020
*/
// create 3 instances of Customer and invoke accessor methods

// create class CustomerTesterOne
public class CustomerTesterFour {

    public static void main(String args[]) {
        // define the reference variables
        Customer2 firstCustomer, secondCustomer, thirdCustomer;

        		// create three Customer instances with attribute values
		firstCustomer = new Customer2("Eleanor", "Atlanta", "123-4567");
		secondCustomer = new Customer2("Mike", "Boston", "467-1234");
		thirdCustomer = new Customer2("JoAnn", "St. Louis", "765-4321");

		// invoke tellAbutSelf for all three customers & display
		System.out.println(firstCustomer.tellAboutSelf());
		System.out.println(secondCustomer.tellAboutSelf());
		System.out.println(thirdCustomer.tellAboutSelf());

    }// end method main
} // end class CustomerTesterOne
