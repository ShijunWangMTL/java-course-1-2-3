package weeklypay;

import java.util.*;

public class WeeklyPay
{
    public static void main(String[] args)
    {
        String selection; // user's selection, H or S
        int hours;  // number of hours worked
        double hourlyRate; // hourly pay rate
        double yearly; // yearly salary

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Do you want to calculate the "
                    + "weekly salary of an hourly-paid?");
        System.out.println("or a salaried employee?");
        System.out.print("Enter H for hourly or S for salaried: ");

        selection = keyboard.nextLine();

        switch (selection.charAt(0))
        {
            case 'H':
            case 'h':
                System.out.print("How many hours were worked? ");
                hours = keyboard.nextInt();
                System.out.print("What is the hourly pay rate? ");
                hourlyRate = keyboard.nextDouble();
                System.out.printf("The weekly gross pay is $%,.2f\n",
                        Pay.getWeeklyPay(hours, hourlyRate));
                break;

            case 'S':
            case 's':
                System.out.print("What is the annual salary? ");
                yearly = keyboard.nextDouble();
                System.out.printf("The weekly gross pay is $%,.2f\n",
                        Pay.getWeeklyPay(yearly));
                break;

            default:
                System.out.println("Invalid selection.");
        }
    }
}
