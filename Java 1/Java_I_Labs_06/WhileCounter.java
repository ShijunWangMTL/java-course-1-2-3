// WhileCounter.java
// Counter-controlled repetition with while repetition statements.

//class declaration
public class WhileCounter {
    static final int MAX_NUMBER = 10;
    // main method
    public static void main(String[] args) {
        // 1. declare control variable
        int counter;

        // 2. Initialize counter
        counter = 1;

        // loop-continuation condition
        while (counter <= MAX_NUMBER) {
            System.out.println("The counter value is " + counter);
            counter = counter + 1; // you can use counter++;
        } // end while loop
        System.out.println("Out of while loop");
    } // end method main
} // end class WhileCounter