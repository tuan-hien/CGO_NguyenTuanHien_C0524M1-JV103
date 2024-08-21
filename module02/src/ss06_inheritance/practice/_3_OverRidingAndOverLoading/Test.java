package ss06_inheritance.practice._3_OverRidingAndOverLoading;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.p(10);
        a.p(10.0);
//        b.p(10);
    }
}

class A extends B {
//    public void p(int number) {
//        System.out.println("Ghi đè với kiểu dữ liệu là int: " + number);
//    }
    // nếu ghi đè với kiểu dữ liệu nhỏ hơn kiểu dữ liệu của method ở lớp cha, thì method ở lớp cha sẽ được gọi.

    public void p(double number) {
        System.out.println("Ghi đè với kiểu dữ liệu là double: " +number);
    }
}

class B {
    public void p(double number) {
        System.out.println("Kết quả của lớp cha sẽ được hiển thị: " + number * 2 + " (vì kiểu dữ liệu của method p trong lớp con < kiểu dữ liệu của method p trong lớp cha).");
    }
}
