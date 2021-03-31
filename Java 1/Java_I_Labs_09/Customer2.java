// Customer2.java
/*
	Developed By: Your Name
	Script Date: July 14, 2020
*/

/**
* returns the customer name, address, and phone number.
*
* @author  Khattar Daou
* @version 1.0
* @since   2020-07-14
* @return  the name, address, and phone number of the specified Customer
*/

// create class Customer
public class Customer2 {
	// attribute definitions
	private String name;
	private String address;
	private String phoneNo;


    // constructor with parameters
    public Customer2(String aName, String anAddress, String aPhoneNo)
	{
        // invoke setters to populate attributes
		setName(aName);
		setAddress(anAddress);
		setPhoneNo(aPhoneNo);
    } // end parameterized constructor


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

/*
An alternative to invoking individual getter methods is
to write a single PD method that you invoke to retrieve
all of the attribute values for an instance.
An appropriate name for this method is tellAboutSelf,
and it will retrieve all of the attribute values, place
them in a String instance, and then return the String
instance to the invoking client.  You want tellAboutSelf
to have public accessibility and a return data type of String.

*/
    public String tellAboutSelf()
		{
			return("Customer name = "
					+ getName() + ", Address = "
					+ getAddress() + ", Phone Number = "
					+ getPhoneNo());
		}
} //end class Customer
