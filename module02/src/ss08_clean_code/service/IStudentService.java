package ss08_clean_code.service;

import ss08_clean_code.model.Student;

public interface IStudentService {
    void addNewStudent(Student student);
    Student[] findAllStudent();
    Student findStudentByCode(String code);
    void updateStudent(Student student);
    void deleteStudent(String code);
}
