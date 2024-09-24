package ss_case_study.service.laptop_service;

import ss_case_study.model.Laptop;
import ss_case_study.model.Product;
import ss_case_study.repository.laptop_repository.ILaptopRepository;
import ss_case_study.repository.laptop_repository.LaptopRepository;

import java.util.List;

public class LaptopService implements ILaptopService{
    private ILaptopRepository laptopRepository = new LaptopRepository();

    @Override
    public List<Product> getAllProducts() {
        return laptopRepository.getAllProducts();
    }

    @Override
    public Product findById(String id) {
        return laptopRepository.findById(id);
    }

    @Override
    public void addProduct(Product product) {
        if (product instanceof Laptop) {
            laptopRepository.addProduct(product);
        } else {
            throw new IllegalArgumentException("Invalid product type. Laptop expected.");
        }
    }

    @Override
    public void updateProduct(Product product) {
        if (product instanceof Laptop) {
            laptopRepository.updateProduct(product);
        } else {
            throw new IllegalArgumentException("Invalid product type. Laptop expected.");
        }
    }

    @Override
    public void deleteProduct(String id) {
        laptopRepository.deleteProduct(id);
    }
}
