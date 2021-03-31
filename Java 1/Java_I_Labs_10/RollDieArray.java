// RollDieArray.java
// Roll a six-sided die 6000 times.
// Die-rolling program using arrays instead of switch.

import java.security.SecureRandom;

public class RollDieArray {
    public static void main(String[] args) {
        // randomNumbers object will produce secure random numbers
        SecureRandom randomNumbers = new SecureRandom();

        // declare an array with 6 components (elements)
        int[] frequency = new int[7]; // array of frequency counters

        /// roll die 6,000,000 times; use die value as frequency index
        for (int roll = 1; roll <= 6000000; roll++) {
            ++frequency[1 + randomNumbers.nextInt(6)];
        } // end for loop
        System.out.printf("%s%10s%n", "Face", "Frequency");
        System.out.printf("%s%10s%n", "----", "---------");
        // output each array element's value
        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        } // end for
    } // end method main
} // end class RollDie