package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class _1_Greeting {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter your name, please: ");
        String name = inputName.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
