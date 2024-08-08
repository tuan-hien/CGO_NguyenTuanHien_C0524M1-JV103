package ss02_loop.practice;

import java.util.Scanner;

public class _4_Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Draw triangle.");
            System.out.println("2. Draw rectangle.");
            System.out.println("3. Draw square.");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 6; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 3; i >= 1; i--) {
                        for (int j = 6; j >= 1; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 6; i >= 1; i--) {
                        for (int j = 6; j >= 1; j--) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}

