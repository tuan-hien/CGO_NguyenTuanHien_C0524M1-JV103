package ss05_access_modifier.practice._2_StaticProperty;

public class StaticProperty {
    private String name;
    private String engine;
    public static int numberOfProperty;

    public StaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfProperty++;
    }

}
