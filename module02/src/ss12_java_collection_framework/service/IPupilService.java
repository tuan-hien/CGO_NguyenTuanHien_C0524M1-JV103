package ss12_java_collection_framework.service;

import ss12_java_collection_framework.model.Pupil;

import java.util.List;

public interface IPupilService {
    void addNewPupil(Pupil pupil);
    List<Pupil> getAllPupils();
    Pupil findPupilByCode(String code);
    void updatePupil(Pupil pupil);
    void deletePupil(String code);
}
