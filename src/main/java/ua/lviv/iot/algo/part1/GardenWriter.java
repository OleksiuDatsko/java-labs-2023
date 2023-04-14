package ua.lviv.iot.algo.part1;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

public class GardenWriter {
    public static String RESULT_FILE_PATH = "src\\main\\java\\resources\\gardens.csv";

    public void writeToFile(List<Garden> gardens) throws IOException {

        if (gardens == null || gardens.isEmpty()) {
            return;
        }
        try (FileWriter writer = new FileWriter(RESULT_FILE_PATH);) {
            for (var garden : gardens) {
                writer.write(garden.getHeaders());
                writer.write(" \r\n");
                writer.write(garden.getCSV());
                writer.write(" \r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortWriteToFile(List<Garden> gardens) {
        if (gardens == null || gardens.isEmpty()) {
            return;
        }

        List<Class<? extends Garden>> gardensType = gardens.stream()
                .map(garden -> garden.getClass())
                .distinct()
                .collect(Collectors.toList());

        try (FileWriter writer = new FileWriter(RESULT_FILE_PATH);) {
            for (var gardenType : gardensType) {
                writer.write(gardenType
                        .getTypeName()
                        .replaceAll("ua.lviv.iot.algo.part1.", ""));
                writer.write("\n");

                writer.write(String.valueOf(gardenType
                        .getDeclaredMethod("getHeaders")
                        .invoke(gardenType.getDeclaredConstructor().newInstance())
                ));
                writer.write("\n");
                for (var garden : gardens) {
                    if (gardenType == garden.getClass()) {
                        writer.write(garden.getCSV());
                        writer.write("\n");
                    }
                }
                writer.write("\n");
            }
        } catch (IOException |
                 NoSuchMethodException |
                 InvocationTargetException |
                 IllegalAccessException |
                 InstantiationException e) {
            e.printStackTrace();
        }
    }
}
