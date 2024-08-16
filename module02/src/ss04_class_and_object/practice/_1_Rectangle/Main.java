package ss04_class_and_object.practice._1_Rectangle;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        //khởi tạo 1 đối tượng mới trong class _1_rectangle
        Rectangle newRect = new Rectangle(length, width);
        System.out.printf("%-40s%s", "Your " + newRect.display() + "\n", "");
        System.out.printf("%-40s%s", "Perimeter " + newRect.getPerimeter() + "\n", "");
        System.out.printf("%-40s%s", "Area " + newRect.getArea() + "\n", "");
    }
}