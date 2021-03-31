// ForCounter.java
// Counter-controlled repetition with the for repetition statement

//class declaration
public class ForCounter {
    static final int MAX_NUMBER = 10;
    // main method
    public static void main(String[] args) {
        // 1. declare control variable

        // for statement header includes initialization,
		 // loop-continuation condition and increment
        for(int counter = 1; counter <= MAX_NUMBER; counter++) {
            System.out.println("The counter value is " + counter);
        } // end for loop
        System.out.println("Out of while loop");
    } // end method main
} // end class WhileCounter