package ss12_java_collection_framework.service;

import ss12_java_collection_framework.model.Pupil;
import ss12_java_collection_framework.repository.pupil.IPupilRepository;
import ss12_java_collection_framework.repository.pupil.PupilRepository;

import java.util.List;

public class PupilService implements IPupilService {
    private IPupilRepository iPupilRepository = new PupilRepository();

    @Override
    public void addNewPupil(Pupil pupil) {
        iPupilRepository.addNewPupil(pupil);
    }

    @Override
    public List<Pupil> getAllPupils() {
        return iPupilRepository.getAllPupils();
    }

    @Override
    public Pupil findPupilByCode(String code) {
        return iPupilRepository.findPupilByCode(code);
    }

    @Override
    public void updatePupil(Pupil pupil) {
        iPupilRepository.updatePupil(pupil);
    }

    @Override
    public void deletePupil(String code) {
        iPupilRepository.deletePupil(code);
    }
}
