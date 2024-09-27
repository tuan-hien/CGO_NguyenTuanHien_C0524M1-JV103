package ss_case_study.repository.laptop_repository;

import ss_case_study.common.IOProductFile;
import ss_case_study.model.Laptop;
import ss_case_study.model.Product;

import java.util.ArrayList;
import java.util.List;

public class LaptopRepository implements ILaptopRepository {

    @Override
    public List<Product> getAllProducts() {
        return IOProductFile.readFromLaptopFile();
    }

    @Override
    public Product findById(String id) {
        List<Product> laptops = IOProductFile.readFromLaptopFile();
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
            System.out.println("Laptop added.");
        } else {
            System.out.println("Invalid product type.");
        }
    }

    @Override
    public void updateProduct(Product product) {
        if (!(product instanceof Laptop)) {
            System.out.println("Invalid product type.");
            return;
        }

        List<Product> laptops = IOProductFile.readFromLaptopFile();
        boolean isUpdated = false;
        for (int i = 0; i < laptops.size(); i++) {
            Product currentProduct = laptops.get(i);
            if (currentProduct instanceof Laptop && currentProduct.getId().equals(product.getId())) {
                laptops.set(i, product);
                isUpdated = true;
                break;
            }
        }
        if (isUpdated) {
            IOProductFile.writeAllLaptopsToFile(laptops);
            System.out.printf("Laptop with ID %s updated successfully.%n", product.getId());
        } else {
            System.out.println("Laptop with ID " + product.getId() + " not found.");
        }
    }

    @Override
    public void deleteProduct(String id) {
        List<Product> products = IOProductFile.readFromLaptopFile();
        int originalSize = products.size();
        products.removeIf(product -> product.getId().equals(id));

        if (products.size() < originalSize) {
            IOProductFile.writeAllLaptopsToFile(products);
            System.out.println("Laptop with ID " + id + " deleted.");
        } else {
            System.out.println("Laptop with ID " + id + " not found.");
        }
    }
}
