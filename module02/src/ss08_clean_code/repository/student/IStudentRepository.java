package ss08_clean_code.repository.student;

import ss08_clean_code.model.Student;

public interface IStudentRepository {
    void addNewStudent(Student student);
    Student[] findAllStudent();
    Student findStudentByCode(String code);
    void updateStudent(Student student);
    void deleteStudent(String code);

}
