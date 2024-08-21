package ss05_access_modifier.practice._1_StaticMethod;

public class Main {
    public static void main(String[] args) {
        StaticMethod.changeMethodStyle();

        StaticMethod staticMethod1 = new StaticMethod(123, "This guy has");

        staticMethod1.display();
    }
}
