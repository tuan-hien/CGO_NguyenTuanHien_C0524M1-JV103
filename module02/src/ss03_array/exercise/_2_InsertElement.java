package ss03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _2_InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
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
            array[i] = scanner.nextInt();
        }

        System.out.print("The array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter element to insert: ");
        int insertElement = scanner.nextInt();
        System.out.print("Enter position of inserted element: ");
        int index = scanner.nextInt();

        if (index <= -1 || index >= array.length - 1) {
            System.out.println("Invalid position.");
            return;
        }

        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = insertElement;

        System.out.println("New array (after insert element" + insertElement + "): " + Arrays.toString(array));
    }
}

