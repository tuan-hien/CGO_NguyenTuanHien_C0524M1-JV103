package ss05_access_modifier.practice._1_StaticMethod;

public class StaticMethod {
    private int methodNumber;
    private String methodName;
    private static String methodStyle = "Free style";

    StaticMethod (int r, String n) {
        this.methodNumber = r;
        this.methodName = n;
    }

    static void changeMethodStyle() {
        methodStyle = "No style";
    }

    void display() {
        System.out.println(methodNumber + " " + methodName + " " + methodStyle);
    }
}

