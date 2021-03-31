package overloadingdemo;

import java.util.Scanner;

public class OverloadingDemo
{
    public static void main(String[] args)
    {
        int iNumber;
        double dNumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        iNumber = keyboard.nextInt();

        System.out.println("That number's square is " +
                MyMath.square(iNumber));

        System.out.print("Enter a double: ");
        dNumber = keyboard.nextDouble();

        System.out.println("That number's square is " +
                MyMath.square(dNumber));

    }
}
