package ss07_abstract.practice._1_Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(int _x, int _y, double _r) {
        super(_x, _y);
        radius = _r;
    }

    public void draw() {
        System.out.println("Draw circle.");
    }

    public void erase() {
        System.out.println("Erase circle.");
    }

//    public static void main(String[] args) {
//        Circle circle = new Circle(5, 5, 0.5);
//
//        circle.draw();
//        circle.moveTo(30, 43);
//        circle.erase();
//    }
}
