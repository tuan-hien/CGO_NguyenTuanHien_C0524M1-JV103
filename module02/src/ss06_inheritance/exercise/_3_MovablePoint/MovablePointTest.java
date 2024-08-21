package ss06_inheritance.exercise._3_MovablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint mvp = new MovablePoint();
        System.out.println("1. " + mvp);
        System.out.println("2. " + mvp.toString());

        mvp.setSpeed(4.3f, 5.4f);
        mvp.move();
        System.out.println("3. " + mvp);

        mvp.setXY(1.4f, 4.1f);
        mvp.move();
        System.out.println("4. " + mvp);

        MovablePoint mvp1 = new MovablePoint(4.5f, 5.4f);
        mvp1.setXY(6.5f, 7.5f);
        mvp1.setSpeed(1.4f, 4.1f);
        System.out.println("5. " + mvp1);
    }
}
