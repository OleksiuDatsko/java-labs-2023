package ua.lviv.iot.algo.part1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GardenWriter {
    public static final String RESULT_FILE_PATH = "src\\main\\java\\resources\\gardens.csv";

    public void writeToFile(List<Garden> gardens) throws IOException {

        if (gardens == null || gardens.isEmpty()) {
            return;
        }
        try (FileWriter writer = new FileWriter(RESULT_FILE_PATH);) {
            for (var garden : gardens) {
                writer.write(garden.getHeaders());
                writer.write(" \r\n");
                writer.write(garden.getCommaSeparatedValues());
                writer.write(" \r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void groupedWriteToFile(List<Garden> gardens) {
        if (gardens == null || gardens.isEmpty()) {
            return;
        }

        try (FileWriter writer = new FileWriter(RESULT_FILE_PATH);) {
            Collections.sort(gardens, Comparator.comparing((garden -> garden.getClass().getSimpleName())));
            var gardenType = gardens.get(0).getClass().getSimpleName();
            writer.write(gardenType + "\n");
            writer.write(gardens.get(0).getHeaders() + "\n");
            for(var garden: gardens){
                if(garden.getClass().getSimpleName() != gardenType){
                    gardenType = garden.getClass().getSimpleName();
                    writer.write("\n" + gardenType + "\n");
                    writer.write(garden.getHeaders() + "\n");
                }
                writer.write(garden.getCommaSeparatedValues());
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
