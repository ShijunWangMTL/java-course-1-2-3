// InitArray.java
// Initializing the elements of an array to default values of zero.

public class InitializeArray {
    public static void main(String[] args)
   {
      // initialize it with an array object  
      int[] array = {5, 10, 15, 20, 25, 30};

      System.out.printf("%s%8s%n", "Index", "Value"); // column headings

      // output each array element's value 
      for (int counter = 0; counter < array.length; counter++)
      System.out.printf("%5d%8d%n", counter, array[counter]);
   } // end method main
} // end class InitArray