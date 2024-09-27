package ss_final_test.service;

import ss_final_test.model.Imported;
import ss_final_test.repo.IImportedRepo;
import ss_final_test.repo.ImportedRepo;

import java.util.List;

public class ImportedService implements IImportedService{
    private final IImportedRepo repo;

    public ImportedService(IImportedRepo repo) {
        this.repo = repo;
    }

    @Override
    public void addMobile(Imported mobile) {
        repo.add(mobile);
    }

    @Override
    public boolean deleteMobile(int id) {
        return repo.delete(id);
    }

    @Override
    public List<Imported> getAllMobiles() {
        return repo.getAll();
    }

    @Override
    public List<Imported> searchMobiles(String keyword) {
        return repo.search(keyword);
    }
}
