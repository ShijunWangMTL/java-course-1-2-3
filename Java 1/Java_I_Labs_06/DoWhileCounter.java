// WhileCounter.java
// Counter-controlled repetition with do/while repetition statements.

//class declaration
public class DoWhileCounter {
    static final int MAX_NUMBER = 10;
    // main method
    public static void main(String[] args) {
        // 1. declare control variable
        int counter, counter_two;

        // 2. Initialize counter
        counter = 20;

        // loop-continuation condition
         do {
            System.out.println("do-while: The counter value is " + counter);
            counter++;
        } while (counter <= MAX_NUMBER); // end while loop

        System.out.println("Out of while loop");

        while (counter <= MAX_NUMBER) {System.out.println("while: The counter value is " + counter);
            counter++;
        }

        System.out.println("Out of while loop");

        int i =1;
        do {
			 System.out.println("do-while: " + i);
		 } while ( i < 1);

		 while (i<1) {
			 System.out.println("while: " + i);
		 }



    } // end method main
} // end class WhileCounter