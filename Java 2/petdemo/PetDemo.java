package petdemo;

import java.util.Scanner;

public class PetDemo 
{
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        Pet myPet = new Pet();
        
        System.out.println("Enter the name of your pet: ");
        myPet.setName(keyboard.nextLine());

        System.out.print("Enter the type of your pet: ");
        myPet.setType(keyboard.nextLine());

        System.out.print("Enter the age of your pet: ");
        myPet.setAge(keyboard.nextInt());

        System.out.println("");
        System.out.println("Here is the information you provided:");
        System.out.println("Pet Name: " + myPet.getName());
        System.out.println("Pet Type: " + myPet.getType());
        System.out.println("Pet Age: " + myPet.getAge());

    }
}