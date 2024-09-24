package ss12_java_collection_framework.model;

public class Pupil extends Human{
    private String subject;
    private String grade;

    public Pupil() {}
    public Pupil(String code, String name, int yearOfBirth, String subject, String grade) {
        super(code, name, yearOfBirth);
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {return subject;}
    public void setSubject(String subject) {this.subject = subject;}

    public String getGrade() {return grade;}
    public void setGrade(String grade) {this.grade = grade;}

    @Override
    public String toString() {
        return super.toString() + ", good at: " + subject + ", with grade = " + grade + '.';
    }
}
