package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver.");
        System.out.println("The equation is: 'a * x - b = c'. Let's enter the constants.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a = scanner.nextFloat();
        System.out.println("Enter b: ");
        float b = scanner.nextFloat();
        System.out.println("Enter b: ");
        float c = scanner.nextFloat();

        if (a != 0) {
            float x = (c + b) / a;
            System.out.println("The result is: " + x + ".");
        } else {
            if (b == c) {
                System.out.println("Infinitely value of x.");
            } else {
                System.out.println("No solution.");
            }
        }
    }
}
