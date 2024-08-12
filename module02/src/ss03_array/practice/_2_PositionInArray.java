package ss03_array.practice;

import java.util.Scanner;

public class _2_PositionInArray {
    public static void main(String[] args) {
        String[] students = new String[10];
        students[0] = "Oliver";
        students[1] = "Jack";
        students[2] = "Harry";
        students[3] = "Charlie";
        students[4] = "Emily";
        students[5] = "Sophie";
        students[6] = "Isabella";
        students[7] = "Emma";
        students[8] = "Liam";
        students[9] = "David";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(studentName)) {
                System.out.println("Position of student " + studentName + " is " + i);
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Not found student " + studentName + " in the list.");
        }
    }
}
