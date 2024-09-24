package ss_case_study.controller;

import ss_case_study.model.Product;
import ss_case_study.service.IProductService;
import ss_case_study.service.cell_service.CellService;
import ss_case_study.service.laptop_service.LaptopService;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private IProductService cellService = new CellService();

        public List<Product> getAllCells() {
            return cellService.getAllProducts();
        }

        public Product findCellById(String id) {
            return cellService.findById(id);
        }

        public void addCell(Product product) {
            cellService.addProduct(product);
        }

        public void updateCell(Product product) {
            cellService.updateProduct(product);
        }

        public void deleteCell(String id) {
            cellService.deleteProduct(id);
        }

        public boolean isExistingCell(String id) {
            return cellService.findById(id) != null;
        }

    private IProductService laptopService = new LaptopService();

        public List<Product> getAllLaptops() {
            return laptopService.getAllProducts();
        }

        public Product findLaptopById(String id) {
            return laptopService.findById(id);
        }

        public void addLaptop(Product product) {
            laptopService.addProduct(product);
        }

        public void updateLaptop(Product product) {
            laptopService.updateProduct(product);
        }

        public void deleteLaptop(String id) {
            laptopService.deleteProduct(id);
        }

        public boolean isExistingLaptop(String id) {
            return laptopService.findById(id) != null;
        }
}
