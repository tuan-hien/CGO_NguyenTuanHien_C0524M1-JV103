package ss02_loop.exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _1_Geometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println();
            System.out.println("MENU");
            System.out.println("1.  Draw rectangle.");
            System.out.println("21. Draw right triangle bottom-left corner.");
            System.out.println("22. Draw right triangle bottom-right corner.");
            System.out.println("23. Draw right triangle upper-left corner.");
            System.out.println("24. Draw right triangle upper-right corner.");
            System.out.println("3.  Draw isosceles triangle.");
            System.out.println("4.  Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter rectangle's length: ");
                    int length = scanner.nextInt();
                    System.out.print("Enter rectangle's width: ");
                    int width = scanner.nextInt();
                    if (length >= 2 && width >= 1 && length < 50 && width < 49) {
                        if (length > width) {
                            for (int i = width; i >= 1; i--) {
                                for (int j = length; j >= 1; j--) {
                                    System.out.print("*  ");
                                }
                                System.out.println();
                            }
                        } else {
                            System.out.println("Length must be bigger than width.");
                        }
                    } else {
                        System.out.println("Invalid length and/or width.");
                    }
                    break;
                case 21: //Draw right triangle bottom-left corner
                    System.out.print("Enter triangle's height: ");
                    int height21 = scanner.nextInt();
                    if (height21 >= 2 && height21 < 10) {
                        for (int i = 1; i <= height21; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Invalid input.");
                    }
                    break;
                case 22: //Draw right triangle bottom-right corner
                    System.out.print("Enter triangle's height: ");
                    int height22 = scanner.nextInt();
                    if (height22 >= 2) {
                        for (int i = 0; i < height22; i++) {
                            //tạo khoảng trống
                            for (int j = height22 - 1; j > i; j--) {
                                System.out.print("  ");
                            }
                            //in *
                            for (int j = 0; j <= i; j++) {
                                System.out.print(" *");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Invalid input.");
                    }
                    break;
                case 23: //Draw right triangle upper-left corner
                    System.out.print("Enter triangle's height: ");
                    int height23 = scanner.nextInt();
                    if (height23 >= 2) {
                        for (int i = height23; i > 0; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Invalid input.");
                    }
                    break;
                case 24: //Draw right triangle upper-right corner
                    System.out.print("Enter triangle's height: ");
                    int height24 = scanner.nextInt();
                    if (height24 >= 2) {
                        for (int i = height24; i > 0; i--) {
                            //tạo khoảng trống
                            for (int j = height24; j > i; j--) {
                                System.out.print("  ");
                            }
                            //in *
                            for (int j = 0; j < i; j++) {
                                System.out.print(" *");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.print("Invalid input.");
                    }
                    break;
                case 3:
                    System.out.print("Enter triangle's height: ");
                    int height3 = scanner.nextInt();
                    if (height3 >= 2) {
                        for (int i = 0; i < height3; i++) {
                            //tạo khoảng trống
                            for (int j = height3 - i; j > 1; j--) {
                                System.out.print(" ");
                            }
                            //in *
                            for (int j = 0; j <= i * 2; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Invalid input.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
