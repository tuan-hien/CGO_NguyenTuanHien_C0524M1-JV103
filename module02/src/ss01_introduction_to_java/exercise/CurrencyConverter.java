package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner inputCurrency = new Scanner(System.in);
        System.out.println("Enter your USD amount here:");
        double amount = inputCurrency.nextDouble();
        double rate = 25000;
        double outputCurrency = amount * rate;
        System.out.println("Your " + amount + " USD is equivalent to " + outputCurrency + " VND.");
    }
}
