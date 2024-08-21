package ss05_access_modifier.exercide._1_Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.3, "white");

        //khi tạo đối tượng circle1 theo constructor ko tham số,
        //do đó thuộc tính radius và color không được gán giá trị.
        //Theo mặc định, radius là 0.0 (vì double có giá trị mặc định là 0.0 và String có giá trị mặc định là null).
        System.out.println("Radius: " + circle1.getRadius() + " and Area: " + circle1.getArea() + " and color: " + circle1.getColor());

        //khi tạo đối tượng circle2 theo constructor có tham số (double radius, String color),
        //nhưng giá trí mặc định được khởi tạo là this.radius = 1.0 và this.color = "red";
        //nên có truyền vào đối số khác thì hàm vẫn ko nhận đối số mới
        System.out.println("Radius: " + circle2.getRadius() + " and Area: " + circle2.getArea() + " and color: " + circle2.getColor());
    }
}
