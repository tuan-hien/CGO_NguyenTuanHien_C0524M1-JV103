package ss07_abstract.exercise.Shape;

import java.util.Random;

public class ShapeTest {
    public static void main(String[] args) {
//        Shape c1 = new Circle();
//        ((Circle) c1).setRadius(10.5);
//        System.out.println("Before resize: " + c1.toString());
//        ((Circle) c1).resize(3);
//        System.out.println("After resize: " + c1.toString());
//
//        Rectangle r1 = new Rectangle();
//        ((Rectangle) r1).setWidth(20.12);
//        r1.setLength(30.5);
//        System.out.println("Before resize: " + r1.toString());
//        r1.resize(30);
//        System.out.println("After resize: " + r1.toString());
//
//        Shape s1 = new Square();
//        ((Square) s1).setSide(4.5);
//        System.out.println("Before resize: " + s1.toString());
//        ((Square) s1).resize(45);
//        System.out.println("After resize: " + s1.toString());
//
//        System.out.println("--------------------------------------------------");
        Random rand = new Random();
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(4.2);
        shapes[1] = new Rectangle(6.2, 1.5);
        shapes[2] = new Square(3.3);

        for (Shape s : shapes) {
            double areaBefore = s.getArea();
            double perimeterBefore = s.getPerimeter();

            if (s instanceof Colorable) {
                System.out.println(s.toString());
                ((Colorable) s).howToColor();
            } else {
                System.out.println(s);
                System.out.println("Not Colorable.");
            }

            System.out.println("Before resize: p = " + perimeterBefore + ", a = " + areaBefore);
            if (s instanceof Resizable) {
                double percent = Math.round((rand.nextDouble() * 100 + 1) * 100.0) / 100.0;
                ((Resizable) s).resize(percent); // Ép kiểu và gọi phương thức resize
                double areaAfter = s.getArea();
                double perimeterAfter = s.getPerimeter();
                System.out.println("Percent: " + percent);
                System.out.println("After resize: p = " + perimeterAfter + ", a = " + areaAfter);
            }
            System.out.println();
        }
    }
}
