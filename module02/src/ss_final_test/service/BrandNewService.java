package ss_final_test.service;

import ss_final_test.model.BrandNew;
import ss_final_test.repo.IBrandNewRepo;

import java.util.List;

public class BrandNewService implements IBrandNewService {
    private final IBrandNewRepo repo;

    public BrandNewService(IBrandNewRepo repo) {
        this.repo = repo;
    }

    @Override
    public void addMobile(BrandNew mobile) {
        repo.add(mobile);
    }

    @Override
    public boolean deleteMobile(int id) {
        return repo.delete(id);
    }

    @Override
    public List<BrandNew> getAllMobiles() {
        return repo.getAll();
    }

    @Override
    public List<BrandNew> searchMobiles(String keyword) {
        return repo.search(keyword);
    }
}
