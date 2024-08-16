package ss04_class_and_object.practice._1_Rectangle;

//định nghĩa lớp _1_rectangle
public class Rectangle {
    //thuộc tính length và width
    double length, width;

    //constructor này là mặc định không tham số
    //ko thực hiện bất kì thao tác khởi tạo nào, nghĩa là các thuộc tinh length và width sẽ có giá trị mặc định là 0.0
    public Rectangle() {
    }

    //constructor nhận hai tham số length và width, để khởi tạo các thuộc tính length và width của hcn
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //định nghĩa các phương thức getArea(), getPerimeter(), display()
    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public String display() {
        return "Rectangle {" + "length = " + length + ", width = " + width + "}";
    }
}

//Tạo class Main chứa phương thức main để thực thi chương trình
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the length of the rectangle: ");
//        double length = sc.nextDouble();
//        System.out.print("Enter the width of the rectangle: ");
//        double width = sc.nextDouble();
//
//        //khởi tạo 1 đối tượng mới trong class _1_rectangle
//        _1_Rectangle newRect = new _1_Rectangle(length, width);
//        System.out.printf("%-40s%s", "Your " + newRect.display() + "\n", "");
//        System.out.printf("%-40s%s", "Perimeter " + newRect.getPerimeter() + "\n", "");
//        System.out.printf("%-40s%s", "Area " + newRect.getArea() + "\n", "");
//    }
//}
