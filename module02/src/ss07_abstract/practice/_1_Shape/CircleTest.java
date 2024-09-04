package ss07_abstract.practice._1_Shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(6, 5, 0.5);

        circle.draw();
        circle.moveTo(33, 33);
        circle.erase();
    }
}
