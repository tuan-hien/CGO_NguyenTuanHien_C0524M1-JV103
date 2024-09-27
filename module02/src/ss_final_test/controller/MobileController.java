package ss_final_test.controller;

import ss_final_test.exception.NotFoundProductException;
import ss_final_test.model.BrandNew;
import ss_final_test.model.Imported;
import ss_final_test.model.Mobile;
import ss_final_test.service.BrandNewService;
import ss_final_test.service.IBrandNewService;
import ss_final_test.service.IImportedService;
import ss_final_test.service.ImportedService;

import java.util.ArrayList;
import java.util.List;

public class MobileController {

    private final IBrandNewService brandNewService;
    private final IImportedService importedService;

    public MobileController(IBrandNewService brandNewService, IImportedService importedService) {
        this.brandNewService = brandNewService;
        this.importedService = importedService;
    }

    public void addMobile(Mobile mobile) {
        if (mobile instanceof BrandNew) {
            brandNewService.addMobile((BrandNew) mobile);
        } else if (mobile instanceof Imported) {
            importedService.addMobile((Imported) mobile);
        }
    }

    public void deleteMobile(int id) throws NotFoundProductException {
        if (!brandNewService.deleteMobile(id) && !importedService.deleteMobile(id)) {
            throw new NotFoundProductException("ID điện thoại không tồn tại.");
        }
    }

    public List<Mobile> viewAllMobiles() {
        List<Mobile> mobiles = new ArrayList<>();
        mobiles.addAll(brandNewService.getAllMobiles());
        mobiles.addAll(importedService.getAllMobiles());
        return mobiles;
    }

    public List<Mobile> searchMobiles(String keyword) {
        List<Mobile> result = new ArrayList<>();
        result.addAll(brandNewService.searchMobiles(keyword));
        result.addAll(importedService.searchMobiles(keyword));
        return result;
    }
}
