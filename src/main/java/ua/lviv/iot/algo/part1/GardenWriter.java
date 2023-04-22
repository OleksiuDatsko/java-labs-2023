package ua.lviv.iot.algo.part1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GardenWriter {
    public static final String RESULT_FILE_PATH = "src\\main\\java\\resources\\gardens.csv";
    public static final String NEW_LINE = "\n";

    public void groupedWriteToFile(List<Garden> gardens) {
        if (gardens == null || gardens.isEmpty()) {
            return;
        }

        try (FileWriter writer = new FileWriter(RESULT_FILE_PATH);) {
            Collections.sort(gardens, Comparator.comparing((garden -> garden.getClass().getSimpleName())));
            var gardenType = gardens.get(0).getClass().getSimpleName();
            writer.write(gardenType + NEW_LINE);
            writer.write(gardens.get(0).getHeaders() + NEW_LINE);
            for (var garden : gardens) {
                if (!garden.getClass().getSimpleName().equals(gardenType)) {
                    gardenType = garden.getClass().getSimpleName();
                    writer.write(NEW_LINE + gardenType + NEW_LINE);
                    writer.write(garden.getHeaders() + NEW_LINE);
                }
                writer.write(garden.getCommaSeparatedValues());
                writer.write(NEW_LINE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
