package ss_case_study.common;

import ss_case_study.model.Cell;
import ss_case_study.model.Laptop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOProductFile {
    private static final String LAPTOP_PATH = "ss_case_study/data/laptop.csv";
    private static final String CELL_PATH = "ss_case_study/data/cell.csv";

    public static void writeToLaptopFile(Laptop laptop) {
        try {
            FileWriter laptopFileWriter = new FileWriter(LAPTOP_PATH, true);
            BufferedWriter bwLaptop = new BufferedWriter(laptopFileWriter);
            String laptopData = laptop.getId() + ", " + laptop.getName() + ", " +
                    laptop.getBrand() + ", " + laptop.getPrice() + ", " + laptop.getProcessor();
            bwLaptop.write(laptopData);
//            bwLaptop.flush();
            bwLaptop.newLine();
            bwLaptop.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Laptop> readFromLaptopFile() {
        List<Laptop> laptops = new ArrayList<>();
        try {
            FileReader laptopFileReader = new FileReader(LAPTOP_PATH);
            BufferedReader laptopBr = new BufferedReader(laptopFileReader);
            while (true) {
                String temp = laptopBr.readLine();
                if (temp == null) {
                    break;
                }
                String[] arrLaptop = temp.split(", ");
                double laptopPrice = Double.parseDouble(arrLaptop[3]);
                laptops.add(new Laptop(arrLaptop[0], arrLaptop[1], arrLaptop[2], laptopPrice, arrLaptop[4]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return laptops;
    }

    public static void writeToCellFile(Cell cell) {
        try {
            FileWriter cellFileWriter = new FileWriter(CELL_PATH, true);
            BufferedWriter bwCell = new BufferedWriter(cellFileWriter);
            String cellData = cell.getId() + ", " + cell.getName() + ", " +
                    cell.getBrand() + ", " + cell.getPrice() + ", " + cell.getCapacity();
            bwCell.write(cellData);
//            bwCell.flush();
            bwCell.newLine();
            bwCell.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Cell> readFromCellFile() {
        List<Cell> cells = new ArrayList<>();
        try {
            FileReader cellFileReader = new FileReader(CELL_PATH);
            BufferedReader cellBr = new BufferedReader(cellFileReader);
            while (true) {
                String temp = cellBr.readLine();
                if (temp == null) {
                    break;
                }
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
