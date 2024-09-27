package ss_final_test.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOMobileFile {
    public static List<String[]> readCSV(String filePath) throws IOException {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line.split(", "));
            }
        }
        return data;
    }

    public static void writeCSV(String filePath, List<String[]> data) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String[] line : data) {
                bw.write(String.join(", ", line));
                bw.newLine();
            }
        }
    }
}
