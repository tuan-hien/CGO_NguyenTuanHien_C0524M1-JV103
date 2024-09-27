package ss_final_test.service;

import ss_final_test.model.BrandNew;

import java.util.List;

public interface IBrandNewService {
    void addMobile(BrandNew mobile);
    boolean deleteMobile(int id);
    List<BrandNew> getAllMobiles();
    List<BrandNew> searchMobiles(String keyword);
}
