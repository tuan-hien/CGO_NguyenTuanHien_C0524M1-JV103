package ss_case_study.repository;

import ss_case_study.model.Product;

import java.util.List;

//what to do
public interface IProductRepository {
    List<Product> getAllProducts();
    Product findById(String id);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(String id);
}
