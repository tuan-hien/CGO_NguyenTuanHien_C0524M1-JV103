package ss03_array.practice;

import java.util.Scanner;

public class _3_MaxInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter size: ");
            size = scanner.nextInt();
            if (size > 20 || size < 2) {
                System.out.println("Invalid size.");
                System.out.println();
            }
        } while (size > 20 || size < 2);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("%-10s%s", "Property list: ", "");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        int max = array[0];
        int indexOfMax = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                indexOfMax = j + 1;
            }
        }
        System.out.print("Max is " + max + " at position " + indexOfMax + ".");
    }
}
