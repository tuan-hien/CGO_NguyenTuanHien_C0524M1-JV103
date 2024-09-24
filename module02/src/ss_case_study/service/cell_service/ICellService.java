package ss_case_study.service.cell_service;

import ss_case_study.model.Product;
import ss_case_study.service.IProductService;

import java.util.List;

public interface ICellService extends IProductService {
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

//    void doSmthCapacity(String id);
}
