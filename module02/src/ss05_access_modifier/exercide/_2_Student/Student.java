package ss05_access_modifier.exercide._2_Student;

public class Student {
    private String name;
    private String clazz;

    public Student() {
    }

    public Student(String name, String clazz) {
        this.name = "John";
        this.clazz = "CO2";
    }

    public void setName(String name) {
        this.name = name;
    }

    public /*private*/ void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
