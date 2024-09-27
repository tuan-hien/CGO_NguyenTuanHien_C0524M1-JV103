package ss_final_test.repo;

import ss_final_test.common.IOMobileFile;
import ss_final_test.model.BrandNew;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BrandNewRepo implements IBrandNewRepo {
    private static final String FILE_PATH = "src/ss_final_test/data/mobiles.csv";

    @Override
    public void add(BrandNew mobile) {
        try {
            List<String[]> data = IOMobileFile.readCSV(FILE_PATH);
            data.add(mobile.toString().split(","));
            IOMobileFile.writeCSV(FILE_PATH, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            List<String[]> data = IOMobileFile.readCSV(FILE_PATH);
            boolean removed = data.removeIf(line -> Integer.parseInt(line[0]) == id);
            IOMobileFile.writeCSV(FILE_PATH, data);
            return removed;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<BrandNew> getAll() {
        List<BrandNew> mobiles = new ArrayList<>();
        try {
            List<String[]> data = IOMobileFile.readCSV(FILE_PATH);
            for (String[] line : data) {
                if (line.length > 5) { // Check if it's a BrandNew phone
                    BrandNew mobile = new BrandNew(
                            Integer.parseInt(line[0]),
                            line[1],
                            Double.parseDouble(line[2]),
                            Integer.parseInt(line[3]),
                            line[4],
                            Integer.parseInt(line[5]),
                            line[6]
                    );
                    mobiles.add(mobile);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mobiles;
    }

    @Override
    public List<BrandNew> search(String keyword) {
        List<BrandNew> result = new ArrayList<>();
        for (BrandNew mobile : getAll()) {
            if (mobile.toString().contains(keyword)) {
                result.add(mobile);
            }
        }
        return result;
    }
}
