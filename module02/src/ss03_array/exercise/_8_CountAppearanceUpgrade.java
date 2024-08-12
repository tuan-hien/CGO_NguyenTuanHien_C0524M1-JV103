package ss03_array.exercise;

import java.util.Scanner;

public class _8_CountAppearanceUpgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the string: ");
        str = sc.nextLine();

        System.out.print("Enter your character here: ");
        String c = sc.next();
        char ch = c.charAt(0);

        int[] output = position(str, ch);
        if (output[0] > 0) {
            System.out.print("Character '" + ch + "' appears " + output[0] + " time(s) at last position " + output[1] + ".");
                    } else {
            System.out.print("Character '" + ch + "' did not appear.");
        }
    }

    public static int[] position(String str, char ch) {
        int counter = 0;
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter++;
                index = i;
            }
        }
        return new int[]{counter, index};
    }
}
