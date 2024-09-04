package ss08_clean_code.controller;

import ss08_clean_code.model.Student;
import ss08_clean_code.service.IStudentService;
import ss08_clean_code.service.StudentService;

public class StudentController {
    private IStudentService iStudentService = new StudentService();

    public Student[] getStudentList() {
        Student[] students = iStudentService.findAllStudent();
        for (Student s : students) {
            if (s == null) {
                return students;
            }
            System.out.println(s);
        }
        return students;
    }

    public void addNewStudent(Student student) {
        iStudentService.addNewStudent(student);
    }

    public Student getStudentByCode(String code) {
        return iStudentService.findStudentByCode(code);
    }

    public void updateStudent(Student student) {
        iStudentService.updateStudent(student);
    }

    public void deleteStudent(String code) {
        iStudentService.deleteStudent(code);
    }

    public boolean isStudentCodeExist(String code) {
        return iStudentService.findStudentByCode(code) != null;
    }
}



