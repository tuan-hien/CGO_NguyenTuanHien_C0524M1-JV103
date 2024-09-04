package ss08_clean_code.service;

import ss08_clean_code.model.Student;
import ss08_clean_code.repository.student.IStudentRepository;
import ss08_clean_code.repository.student.StudentRepository;

public class StudentService implements IStudentService{
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public Student[] findAllStudent() {
        return iStudentRepository.findAllStudent();
    }

    @Override
    public void addNewStudent(Student student) {
        iStudentRepository.addNewStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        iStudentRepository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String code) {
        iStudentRepository.deleteStudent(code);
    }

    @Override
    public Student findStudentByCode(String code) {
        return iStudentRepository.findStudentByCode(code);
    }
}
