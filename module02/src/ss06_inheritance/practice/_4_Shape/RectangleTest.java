package ss06_inheritance.practice._4_Shape;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rct = new Rectangle();
        System.out.println(rct);

        rct = new Rectangle(6.3, 4.5);
        System.out.println(rct);

        rct = new Rectangle(7.8, 5.4, "sky blue", false);
        System.out.println(rct);
    }
}
