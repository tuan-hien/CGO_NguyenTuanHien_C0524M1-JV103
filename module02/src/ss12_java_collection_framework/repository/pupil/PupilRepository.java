package ss12_java_collection_framework.repository.pupil;

import ss12_java_collection_framework.model.Pupil;

import java.util.ArrayList;
import java.util.List;

public class PupilRepository implements IPupilRepository{
    private static List<Pupil> pupils = new ArrayList<>();
    static {
        pupils.add(new Pupil("001", "Nguyễn Văn Một", 2001, "math", "A+"));
        pupils.add(new Pupil("002", "Nguyễn Văn Hai", 2002, "physic", "A"));
    }

    @Override
    public List<Pupil> getAllPupils() {return pupils;}

    @Override
    public void addNewPupil(Pupil pupil) {
        pupils.add(pupil);
    }

    @Override
    public Pupil findPupilByCode(String code) {
        for (Pupil p : pupils) {
            if (p.getCode().equals(code)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void updatePupil(Pupil pupil) {
        for (int i = 0; i < pupils.size(); i++) {
            if (pupils.get(i).getCode().equals(pupil.getCode())) {
                pupils.set(i, pupil);
                return;
            }
        }
    }

    @Override
    public void deletePupil(String code) {
        pupils.removeIf(pupil -> pupil.getCode().equals(code));
    }
}
