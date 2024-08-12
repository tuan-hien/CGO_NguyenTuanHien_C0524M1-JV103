package ss03_array.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _4_TempConverter {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. C to F.");
            System.out.println("2. F to C.");
            System.out.println("3. Exit.");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println(celsius + "degree C is equivalent to " + celsiusToFahrenheit(celsius) + "degree F.");
                    System.out.println();
                    break;
                }
                case 2:{
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(fahrenheit + "degree F is equivalent to " + fahrenheitToCelsius(fahrenheit) + "degree C.");
                    System.out.println();
                    break;
                }
                case 3:
                    System.exit(0);
            }
        } while (choice != 3);
    }
}
