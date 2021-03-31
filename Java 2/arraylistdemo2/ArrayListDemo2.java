package arraylistdemo2;

import java.util.ArrayList;

public class ArrayListDemo2
{
    public static void main(String[] args)
    {
        // create object of ArrayList
        ArrayList<String> nameList = new ArrayList<>();

        // add method
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        System.out.println("The ArrayList has " + nameList.size() + " object in it.");
        // display elements in ArrayList
        for(int index=0;index<nameList.size();index++)
        {
            System.out.println(nameList.get(index));
        }

        System.out.println();
        // remove method
        System.out.println("The item in position 1 of the array list will be removed.");
        nameList.remove(1);

        // another loop to display ArrayList elements
        for(String name : nameList)
            System.out.println(name);

        System.out.println();
        nameList.add(1, "Mary");
        System.out.println("The item Mary has been inserted in position 1.");
        for(String name : nameList)
            System.out.println(name);

        System.out.println();
        nameList.set(1, "Jack");
        System.out.println("The item in position 1 has been replaced.");
        for(String name : nameList)
            System.out.println(name);
    } // end main method
} // end class
