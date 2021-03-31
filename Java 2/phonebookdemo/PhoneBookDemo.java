package phonebookdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookDemo
{
    public static void main(String[] args)
    {
        ArrayList<PhoneBookEntry> list = new ArrayList<>();

        final int NUM_ENTRIES = 5;

        for(int i=0;i<NUM_ENTRIES;i++)
        {
            list.add(getEntry());
            System.out.println("");
        }

        System.out.println("Here is the data that you entered.");

        for(int i=0;i<list.size();i++)
        {
            displayEntry(list.get(i));
        }

    } // end main method

    // create getEntry method
    public static PhoneBookEntry getEntry()
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String phoneNumber;
        System.out.print("Enter a person's name: ");
        name = keyboard.next();
        System.out.print("Enter that person's phone number: ");
        phoneNumber = keyboard.next();

        PhoneBookEntry entry = new PhoneBookEntry(name, phoneNumber);

        return entry;
    } // end getEntry method

    // create displayEntry method
    public static void displayEntry(PhoneBookEntry entry)
    {
        System.out.println("----------------------------");
        System.out.println("Name: " + entry.getName());
        System.out.println("Phone number: " + entry.getPhoneNumber());
    } // end displayEntry method

} // end class
