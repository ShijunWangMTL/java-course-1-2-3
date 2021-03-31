package testsearch;

public class TestSearch
{
    public static void main(String[] args)
    {
        // declare array
        int[] tests = {87, 75, 98, 100, 82};
        int result = SearchArray.sequentialSearch(tests, 100);
        if (result == -1)
        {
            System.out.println("You did not earn 100 on any test.");
        }
        else
        {
            System.out.println("You earn 100 on test " + (result + 1));
        }

    } // end main method
} // end class
