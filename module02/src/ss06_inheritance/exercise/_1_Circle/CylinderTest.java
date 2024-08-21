package ss06_inheritance.exercise._1_Circle;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1);

        c1 = new Cylinder(2.5);
        System.out.println("C1 - " + c1);

        c1 = new Cylinder(2.5, "black", 1.2);
        System.out.println("C1 - " + c1);

        c1.setRadius(5.4);
        c1.setColor("meta black");
        System.out.println("C1 - "  + c1);

        Circle c2 = new Cylinder();
        System.out.println("C2 - " + c2);
//        c2.setHeight(3.7);
//        c2.getVolume();
//        c2.getHeight();
        /* các câu lệnh trên ko biên dịch được do c2 là đối tượng của lớp con
        nhưng kiểu dữ liêu thuộc lớp cha*/

        Cylinder c3 = new Cylinder();
        c3.setRadius(5.4);
        c3.setColor("meta blue");
        c3.setHeight(3.7);
        c3.getVolume();
        System.out.println("C3 - " + c3);
    }
}
