package ss08_clean_code.model;

import java.time.LocalDate;

public class Teacher extends Person {
    private int salary;

    public int getSalary() { return salary; }

    public void setSalary(int salary) { this.salary = salary; }

    public Teacher() {}

    public Teacher(String code, String name, LocalDate onBoardDate, String email, int salary) {
        super(code, name, onBoardDate, email);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher [salary = " + salary + "]" + super.toString();
    }
}
