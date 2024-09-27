package ss_case_study.common;

import ss_case_study.model.Cell;
import ss_case_study.model.Laptop;
import ss_case_study.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOProductFile {
    private static final String LAPTOP_PATH = "src/ss_case_study/data/laptop.csv";
    private static final String CELL_PATH = "src/ss_case_study/data/cell.csv";
    // chưa cập nhật cho Cell giống với Laptop

    public static void writeToLaptopFile(Laptop laptop) {
        try (BufferedWriter bwLaptop = new BufferedWriter(new FileWriter(LAPTOP_PATH, true))) {
            String laptopData = laptop.getId() + ", " + laptop.getName() + ", " +
                    laptop.getBrand() + ", " + laptop.getPrice() + ", " + laptop.getProcessor();
            bwLaptop.write(laptopData);
            bwLaptop.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static List<Product> readFromLaptopFile() {
//        List<Product> laptops = new ArrayList<>();
//        try (BufferedReader laptopBr = new BufferedReader(new FileReader(LAPTOP_PATH))) {
//            String temp;
//            while ((temp = laptopBr.readLine()) != null) {
//                String[] arrLaptop = temp.split(", ");
//                double laptopPrice = Double.parseDouble(arrLaptop[3]);
//                laptops.add(new Laptop(arrLaptop[0], arrLaptop[1], arrLaptop[2], laptopPrice, arrLaptop[4]));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return laptops;
//    }

    public static List<Product> readFromLaptopFile() {
        List<Product> laptops = new ArrayList<>();
        try (BufferedReader laptopBr = new BufferedReader(new FileReader(LAPTOP_PATH))) {
            String temp;
            while ((temp = laptopBr.readLine()) != null) {
                String[] arrLaptop = temp.split(", ");
                // Check if the array has at least 5 elements
                if (arrLaptop.length >= 5) {
                    double laptopPrice = Double.parseDouble(arrLaptop[3]);
                    laptops.add(new Laptop(arrLaptop[0], arrLaptop[1], arrLaptop[2], laptopPrice, arrLaptop[4]));
                } else {
                    System.out.println("Continue, please");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return laptops;
    }

    public static void writeAllLaptopsToFile(List<Product> laptops) {
        try (BufferedWriter bwLaptop = new BufferedWriter(new FileWriter(LAPTOP_PATH))) {
            for (Product product : laptops) {
                if (product instanceof Laptop) {
                    Laptop laptop = (Laptop) product;
                    String laptopData = laptop.getId() + ", " + laptop.getName() + ", " +
                            laptop.getBrand() + ", " + laptop.getPrice() + ", " + laptop.getProcessor();
                    bwLaptop.write(laptopData);
                    bwLaptop.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToCellFile(Cell cell) {
        try (BufferedWriter bwCell = new BufferedWriter(new FileWriter(CELL_PATH, true))) {
            String cellData = cell.getId() + ", " + cell.getName() + ", " +
                    cell.getBrand() + ", " + cell.getPrice() + ", " + cell.getCapacity();
            bwCell.write(cellData);
            bwCell.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Cell> readFromCellFile() {
        List<Cell> cells = new ArrayList<>();
        try (BufferedReader cellBr = new BufferedReader(new FileReader(CELL_PATH))) {
            String temp;
            while ((temp = cellBr.readLine()) != null) {
                String[] arrCell = temp.split(", ");
                double cellPrice = Double.parseDouble(arrCell[3]);
                int cellCapacity = Integer.parseInt(arrCell[4]);
                cells.add(new Cell(arrCell[0], arrCell[1], arrCell[2], cellPrice, cellCapacity));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cells;
    }
}
