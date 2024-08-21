package ss06_inheritance.exercise._1_Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, String color, double radius) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.ceil((Math.PI * Math.pow(super.getRadius(), 2) * height) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "A cylinder: height = " + height + ", volume = " + getVolume() + ", is a subclass of " + super.toString();
    }
}