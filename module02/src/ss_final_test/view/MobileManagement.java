package ss_final_test.view;

import ss_final_test.controller.MobileController;
import ss_final_test.exception.NotFoundProductException;
import ss_final_test.model.BrandNew;
import ss_final_test.model.Imported;
import ss_final_test.model.Mobile;
import ss_final_test.repo.BrandNewRepo;
import ss_final_test.repo.IBrandNewRepo;
import ss_final_test.repo.IImportedRepo;
import ss_final_test.repo.ImportedRepo;
import ss_final_test.service.BrandNewService;
import ss_final_test.service.IBrandNewService;
import ss_final_test.service.IImportedService;
import ss_final_test.service.ImportedService;

import java.util.List;
import java.util.Scanner;

public class MobileManagement {
    private MobileController controller;

    public MobileManagement(MobileController controller) {
        this.controller = controller;
    }

    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. View list");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addMobile();
                    break;
                case 2:
                    deleteMobile();
                    break;
                case 3:
                    viewAllMobiles();
                    break;
                case 4:
                    searchMobiles();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addMobile() {
        System.out.print("Enter type (1 for BrandNew, 2 for Imported): ");
        int type = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter manufacturer: ");
        String manufacturer = scanner.nextLine();

        if (type == 1) {
            System.out.print("Enter warranty days: ");
            int warrantyDays = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter warranty scope (Domestic or Global): ");
            String warrantyScope = scanner.nextLine();

            BrandNew mobile = new BrandNew(0, name, price, quantity, manufacturer, warrantyDays, warrantyScope);
            controller.addMobile(mobile);
        } else if (type == 2) {
            System.out.print("Enter country: ");
            String country = scanner.nextLine();

            System.out.print("Enter status (Not-yet-fixed or Fixed): ");
            String status = scanner.nextLine();

            Imported mobile = new Imported(0, name, price, quantity, manufacturer, country, status);
            controller.addMobile(mobile);
        }
    }

    private void deleteMobile() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            controller.deleteMobile(id);
            System.out.println("Mobile deleted successfully.");
        } catch (NotFoundProductException e) {
            System.out.println(e.getMessage());
        }
    }

    private void viewAllMobiles() {
        List<Mobile> mobiles = controller.viewAllMobiles();
        for (Mobile mobile : mobiles) {
            System.out.println(mobile);
        }
    }

    private void searchMobiles() {
        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine();

        List<Mobile> mobiles = controller.searchMobiles(keyword);
        for (Mobile mobile : mobiles) {
            System.out.println(mobile);
        }
    }


    public static void main(String[] args) {
        IBrandNewRepo brandNewRepo = new BrandNewRepo();
        IImportedRepo importedRepo = new ImportedRepo();

        IBrandNewService brandNewService = new BrandNewService(brandNewRepo);
        IImportedService importedService = new ImportedService(importedRepo);

        MobileController controller = new MobileController(brandNewService, importedService);

        MobileManagement management = new MobileManagement(controller);
        management.displayMenu();
    }
}
