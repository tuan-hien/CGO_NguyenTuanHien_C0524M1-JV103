package ss07_abstract.exercise.Shape;

public class Square extends Shape implements Resizable, Colorable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.round(Math.pow(side, 2) * 100.00) / 100.00;
    }

    @Override
    public double getPerimeter() {
        return Math.round((side * 4) * 100.00) / 100.00;
    }

    @Override
    public void resize(double percent) {
        this.side = Math.round(side * (1 + (percent / 100.0)) * 100.0) / 100.0;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "A square with r = " + side + ", p = " + getPerimeter() + ", a = " + getArea();
    }
}
