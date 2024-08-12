package ss03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _3_ConcateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        do {
            System.out.print("Enter the size of the array 1: ");
            n1 = sc.nextInt();
            if (n1 > 20 || n1 < 1) {
                System.out.println("Invalid number.");
                System.out.println();
            }
        } while (n1 > 20 || n1 < 1);

        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter element " + (i + 1) + " of array 1: ");
            array1[i] = sc.nextInt();
        }

        System.out.print("Array 1 = " + Arrays.toString(array1));
        System.out.println();

        do {
            System.out.print("Enter the size of the array 2: ");
            n2 = sc.nextInt();
            if (n2 > 20 || n2 < 1) {
                System.out.println("Invalid number.");
                System.out.println();
            }
        } while (n2 > 20 || n2 < 1);

        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter element " + (i + 1) + " of array 2: ");
            array2[i] = sc.nextInt();
        }

        System.out.print("Array 2 = " + Arrays.toString(array2));
        System.out.println();

        int n3 = n1 + n2;
        int[] array3 = new int[n3];
        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < n2; i++) {
            array3[n1 + i] = array2[i];
        }

        System.out.print("Array 3 = " + Arrays.toString(array3));
    }
}
