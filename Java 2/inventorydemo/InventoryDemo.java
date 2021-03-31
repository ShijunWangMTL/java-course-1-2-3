package inventorydemo;

public class InventoryDemo
{
    public static void main(String[] args)
    {
        // declare objects
        InventoryItem item1, item2, item3;

        item1 = new InventoryItem();
        System.out.println("Item 1:");
        System.out.println("Description: "
                    + item1.getDescription());
        System.out.println("Units: " + item1.getUnits());
        System.out.println();

        item2 = new InventoryItem("Wrench");
        System.out.println("Item 2:");
        System.out.println("Description: "
                + item2.getDescription());
        System.out.println("Units: " + item2.getUnits());
        System.out.println();

        item3 = new InventoryItem("Hammer", 20);
        System.out.println("Item 3:");
        System.out.println("Description: "
                + item3.getDescription());
        System.out.println("Units: " + item3.getUnits());


    }
}
