package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner
        System.out.print("Enter the width: ");
        width = scanner.nextFloat(); //nhập chiều rộng

        System.out.print("Enter the height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is " + area);
    }
}
