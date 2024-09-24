package ss_case_study.repository.laptop_repository;

import ss_case_study.common.IOProductFile;
import ss_case_study.model.Cell;
import ss_case_study.model.Laptop;
import ss_case_study.model.Product;

import java.util.ArrayList;
import java.util.List;

public class LaptopRepository implements ILaptopRepository {
    private static List<Product> laptops = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        return laptops;
    }

    @Override
    public Product findById(String id) {
        for (Product product : laptops) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        if (product instanceof Laptop) {
            Laptop laptop = (Laptop) product;
            IOProductFile.writeToLaptopFile(laptop);
//            laptops.add((Laptop) product);
            System.out.println("Laptop added.");
        } else {
            System.out.println("Invalid product type.");
        }
    }

    @Override
    public void updateProduct(Product product) {
        if (product instanceof Laptop) {
            for (int i = 0; i < laptops.size(); i++) {
                if (laptops.get(i).getId().equals(product.getId())) {
                    laptops.set(i, product);
                    System.out.println("Laptop updated.");
                    return;
                }
            }
            System.out.println("Laptop not found.");
        } else {
            System.out.println("Invalid product type.");
        }
    }

    @Override
    public void deleteProduct(String id) {
        laptops.removeIf(product -> product.getId().equals(id));
        System.out.println("Delete laptop.");
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
