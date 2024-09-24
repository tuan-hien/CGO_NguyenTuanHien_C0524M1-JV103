package ss12_java_collection_framework.controller;

import ss12_java_collection_framework.model.Pupil;
import ss12_java_collection_framework.service.IPupilService;
import ss12_java_collection_framework.service.PupilService;

import java.util.List;
import java.util.Scanner;

public class PupilController {
    private IPupilService iPupilService = new PupilService();
    private Scanner scanner = new Scanner(System.in);

    public List<Pupil> displayAllPupils() {
        List<Pupil> pupils = iPupilService.getAllPupils();
        for (Pupil pupil : pupils) {
            if (pupil != null) {
                System.out.println(pupil);
            }
        }
        return pupils;
    }

    public void addNewPupil(Pupil pupil) {
        iPupilService.addNewPupil(pupil);
    }

    public Pupil findPupilByCode(String code) {
        return iPupilService.findPupilByCode(code);
    }

    public boolean isExisting(String code) {
        return iPupilService.findPupilByCode(code) != null;
    }

    public void updatePupil(Pupil pupil) {
        iPupilService.updatePupil(pupil);
    }

    public void deletePupil(String code) {
        iPupilService.deletePupil(code);
    }
}
