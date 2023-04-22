package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class GardenWriterTest {
    private static final String EXPECTED_SORTED_FILE = "src\\test\\java\\resources\\expected_sorted.csv";

    private GardenWriter gardenWriter;
    private GardenManager gardens;

    @BeforeEach
    void setUp() throws IOException {
        gardenWriter = new GardenWriter();
        gardens = new GardenManager();

        Garden[] gardensToAdd = {
                new BotanicGarden(2.0, 5),
                new UniversityGarden(0.75, 16),
                new UrbanGarden(0.002, false, 25),
                new UniversityGarden(2.4, 25),
                new FarmGarden(10.5, 8),
                new BotanicGarden(130, 5),
                new UrbanGarden(0.001, true, 10),
                new FarmGarden(9.8, 15),
        };
        gardens.addGardens(gardensToAdd);
    }

    @Test
    public void testGroupedWriteNull() {
        gardenWriter.groupedWriteToFile(null);
        File resultFile = new File(GardenWriter.RESULT_FILE_PATH);
        assertFalse(resultFile.exists());
    }

    @Test
    public void testGroupedWriteEmptyList() throws IOException {
        List<Garden> emptyList = new LinkedList<>();
        gardenWriter.groupedWriteToFile(emptyList);
        File resultFile = new File(GardenWriter.RESULT_FILE_PATH);
        assertFalse(resultFile.exists());
    }

    @Test
    public void testGroupedWriteToFileGardens() throws IOException {
        gardenWriter.groupedWriteToFile(gardens.getGardens());
        Path expected = (new File(EXPECTED_SORTED_FILE)).toPath();
        Path actual = new File(GardenWriter.RESULT_FILE_PATH).toPath();

        assertEquals(-1L, Files.mismatch(expected, actual));
    }

    @Test
    public void testGroupedRewriteToFileGardens() throws IOException {
        try (FileWriter testWriter = new FileWriter(GardenWriter.RESULT_FILE_PATH)) {
            testWriter.write("test test to rewrite");
        } catch (IOException e) {
            e.printStackTrace();
        }
        testGroupedWriteToFileGardens();
    }

    @AfterEach
    public void afterEach() throws IOException {
        Files.deleteIfExists(Path.of(GardenWriter.RESULT_FILE_PATH));
    }
}