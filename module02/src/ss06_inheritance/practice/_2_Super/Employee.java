package ss06_inheritance.practice._2_Super;

public class Employee extends Person {
    public Employee() {
        this("Employee overloading its tasks.");
        System.out.println("Employee performing its tasks!");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}
