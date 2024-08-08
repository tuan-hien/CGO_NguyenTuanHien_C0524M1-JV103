package ss02_loop.exercise;

import java.util.Scanner;

public class _2_PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        scanner.close();

        int count = 0;
        int n = 2;

        while (number > 1) {
            while (count < number) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(n + ", ");
                    count++;
                }
                n++;
            }
        }
        System.out.println("Invalid number.");
    }
}
