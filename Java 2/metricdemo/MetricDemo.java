package metricdemo;

import java.util.Scanner;

public class MetricDemo
{
    public static void main(String[] args)
    {
        double miles, kilos;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a distance in miles: ");
        miles = keyboard.nextDouble();

        kilos = Metric.milesToKilometers(miles);
        System.out.printf("%.2f miles equals %.2f kilometers.\n", miles, kilos);

        System.out.println("Enter a distance in kilometers: ");
        kilos = keyboard.nextDouble();

        miles = Metric.kilometersToMiles(kilos);
        System.out.printf("%.2f kilometers equals %.2f miles.\n", kilos, miles);
    }
}