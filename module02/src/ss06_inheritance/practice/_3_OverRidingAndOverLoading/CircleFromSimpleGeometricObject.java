package ss06_inheritance.practice._3_OverRidingAndOverLoading;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double radius;

    public CircleFromSimpleGeometricObject() {
    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    //override method toString ở lớp cha với access tương tự, kiểu dữ liệu trả về tương tự và tên method cũng tương tự
    public String toString() {
        return super.toString() + ", \"đây là phần được ghi đè -->\" and radius is: " + radius;
    }

    public static void main(String[] args) {
        CircleFromSimpleGeometricObject c1 = new CircleFromSimpleGeometricObject();
        System.out.println(c1 + "\n");

        CircleFromSimpleGeometricObject c2 = new CircleFromSimpleGeometricObject(3.0);
        System.out.println(c2 + "\n");

        CircleFromSimpleGeometricObject c3 = new CircleFromSimpleGeometricObject(4.0, "black" , true);
        System.out.println(c3);
    }
}
