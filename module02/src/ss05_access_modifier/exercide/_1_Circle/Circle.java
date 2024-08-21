package ss05_access_modifier.exercide._1_Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = 1.0;
        this.color = "red";
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
