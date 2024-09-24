package ss_case_study.repository.cell_repository;

import ss_case_study.model.Product;
import ss_case_study.repository.IProductRepository;

import java.util.List;
//what to do

public interface ICellRepository extends IProductRepository {
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

//    void getCapacity(int capacity);
}
