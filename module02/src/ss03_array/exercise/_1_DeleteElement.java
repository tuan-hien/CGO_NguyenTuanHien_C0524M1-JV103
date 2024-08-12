package ss03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _1_DeleteElement {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter desired quantity of element: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number > 20 || number < 2) {
                System.out.println("Invalid number.");
                System.out.println();
            }
        } while (number > 20 || number < 2);

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Enter element to delete: ");
        int deleteElement = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteElement) {
                isFound = true;
                index = i;
                break;
            }
        }
        if (isFound) {
            System.out.println("Element " + deleteElement + " is found at position " + index + ".");
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
                array[array.length - 1] = 0;
            }
            array = Arrays.copyOf(array, array.length);
        } else {
            System.out.println("Element " + deleteElement + " is not found.");
        }
        System.out.print("New array (after deletion of element" + deleteElement + "): " + Arrays.toString(array));
    }
}

