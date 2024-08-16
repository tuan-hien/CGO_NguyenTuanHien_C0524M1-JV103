package ss04_class_and_object.exercise._1_QuadraticEquation;

public class QuadraticEquation {
    //trường dữ liệu a, b, c thuộc kiểu private double
    private double a, b, c;

    //phương thức khởi tạo với 3 tham số để khởi tạo các giá trị cho a, b, c
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //phương thức getter cho a, b, c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //Phương thức getDiscriminant() trả về delta theo công thức delta = b2 - 4ac
    public double getDiscriminant() {
        return (Math.pow(this.b, 2)) - (4 * this.a * this.c);
    }

    //Phương thức getRoot1() và getRoot2() trả về 2 nghiệm của phương trình
    //Pt tính nghiệm 1 kèm điều kiện cho
    public double getRoot1() {
        double discriminant = this.getDiscriminant();
        if (discriminant >= 0) {
            return (-this.b + Math.sqrt(discriminant)) / (2 * this.a);
        } else {
//            System.out.println("The equation has no roots.");
            return Double.NaN; // Trả về NaN nếu không có nghiệm thực
        }
    }

    public double getRoot2() {
        double discriminant = this.getDiscriminant();
        if (discriminant >= 0) {
            return (-this.b - Math.sqrt(discriminant)) / (2 * this.a);
        } else {
//            System.out.println("The equation has no roots.");
            return Double.NaN;
        }
    }
}

//class Main {
//    public static void main(String[] args) {
//        _1_QuadraticEquation equation = new _1_QuadraticEquation(1.0, 3.0, 1.0);
////        double root1 = equation.getRoot1();
////        double root2 = equation.getRoot2();
//
//        if (Double.isNaN(equation.getRoot1()) && Double.isNaN(equation.getRoot2())) {
//            System.out.println("The equation has no roots.");
//        } else {
//            if (!Double.isNaN(equation.getRoot1())) {
//                System.out.println("Root 1 = " + (Math.round(equation.getRoot1() * 10.0) / 10.0));
//            }
//            if (!Double.isNaN(equation.getRoot2())) {
//                System.out.println("Root 2 = " + (Math.round(equation.getRoot2() * 1000.0) / 1000.0));
//            }
//        }
//    }
//}
