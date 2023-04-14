package ua.lviv.iot.algo.part1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FarmGardenTest {
    FarmGarden garden = new FarmGarden();
    @Test
    public void testHasVegetableGarden() {
        assertTrue(garden.hasVegetableGarden());
    }

    @Test
    public void testHasOrchard() {
        assertTrue(garden.hasOrchard());
    }

    @Test
    public void testGetHeaders(){
        assertEquals("areaInHectares, numberOfTractors", garden.getHeaders());
    }

    @Test
    public void testGetCVS(){
        FarmGarden garden = new FarmGarden(2.0, 5);
        assertEquals("2.0, 5", garden.getCSV());
    }
}
