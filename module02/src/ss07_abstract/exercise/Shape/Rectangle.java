package ss07_abstract.exercise.Shape;

public class Rectangle extends Shape implements Resizable{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return Math.round((length * width) * 100.0) / 100.0;
    }

    @Override
    public double getPerimeter() {
        return Math.round((2 * (length + width)) * 100.0) / 100.0;
    }

    @Override
    public void resize(double percent) {
        this.length = Math.round((length + length * (percent / 100.0)) * 100.0) / 100.0;
        this.width = Math.round((width + width * (percent / 100.0)) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "A rectangle with l = " + length + ", w = " + width + ", p = " + getPerimeter() + ", a = " + getArea();
    }
}
