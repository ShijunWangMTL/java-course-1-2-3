// BreakForCounter.java
// Counter-controlled repetition with the for repetition statement

//class declaration
public class BreakForCounter {
    static final int MAX_NUMBER = 10;
    // main method
    public static void main(String[] args) {
        // 1. declare control variable
        int counter;
        // for statement header includes initialization,
		 // loop-continuation condition and increment
        for(counter = 1; counter <= MAX_NUMBER; counter++) {
           if (counter == 5) {
               continue; // terminates loop if count is 5
           }
            System.out.printf("%d ", counter);
        } // end for loop

        System.out.printf("%nBroke out of loop at count = %d%n", counter);
    } // end method main
} // end class WhileCounter