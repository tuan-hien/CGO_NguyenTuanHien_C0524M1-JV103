package ss06_inheritance.practice._2_Super;

public class Faculty extends Employee {
    public Faculty() {
        System.out.println("Faculty performing its tasks");
    }

    public static void main(String[] args) {
        new Faculty();
        //Khi chạy phương thức main trong lớp Faculty,
        //quá trình tạo đối tượng sẽ bắt đầu từ lớp con (Faculty) và di chuyển lên lớp cha (Employee và Person)
    }
}
