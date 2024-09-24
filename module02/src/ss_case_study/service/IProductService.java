package ss_case_study.service;

import ss_case_study.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    Product findById(String id);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(String id);
}
