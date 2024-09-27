package ss_final_test.service;

import ss_final_test.model.Imported;

import java.util.List;

public interface IImportedService {
    void addMobile(Imported mobile);
    boolean deleteMobile(int id);
    List<Imported> getAllMobiles();
    List<Imported> searchMobiles(String keyword);
}
