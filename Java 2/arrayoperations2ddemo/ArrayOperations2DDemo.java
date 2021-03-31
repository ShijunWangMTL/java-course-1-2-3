package arrayoperations2ddemo;

public class ArrayOperations2DDemo
{
    public static void main(String[] args)
    {
        int[][] iarray = {{2, 1, 9},
                          {7, 3, 4}};
        System.out.println("Total: " + ArrayOperations2D.getTotal(iarray));
        System.out.println("Average: " + ArrayOperations2D.getAverage(iarray));

        System.out.println("Total of row 0: " + ArrayOperations2D.getRowTotal(iarray, 0));
        System.out.println("Total of row 1: " + ArrayOperations2D.getRowTotal(iarray, 1));

        System.out.println("Total of col 0: " + ArrayOperations2D.getColumnTotal(iarray, 0));
        System.out.println("Total of col 1: " + ArrayOperations2D.getColumnTotal(iarray, 1));
        System.out.println("Total of col 2: " + ArrayOperations2D.getColumnTotal(iarray, 2));

        System.out.println("Highest in row 0: " + ArrayOperations2D.getHighestInRow(iarray, 0));
        System.out.println("Highest in row 1: " + ArrayOperations2D.getHighestInRow(iarray, 1));

        System.out.println("Lowest in row 0: " + ArrayOperations2D.getLowestInRow(iarray, 0));
        System.out.println("Lowest in row 1: " + ArrayOperations2D.getLowestInRow(iarray, 1));

    } // end main method
} // end class
