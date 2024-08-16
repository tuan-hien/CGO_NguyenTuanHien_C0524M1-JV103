package ss04_class_and_object.exercise._3_Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(1, true, 3.5, "red");

        System.out.println("Màu " + fan2.getColor());
        System.out.println("Tốc độ " + fan2.getSpeed());
        System.out.println("Bán kính " + fan2.getRadius());
        System.out.println("Bật " + fan2.getIsOn());


//        fan1.setSpeed(Fan.Medium);
////        fan1.setSpeed(2);
//        fan1.setRadius(6.0);
//        fan1.setColor("Bluest");
//        fan1.setIsOn(true);
//
//        System.out.println(fan1.toString());
//
//        fan2.setSpeed(Fan.Fast);
//        fan2.setRadius(3.0);
//        fan2.setColor("White");
//        fan2.setIsOn(true);
//
//        System.out.println(fan2.toString());
    }
}
