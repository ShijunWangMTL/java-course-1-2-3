package Java_I_Labs_04;

// FormatMethod.java
/* The format method formats multiple arguments 
based on a format string. The format string 
consists of static text embedded with format 
specifiers; except for the format specifiers, 
the format string is output unchanged.
*/

/**
 * @author: Khattar
 */


public class FormatMethod {
    // method main begins execution of Java app
    public static void main(String[] args) {
        // declare variables
		double dblTotal = 123000.456789;
		int intValue = 6789;
        String strValue = "Java Programing 1";
        
        // display out result
        System.out.printf("Total is: $%,.2f%n", dblTotal);
        System.out.println();
		System.out.printf("Total: %20.2f: ", dblTotal);
        System.out.println();
        System.out.printf("% 40d", intValue);
        System.out.println();
        System.out.printf("%200.12s\n", strValue);
        System.out.println();
		System.out.printf("%,20d%n%s%n%s%n", -5202000,
		"Welcome to", "Java Programming!");
    } // end method main
} // end class FormatMethod