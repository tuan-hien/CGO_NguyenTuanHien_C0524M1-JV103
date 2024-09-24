package ss_case_study.repository.laptop_repository;

import ss_case_study.model.Product;
import ss_case_study.repository.IProductRepository;

import java.util.List;

public interface ILaptopRepository extends IProductRepository {
    @Override
    List<Product> getAllProducts();

    @Override
    Product findById(String id);

    @Override
    void addProduct(Product product);

    @Override
    void updateProduct(Product product);

    @Override
    void deleteProduct(String id);

//    void getProcessor(String id);
}
