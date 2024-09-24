package ss_case_study.service.cell_service;

import ss_case_study.model.Cell;
import ss_case_study.model.Product;
import ss_case_study.repository.cell_repository.CellRepository;
import ss_case_study.repository.cell_repository.ICellRepository;

import java.util.List;

public class CellService implements ICellService {
    private ICellRepository cellRepository = new CellRepository();

    @Override
    public List<Product> getAllProducts() {
        return cellRepository.getAllProducts();
    }

    @Override
    public Product findById(String id) {
        return cellRepository.findById(id);
    }

    @Override
    public void addProduct(Product product) {
        if (product instanceof Cell) {
            cellRepository.addProduct(product);
        } else {
            throw new IllegalArgumentException("Invalid product type. Cell expected.");
        }
    }

    @Override
    public void updateProduct(Product product) {
        if (product instanceof Cell) {
            cellRepository.updateProduct(product);
        } else {
            throw new IllegalArgumentException("Invalid product type. Cell expected.");
        }
    }

    @Override
    public void deleteProduct(String id) {
        cellRepository.deleteProduct(id);
    }
}
