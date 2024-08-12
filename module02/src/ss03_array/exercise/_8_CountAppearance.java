package ss03_array.exercise;

import java.util.Scanner;

public class _8_CountAppearance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the string: ");
        str = sc.nextLine();

        System.out.print("Enter your character here: ");
        String c = sc.next();
        char ch = c.charAt(0);

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }
        System.out.println("Character '" + ch + "' appears " + counter + " time(s).");
    }
}
