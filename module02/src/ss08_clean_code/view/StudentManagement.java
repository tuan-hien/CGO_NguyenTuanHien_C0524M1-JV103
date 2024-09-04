package ss08_clean_code.view;

import ss08_clean_code.controller.StudentController;
import ss08_clean_code.model.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentManagement {
    private StudentController studentController = new StudentController();
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        do {
            System.out.println("\nStudent Management Menu: \n" +
                    "1. Create new student. \n" +
                    "2. Display student líst. \n" +
                    "3. Update student. \n" +
                    "4. Delete student. \n" +
                    "5. Exit.");
            System.out.print("Please enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    createNewStudent();
                    break;
                case 2:
                    studentController.getStudentList();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        while (true);
    }

    private void deleteStudent() {
        System.out.print("Enter student code to delete: ");
        String studentCode = scanner.nextLine();
        studentController.deleteStudent(studentCode);
        System.out.println("Student deleted.");
    }

    public void createNewStudent() {
        String studentCode;
        while (true) {
            System.out.print("Enter student code: ");
            studentCode = scanner.nextLine();
            if (studentController.isStudentCodeExist(studentCode)) {
                System.out.println("Student already exists.");
            } else {
                break;
            }
        }

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student on board date (format: yyyy-mm-dd): ");
        LocalDate studentOnBoardDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter student email: ");
        String studentEmail = scanner.nextLine();
        System.out.print("Enter student course: ");
        String studentCourse = scanner.nextLine();
        System.out.print("Enter student grade: ");
        String studentGrade = scanner.nextLine();

        Student newStudent = new Student(studentCode, studentName, studentOnBoardDate, studentEmail, studentCourse, studentGrade);
        studentController.addNewStudent(newStudent);
        System.out.println("New student created.");
    }

    private void updateStudent() {
        System.out.print("Enter student code to update: ");
        String studentCode = scanner.nextLine();
        Student student = studentController.getStudentByCode(studentCode);
        if (student != null) {
            System.out.println("Updating student details here.");
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter student on board date (format: yyyy-mm-dd): ");
            LocalDate studentOnBoardDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter student email: ");
            String studentEmail = scanner.nextLine();
            System.out.print("Enter student course: ");
            String studentCourse = scanner.nextLine();
            System.out.print("Enter student grade: ");
            String studentGrade = scanner.nextLine();

            studentController.updateStudent(student);
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.displayMainMenu();
    }
}
