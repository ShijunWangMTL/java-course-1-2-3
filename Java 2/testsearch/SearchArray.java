package testsearch;

public class SearchArray
{
    // create method sequentialSearch
    // two parameters: array to search from - type of int[], value to search in the array - type of int
    public static int sequentialSearch(int[] array, int value)
    {
        // declare variables
        int index, element; // index - loop control variable, element - at which the value is found
        boolean found; // flag indicating search results

        // initialization
        index = 0;
        element = -1;
        found = false;

        while (!found && index < array.length)
        {
            if (array[index] == value)
            {
                found = true;
                element = index;
            } // end if loop
            index++;
        } // end while loop
        return element;
    }
} // end class
