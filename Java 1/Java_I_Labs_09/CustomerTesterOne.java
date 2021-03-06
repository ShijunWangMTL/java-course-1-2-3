// CustomerTesterOne.java
/*
	Developed By: Your Name
	Script Date: July 14, 2020
*/

// create class CustomerTesterOne
public class CustomerTesterOne {

	public static void main(String args[]) {
		// declare an instance of Customer
		Customer firstCustomer = new Customer();

		//define variables to contain attribute values retrieved
		String customerName, customerAddress, customerPhoneNo;

		// invoke set accessors to populate attributes
		firstCustomer.setName("Eleanor");
		firstCustomer.setAddress("Atlanta");
		firstCustomer.setPhoneNo("123-4567");

		//invoke get accessors to retrieve attribute values
		customerName = firstCustomer.getName();
		customerAddress = firstCustomer.getAddress();
		customerPhoneNo = firstCustomer.getPhoneNo();

		//display the retrieved attribute values
		System.out.println("The name is " + customerName);
		System.out.println("The address is " + customerAddress);
		System.out.println("The phone number  is " + customerPhoneNo);

	}//end method main
} //end class CustomerTesterOne
