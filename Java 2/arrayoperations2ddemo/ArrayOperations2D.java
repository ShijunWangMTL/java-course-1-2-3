package arrayoperations2ddemo;

public class ArrayOperations2D
{
    // create method getTotal
    public static int getTotal(int[][] array)
    {
        int total = 0;
        for(int row=0;row<array.length;row++)
        {
            for(int col=0;col<array[row].length;col++)
            {
                total += array[row][col];
            }
        }
        return total;
    } // end method getTotal

    // create method getAverage
    public static double getAverage(int[][] array)
    {
        return (double)getTotal(array) / getElementCount(array);
    }
    // end method getAverage

    // create method getElementCount
    public static int getElementCount(int[][] array)
    {
        int count=0;
        for(int row=0;row<array.length;row++)
        {
            count += array[row].length;
        }
        return count;
    }
    // end method getElementCount

    // create method getRowTotal
    public static int getRowTotal(int[][] array, int row)
    {
        int total = 0;
        for(int col=0;col<array[row].length;col++)
        {
            total += array[row][col];
        }
        return total;
    }
    // end method getRowTotal

    // create method getColumnTotal
    public static int getColumnTotal(int[][] array, int col)
    {
        int total = 0;
        for(int row=0;row<array.length;row++)
        {
            total += array[row][col];
        }
        return total;
    }
    // end method getColumnTotal

    // create method getHighestInRow
    public static int getHighestInRow(int[][] array, int row)
    {
        int highest=array[row][0];
        for(int col=1;col<array[row].length;col++)
        {
            if (highest < array[row][col])
            {
                highest = array[row][col];
            }
        }
        return highest;
    }

    // end method getHighestInRow

    // create method getLowestInRow
        public static int getLowestInRow(int[][] array, int row)
        {
            int lowest = array[row][0];
            for (int col = 1; col < array[row].length; col++)
            {
                if (lowest > array[row][col])
                {
                    lowest = array[row][col];
                }
            }
            return lowest;
        }
    // end method getLowestInRow



} // end class
