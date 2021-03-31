// Customer.java
/*
	Developed By: Your Name
	Script Date: July 14, 2020
*/

/**
* eturns the customer name, address, and phone number.
*
* @author  Khattar Daou
* @version 1.0
* @since   2020-07-14
* @return  the name, address, and phone number of the specified Customer
*/


// create class Customer
public class Customer {
	// attribute definitions
	private String name;
	private String address;
	private String phoneNo;

	// declare the setter methods
	public void setName(String newName) {
		this.name = newName;
	}//end methhod setName

	public void setAddress(String newAddress) {
		this.address = newAddress;
	}//end methhod setAddress

	public void setPhoneNo(String newPhoneNo) {
		this.phoneNo = newPhoneNo;
	}//end methhod setPhoneNo

	//declare the getter methods
	public String getName() {
		return name;
	}//end method getName

	public String getAddress() {
		return address;
	}//end method getAddress

	public String getPhoneNo() {
		return phoneNo;
	}//end method getPhoneNo

} //end class Customer
