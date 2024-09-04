package ss08_clean_code.repository.student;

import ss08_clean_code.model.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private static Student[] students;
    private static int index = 0;
    static {
        students = new Student[5];
        students[0] = new Student("CGO-001", "Nguyen Van O", LocalDate.parse("2023-09-12"), "vanO@gmail.com", "CGO", "A");
        students[1] = new Student("CGO-002", "Nguyen Van 1", LocalDate.parse("2023-12-29"), "van1@gmail.com", "CGO", "B");
        students[2] = new Student("CGO-003", "Nguyen Van 2", LocalDate.parse("2023-08-09"), "van2@gmail.com", "CGO", "C");
        index = 3;
    }
    @Override
    public Student[] findAllStudent() {
        return students;
    }

    @Override
    public void addNewStudent(Student student) {
        if (index < students.length) {
            students[index++] = student;
        }
    }

    @Override
    public Student findStudentByCode(String code) {
        for (Student student : students) {
            if (student != null && student.getCode().equals(code)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void updateStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getCode().equals(student.getCode())) {
                students[i] = student;
                return;
            }
        }
    }

    @Override
    public void deleteStudent(String code) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getCode().equals(code)) {
                students[i] = null;
                for (int j = i + 1; j < students.length; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                index--;
                return;
            }
        }
    }
}
