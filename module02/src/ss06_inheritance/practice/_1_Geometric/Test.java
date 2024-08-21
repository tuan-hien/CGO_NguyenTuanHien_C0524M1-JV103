package ss06_inheritance.practice._1_Geometric;

public class Test {
    public static void main(String[] args) {
        Circle c0 = new Circle(); //đối tượng c0 tạo từ constructor ko tham số
        System.out.println(c0.toString()); //thừa hưởng color white của lớp cha Geometric
        c0.setFilled("black"); //thừa hưởng method setFilled của lớp cha
        System.out.println("c0: " + c0.toString() + "\n");

        Circle c1 = new Circle(1); //đối tượng c0 tạo từ constructor một tham số radius
        System.out.println(c1.toString()); //thừa hưởng color white của lớp cha Geometric
        c1.setColor("grey"); //thừa hưởng method setColor của lớp cha để đổi Color
        System.out.println("c1: " + c1.toString());
        System.out.println("Radius được truyền vào của c1: " + c1.getRadius() + "\n");

        Circle c2 = new Circle(2, "green", "red"); //đối tượng c2 tạo từ constructor ba tham số
        System.out.println("Trước khi dùng setter: " + c2.toString());
        c2.setColor("red"); //thừa hưởng medthod setColor để đổi màu mặc dù tham số truyền vào là green
        c2.setFilled("ultra yellow"); //thừa hưởng method setFilled để đổi màu filled thành ultra yellow mặc dù tham số truyền vào là red
        System.out.println("Sau khi dùng setter: " + c2.toString());
    }
}
