package ss07_abstract.exercise.Shape;

public class Circle extends Shape implements Resizable, Colorable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }

    @Override
    public double getPerimeter() {
        return Math.round((2 * Math.PI * radius) * 100.0) / 100.0;
    }

    @Override
    public void resize(double percent) {
        this.radius = radius + radius * (percent / 100.0);
    }

    @Override
    public void howToColor() {
        System.out.println("Color its perimeter.");
    }

    @Override
    public String toString() {
        return "A circle with r = " + radius + ", p = " + getPerimeter() + ", a = " + getArea();
    }
}
