package inventorydemo;

public class InventoryDemo2
{
    public static void main(String[] args)
    {
        // declare objects
        InventoryItem item1, item2, item3;

        item1 = new InventoryItem();
        System.out.println("Item 1:");
        displayItem(item1);

        item2 = new InventoryItem("Wrench");
        System.out.println("Item 2:");
        displayItem(item2);

        item3 = new InventoryItem("Hammer", 20);
        System.out.println("Item 3:");
        displayItem(item3);
    }

    // create a method displayItem
    public static void displayItem(InventoryItem i)
    {
		i.setUnits(5);
        System.out.println("Description: " + i.getDescription());
        System.out.println("Units: " + i.getUnits());
        System.out.println();
    }
}
