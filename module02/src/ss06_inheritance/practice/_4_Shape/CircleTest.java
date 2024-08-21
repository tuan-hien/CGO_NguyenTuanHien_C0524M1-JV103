package ss06_inheritance.practice._4_Shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);

        c = new Circle(5.3);
        System.out.println(c);

        c = new Circle(6.3, "ocean blue", false);
        System.out.println(c);
    }
}
