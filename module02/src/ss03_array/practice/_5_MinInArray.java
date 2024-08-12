package ss03_array.practice;

import java.util.Scanner;

public class _5_MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter the size: ");
        size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int[] output = minValue(arr);
        System.out.print("Smallest element is " + output[0] + " at position " + output[1]);
        System.out.println(".");
    }

    public static int[] minValue(int[] array) {
        //muốn lấy hai/nhiều giá trị trả về thì phải là dạng array, ví dụ int[]
        int min = array[0];
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexOfMin = i;
            }
        }
        return new int[]{min, indexOfMin};
    }
}
