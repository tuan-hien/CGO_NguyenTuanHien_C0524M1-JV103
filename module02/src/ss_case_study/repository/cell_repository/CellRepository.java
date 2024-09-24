package ss_case_study.repository.cell_repository;

import ss_case_study.common.IOProductFile;
import ss_case_study.model.Cell;
import ss_case_study.model.Laptop;
import ss_case_study.model.Product;

import java.util.ArrayList;
import java.util.List;

public class CellRepository implements ICellRepository {
    private static List<Product> cells = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        return cells;
    }

    @Override
    public Product findById(String id) {
        for (Product product : cells) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        if (product instanceof Cell) {
            Cell cell = (Cell) product;
            IOProductFile.writeToCellFile(cell);
//            cells.add(product);
            System.out.println("Cell added.");
        } else {
            System.out.println("Invalid product type.");
        }
    }

    @Override
    public void updateProduct(Product product) {
        if (product instanceof Laptop) {
            for (int i = 0; i < cells.size(); i++) {
                if (cells.get(i).getId().equals(product.getId())) {
                    cells.set(i, product);
                    System.out.println("Cell updated.");
                    return;
                }
            }
            System.out.println("Cell not found.");
        } else {
            System.out.println("Invalid product type.");
        }
    }

    @Override
    public void deleteProduct(String id) {
        cells.removeIf(product -> product.getId().equals(id));
        System.out.println("Delete cell.");
    }

//    @Override
//    public void getProcessor(String id) {
//        Product product = findById(id);
//        if (product instanceof Laptop) {
//            Laptop laptop = (Laptop) product;
//            System.out.println("Processor: " + laptop.getProcessor());
//        } else {
//            System.out.println("Product is not Laptop.");
//        }
//    }
}
