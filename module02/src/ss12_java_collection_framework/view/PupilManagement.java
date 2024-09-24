package ss12_java_collection_framework.view;

import ss12_java_collection_framework.controller.PupilController;
import ss12_java_collection_framework.model.Pupil;

import java.util.Scanner;

public class PupilManagement {
    private PupilController pupilController = new PupilController();
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        do {
            System.out.println("\nMenu \n" +
                    "1. Add new pupil. \n" +
                    "2. Display pupil list. \n" +
                    "3. Update pupil. \n" +
                    "4. Delete pupil. \n" +
                    "5. Exit.");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addNewPupil();
                    break;
                case 2:
                    pupilController.displayAllPupils();
                    break;
                case 3:
                    updatePupil();
                    break;
                case 4:
                    deletePupil();
                    break;
                case 5:
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (true);
    }

    public void addNewPupil() {
        String newCode;
        while (true) {
            System.out.print("Enter new pupil code: ");
            newCode = scanner.nextLine();
            if (pupilController.isExisting(newCode)) {
                System.out.println("Pupil already exists.");
            } else {
                break;
            }
        }
        System.out.print("Enter new pupil name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new pupil year of bỉth: ");
        int newYearOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new pupil's subject: ");
        String newSubject = scanner.nextLine();
        System.out.print("Enter new pupil's grade: ");
        String newGrade = scanner.nextLine();

        Pupil newPupil = new Pupil(newCode, newName, newYearOfBirth, newSubject, newGrade);
        pupilController.addNewPupil(newPupil);
        System.out.println("New pupil added.");
    }

    public void updatePupil() {
        System.out.print("Enter pupil code to update: ");
        String updatedCode = scanner.nextLine();
        Pupil updatedPupil = pupilController.findPupilByCode(updatedCode);
        if (updatedPupil != null) {
            System.out.println("Initiating the update sequence.");
            System.out.print("Enter new pupil name: ");
            String updatedName = scanner.nextLine();
            System.out.print("Enter new pupil year of birth: ");
            int updatedYearOfBirth = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter new pupil's subject: ");
            String updatedSubject = scanner.nextLine();
            System.out.print("Enter new pupil's grade: ");
            String updatedGrade = scanner.nextLine();

            updatedPupil.setCode(updatedCode);
            updatedPupil.setName(updatedName);
            updatedPupil.setYearOfBirth(updatedYearOfBirth);
            updatedPupil.setSubject(updatedSubject);
            updatedPupil.setGrade(updatedGrade);

            pupilController.updatePupil(updatedPupil);
            System.out.print("Update sequence succeeded. \n");
        } else {
            System.out.print("Pupil not found.");
        }
    }

    public void deletePupil() {
        System.out.print("Enter pupil code to delete: ");
        String deletedCode = scanner.nextLine();
        if (pupilController.isExisting(deletedCode)) {
            pupilController.deletePupil(deletedCode);
            System.out.print("Pupil deleted.");
        } else {
            System.out.print("Pupil not found.");
        }
    }

    public static void main(String[] args) {
        PupilManagement pupilManagement = new PupilManagement();
        pupilManagement.displayMainMenu();
    }
}
