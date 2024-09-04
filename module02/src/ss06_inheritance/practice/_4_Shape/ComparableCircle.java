package ss06_inheritance.practice._4_Shape;

import java.awt.*;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    /* ghi đè method compareTo() của interface Comparable sẵn có của Java.
    Đây là method được sử dụng để so sánh đối tượng hiện tại với đối tượng được truyền vào o */
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else return 0;
    }
}
