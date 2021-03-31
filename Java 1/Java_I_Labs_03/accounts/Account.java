package Java_I_Labs_03;
// Account.java

/* purpose: Account class that contains a name instance variable and
methods to set and get its value
*/

// @author (classes and interfaces only, required)
/**
 * @author Khattar Daou
 * @version 1.0
 * @since   July 3, 2020
 */

/**
 * Class Account has two methods: setName() and getName()
 */
public class Account {
    private String name; // instance variable

    /**
     * Method to set the name in the objec
     *
     * @param Set the name of an account 
     */
    public void setName(String aname) {
        this.name = aname;
    } // end metrhod setNAme

    /**
     * Method to retrieve the name from an object
     * @return retreive the account name 
     */
    public String getName() {
        return name;
    } // end method getName

} // end class Account