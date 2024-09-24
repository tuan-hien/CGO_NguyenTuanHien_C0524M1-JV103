package ss_case_study.view;

import ss12_java_collection_framework.view.PupilManagement;
import ss_case_study.controller.ProductController;
import ss_case_study.model.Cell;
import ss_case_study.model.Laptop;
import ss_case_study.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private ProductController productController = new ProductController();
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        do {
            System.out.println("\nMain menu \n" +
                    "1. Laptop \n" +
                    "2. Cell \n" +
                    "3. Exit");

            System.out.print("Enter your choice: ");
            int mainChoice = scanner.nextInt();
            switch (mainChoice) {
                case 1:
                    displayLaptopMenu();
                    break;
                case 2:
                    displayCellMenu();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (true);
    }

    public void displayLaptopMenu() {
        do {
            System.out.println("\nLaptop menu \n" +
                    "1. View laptop list \n" +
                    "2. Add new laptop \n" +
                    "3. Update laptop \n" +
                    "4. Delete laptop \n" +
                    "5. Back to main menu");

            System.out.print("Enter your choice: ");
            int laptopChoice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới còn sót lại sau khi nhập số
            switch (laptopChoice) {
                case 1:
                    List<Product> laptops = productController.getAllLaptops();
                    for (Product laptop : laptops) {
                        System.out.println(laptop);
                    }
                    break;
                case 2:
                    addNewLaptop();
                    break;
                case 3:
                    updateLaptop();
                    break;
                case 4:
                    deleteLaptop();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (true);
    }

    public void addNewLaptop() {
        String newLaptopID;
        System.out.print("Enter laptop ID: ");
        newLaptopID = scanner.nextLine();
        if (productController.isExistingLaptop(newLaptopID)) {
            System.out.println("Laptop already exists.");
            return;
        }
        System.out.print("Enter laptop name: ");
        String newLaptopName = scanner.nextLine();
        System.out.print("Enter laptop brand: ");
        String newLaptopBrand = scanner.nextLine();
        System.out.print("Enter laptop price: ");
        double newLaptopPrice = scanner.nextDouble();
        scanner.nextLine(); // dòng này để xử lý ký tự dòng mới sau khi nhập double
        System.out.print("Enter laptop processor: ");
        String newLaptopProcessor = scanner.nextLine();

        Laptop newLaptop = new Laptop(newLaptopID, newLaptopName, newLaptopBrand, newLaptopPrice, newLaptopProcessor);
        productController.addLaptop(newLaptop);
        System.out.println("New laptop added.");
    }

    public void updateLaptop() {
        System.out.print("Enter laptop ID to update: ");
        String updateLaptopID = scanner.nextLine();
        Product updatedLaptop = (Laptop) productController.findLaptopById(updateLaptopID);
        if (updatedLaptop != null) {
            System.out.print("Update laptop name: ");
            String updateLaptopName = scanner.nextLine();
            System.out.print("Update laptop brand: ");
            String updateLaptopBrand = scanner.nextLine();
            System.out.print("Update laptop price: ");
            double updateLaptopPrice = scanner.nextDouble();
            scanner.nextLine(); // dòng này để xử lý ký tự dòng mới sau khi nhập double
            System.out.print("Update laptop processor: ");
            String updateLaptopProcessor = scanner.nextLine();

            updatedLaptop.setId(updateLaptopID);
            updatedLaptop.setName(updateLaptopName);
            updatedLaptop.setBrand(updateLaptopBrand);
            updatedLaptop.setPrice(updateLaptopPrice);
            ((Laptop) updatedLaptop).setProcessor(updateLaptopProcessor);

            productController.updateLaptop(updatedLaptop);
            System.out.println("Laptop updated.");
        } else {
            System.out.println("Laptop not found.");
        }
    }

    public void deleteLaptop() {
        System.out.print("Enter laptop ID to delete: ");
        String deleteLaptopID = scanner.nextLine();
        if (productController.isExistingLaptop(deleteLaptopID)) {
            productController.deleteLaptop(deleteLaptopID);
            System.out.println("Laptop deleted.");
        } else {
            System.out.println("Laptop not found.");
        }
    }


    public void displayCellMenu() {
        do {
            System.out.println("\nCell menu \n" +
                    "1. View cell list \n" +
                    "2. Add new cell \n" +
                    "3. Update cell \n" +
                    "4. Delete cell \n" +
                    "5. Back to main menu");

            System.out.print("Enter your choice: ");
            int cellChoice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới còn sót lại sau khi nhập số
            switch (cellChoice) {
                case 1:
                    List<Product> cells = productController.getAllCells();
                    for (Product cell : cells) {
                        System.out.println(cell);
                    }
                    break;
                case 2:
                    addNewCell();
                    break;
                case 3:
                    updateCell();
                    break;
                case 4:
                    deleteCell();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (true);
    }

    public void addNewCell() {
        String newCellID;
        System.out.print("Enter cell ID: ");
        newCellID = scanner.nextLine();
        if (productController.isExistingCell(newCellID)) {
            System.out.println("Cell already exists.");
            return;
        }
        System.out.print("Enter cell name: ");
        String newCellName = scanner.nextLine();
        System.out.print("Enter cell brand: ");
        String newCellBrand = scanner.nextLine();
        System.out.print("Enter cell price: ");
        double newCellPrice = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng mới còn sót lại sau khi nhập số
        System.out.print("Enter cell capacity: ");
        int newCellCapacity = Integer.parseInt(scanner.nextLine());

        Cell newCell = new Cell(newCellID, newCellName, newCellBrand, newCellPrice, newCellCapacity);
        productController.addCell(newCell);
        System.out.println("New cell added.");
    }

    public void updateCell() {
        System.out.print("Enter cell ID to update: ");
        String updateCellID = scanner.nextLine();
        Product updatedCell = (Cell) productController.findCellById(updateCellID);
        if (updatedCell != null) {
            System.out.print("Update cell name: ");
            String updateCellName = scanner.nextLine();
            System.out.print("Update cell brand: ");
            String updateCellBrand = scanner.nextLine();
            System.out.print("Update cell price: ");
            double updateCellPrice = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng mới còn sót lại sau khi nhập số
            System.out.print("Update cell capacity: ");
            int updateCellCapacity = Integer.parseInt(scanner.nextLine());

            updatedCell.setId(updateCellID);
            updatedCell.setName(updateCellName);
            updatedCell.setBrand(updateCellBrand);
            updatedCell.setPrice(updateCellPrice);
            ((Cell) updatedCell).setCapacity(updateCellCapacity);

            productController.updateCell(updatedCell);
            System.out.println("Cell updated.");
        } else {
            System.out.println("Cell not found.");
        }
    }

    public void deleteCell() {
        System.out.print("Enter cell ID to delete: ");
        String deleteCellID = scanner.nextLine();
        if (productController.isExistingCell(deleteCellID)) {
            productController.deleteCell(deleteCellID);
            System.out.println("Cell deleted.");
        } else {
            System.out.println("Cell not found.");
        }
    }



    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        productManagement.displayMainMenu();
    }
}
