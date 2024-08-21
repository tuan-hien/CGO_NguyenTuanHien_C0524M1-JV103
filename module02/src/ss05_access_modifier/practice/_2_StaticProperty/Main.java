package ss05_access_modifier.practice._2_StaticProperty;

public class Main {
    public static void main(String[] args) {
        StaticProperty staticProperty1 = new StaticProperty("Static", "Property 1");
        System.out.println("Số lượng property là " + StaticProperty.numberOfProperty);

        StaticProperty staticProperty2 = new StaticProperty("Static", "Property 2");
        System.out.println("Số lượng property là " + StaticProperty.numberOfProperty);
    }
}
