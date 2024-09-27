package ss_final_test.repo;

import ss_final_test.model.Imported;

import java.util.List;

public interface IImportedRepo {
    void add(Imported mobile);
    boolean delete(int id);
    List<Imported> getAll();
    List<Imported> search(String keyword);
}