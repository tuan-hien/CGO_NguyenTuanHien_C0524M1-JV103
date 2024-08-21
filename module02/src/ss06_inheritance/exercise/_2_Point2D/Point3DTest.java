package ss06_inheritance.exercise._2_Point2D;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D p3d1 = new Point3D();
        System.out.println("1. " + p3d1 + "\n");

        Point3D p3d2 = new Point3D(2, 3, 4);
        System.out.println("2. " + p3d2 + "\n"); //= 0.0 vì giá trị mặc định trong constructor là 0.0f

        System.out.println("3. " + "x = " + p3d2.getX()); //= 0.0 vì giá trị mặc định trong constructor là 0.0f
        System.out.println("4. " + "z = " + p3d2.getZ() + "\n");

        p3d2.setX(2.5f);
        p3d2.setY(3);
        p3d2.setZ(4);
        System.out.println("5. " + p3d2 + "\n");

        Point2D p3d3 = new Point3D();
//        p3d3.setZ(2);
        /* không dùng được vì setZ là method của lớp con, trong khi p3d3 có kiểu dữ liệu của lớp cha,
        muốn làm thì ép kiểu như dưới */
        ((Point3D) p3d3).setZ(2); //ép kiểu đối tượng p3d3 thành kểu dữ liệu Point3D
        System.out.println("6. " + p3d3);
        System.out.println("7. " + Arrays.toString(p3d3.getXY()));
        System.out.println("8. " + Arrays.toString(((Point3D) p3d3).getXYZ()) + "\n");

        p3d3.setX(2.3f);
        p3d3.setY(3.3f);
        p3d3.setXY(2.9f, 3.9f);
        System.out.println("9. " + p3d3);
        System.out.println("10. " + Arrays.toString(((Point3D) p3d3).getXYZ()) + "\n");

        Point3D p3d4 = new Point3D();
        System.out.println("11. " + Arrays.toString(p3d4.getXYZ()) + "\n");

        Point2D p3d5 = new Point3D();
        ((Point3D) p3d5).setXYZ(6.6f, 6.6f, 6.6f);
        System.out.println("12. " + Arrays.toString(((Point3D) p3d5).getXYZ()) + "\n");
    }
}
