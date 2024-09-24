package ss12_java_collection_framework.repository.pupil;

import ss12_java_collection_framework.model.Pupil;

import java.util.List;

public interface IPupilRepository {
    void addNewPupil(Pupil pupil);
    List<Pupil> getAllPupils();
    Pupil findPupilByCode(String code);
    void updatePupil(Pupil pupil);
    void deletePupil(String code);
}
