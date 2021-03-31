package objectarray;

import java.util.*;

public class ObjectArray
{
    public static void main(String[] args)
    {
        // declare constant
        final int NUM_ITEMS = 3;

        // create array of InventoryItem class
        InventoryItem[] inventory = new InventoryItem[NUM_ITEMS];

        getItems(inventory);

        System.out.println("You entered the following:");

        for (int index = 0; index < inventory.length; index++)
        {
            System.out.println("Item " + (index + 1));
            System.out.println("Description: " + inventory[index].getDescription());
            System.out.println("Units: " + inventory[index].getUnits());
            System.out.println();
        }

    } // end main method


    // create getItems method
    private static void getItems(InventoryItem[] array)
    {
        String description;
        int units;

        Scanner keyboard = new Scanner(System.in);

        for (int index = 0; index < array.length; index++)
        {
            System.out.print("Enter the description for item " + (index + 1) + ": ");
            description = keyboard.next();
            System.out.print("Enter the units for item " + (index + 1) + ": ");
            units = keyboard.nextInt();

            keyboard.nextLine();

            array[index] = new InventoryItem(description, units);
            System.out.println();
        }

    } // end getItems method

} // end class
