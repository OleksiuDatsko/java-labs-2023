package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GardenManagerTest {
    GardenManager gardens;

    @BeforeEach
    public void setUp() throws Exception {
        gardens = new GardenManager();

        Garden[] gardensToAdd = {
                new BotanicGarden(2.0, 5),
                new BotanicGarden(130, 5),
                new UniversityGarden(0.75, 16),
                new UniversityGarden(2.4, 25),
                new UrbanGarden(0.001, true, 10),
                new UrbanGarden(0.002, false, 25),
                new FarmGarden(10.5, 8),
                new FarmGarden(9.8, 15),
        };
        gardens.addGarden(gardensToAdd);
    }

    @Test
    public void testAddGardenIsCorrectSize() {
        Garden gardenToAdd = new BotanicGarden(2.0, 5);
        gardens.addGarden(gardenToAdd);
        assertEquals(9, gardens.getGardens().size());
    }

    @Test
    public void testAddGardenIsCorrectAdded() {
        Garden gardenToAdd = new BotanicGarden(5.0, 8);
        gardens.addGarden(gardenToAdd);
        assertTrue(gardens.getGardens().contains(gardenToAdd));
    }

    @Test
    public void testAddGardenArrayIsCorrectSize() {
        assertEquals(8, gardens.getGardens().size());
    }

    @Test
    public void testAddGardenArrayIsCorrectList() {
        Garden[] expectedGardens = {
                new BotanicGarden(2.0, 5),
                new BotanicGarden(130, 5),
                new UniversityGarden(0.75, 16),
                new UniversityGarden(2.4, 25),
                new UrbanGarden(0.001, true, 10),
                new UrbanGarden(0.002, false, 25),
                new FarmGarden(10.5, 8),
                new FarmGarden(9.8, 15),
        };
        List<Garden> expected = new ArrayList<>(Arrays.asList(expectedGardens));

        assertEquals(expected.toString(), gardens.getGardens().toString());
    }

    @Test
    public void testFindAllWithVegetableGardenIsCorrectSize() {
        assertEquals(4, gardens.findAllWithVegetableGarden().size());
    }

    @Test
    public void testFindAllWithVegetableGardenIsCorrectList() {
        GardenManager expectedGardens = new GardenManager();
        Garden[] expectedGardensArray = {
                new UrbanGarden(0.001, true, 10),
                new UrbanGarden(0.002, false, 25),
                new FarmGarden(10.5, 8),
                new FarmGarden(9.8, 15)
        };
        expectedGardens.addGarden(expectedGardensArray);
        assertEquals(expectedGardens.getGardens().toString(), gardens.findAllWithVegetableGarden().toString());
    }

    @Test
    public void testFindAllWithAreaGreaterThanIsCorrectSize() {
        assertEquals(2, gardens.findAllWithAreaGreaterThan(10.0).size());
    }

    @Test
    public void testFindAllWithAreaGreaterThanIsCorrectList() {
        GardenManager expectedGardens = new GardenManager();
        Garden[] expectedGardensArray = {
                new BotanicGarden(130, 5),
                new FarmGarden(10.5, 8),
        };
        expectedGardens.addGarden(expectedGardensArray);

        assertEquals(expectedGardens.getGardens().toString(), gardens.findAllWithAreaGreaterThan(10.0).toString());
    }
}
