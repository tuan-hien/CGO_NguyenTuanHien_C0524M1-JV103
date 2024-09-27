package ss_final_test.repo;

import ss_final_test.model.BrandNew;

import java.util.List;

public interface IBrandNewRepo {
    void add(BrandNew mobile);
    boolean delete(int id);
    List<BrandNew> getAll();
    List<BrandNew> search(String keyword);
}
