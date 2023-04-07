package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GardenManagerTest {
    GardenManager gardens;
    @BeforeEach
    public void setUp() throws Exception {
        gardens = new GardenManager();

        gardens.addGarden(new BotanicGarden(2.0, 5));
        gardens.addGarden(new BotanicGarden(130, 5));
        gardens.addGarden(new UniversityGarden(0.75, 16));
        gardens.addGarden(new UniversityGarden(2.4, 25));
        gardens.addGarden(new UrbanGarden(0.001, true, 10));
        gardens.addGarden(new UrbanGarden(0.002, false, 25));
        gardens.addGarden(new FarmGarden(10.5, 8));
        gardens.addGarden(new FarmGarden(9.8, 15));
    }
    @Test
    public void testAddGardenIsCorrectSize(){
        assertEquals(8, gardens.getGardens().size());
    }

    @Test
    public void testAddGardenIsCorrectList(){
        List<Garden> expectedGardens = new LinkedList<>();
        expectedGardens.add(new BotanicGarden(2.0, 5));
        expectedGardens.add(new BotanicGarden(130, 5));
        expectedGardens.add(new UniversityGarden(0.75, 16));
        expectedGardens.add(new UniversityGarden(2.4, 25));
        expectedGardens.add(new UrbanGarden(0.001, true, 10));
        expectedGardens.add(new UrbanGarden(0.002, false, 25));
        expectedGardens.add(new FarmGarden(10.5, 8));
        expectedGardens.add(new FarmGarden(9.8, 15));

        assertEquals(expectedGardens.toString(), gardens.getGardens().toString());
    }

    @Test
    public void testFindAllWithVegetableGardenIsCorrectSize() {
        assertEquals(4, gardens.findAllWithVegetableGarden().size());
    }
    @Test
    public void testFindAllWithVegetableGardenIsCorrectList(){
        List<Garden> expectedGardens = new ArrayList<>();
        expectedGardens.add(new UrbanGarden(0.001, true, 10));
        expectedGardens.add(new UrbanGarden(0.002, false, 25));
        expectedGardens.add(new FarmGarden(10.5, 8));
        expectedGardens.add(new FarmGarden(9.8, 15));

        assertEquals(expectedGardens.toString(), gardens.findAllWithVegetableGarden().toString());
    }

    @Test
    public void testFindAllWithAreaGreaterThanIsCorrectSize()
    {
        assertEquals(2, gardens.findAllWithAreaGreaterThan(10.0).size());
    }
    @Test
    public void testFindAllWithAreaGreaterThanIsCorrectList()
    {
        List<Garden> expectedGardens = new ArrayList<>();
        expectedGardens.add(new BotanicGarden(130, 5));
        expectedGardens.add(new FarmGarden(10.5, 8));

        assertEquals(expectedGardens.toString(), gardens.findAllWithAreaGreaterThan(10.0).toString());
    }
}
