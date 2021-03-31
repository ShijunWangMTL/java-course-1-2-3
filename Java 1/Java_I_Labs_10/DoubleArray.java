// DoubleArray.java
// Initializing the elements of an array to default values of zero.

public class DoubleArray {
    public static void main(String[] args)
   {
      // declare variable array and initialize it with an array object  
      double[] array = new double[10]; // new creates the array object 

      System.out.printf("%s%8s%n", "Index", "Value"); // column headings

      // output each array element's value 
      for (int counter = 0; counter < array.length; counter++)
      System.out.printf("%5d%8.2f%n", counter, array[counter]);
   } // end method main
} // end class InitArray