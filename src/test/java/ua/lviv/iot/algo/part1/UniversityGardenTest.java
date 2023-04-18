package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class UniversityGardenTest {
    UniversityGarden garden = new UniversityGarden();
    @Test
    public void testHasVegetableGarden() {
        assertFalse(garden.hasVegetableGarden());
    }

    @Test
    public void testHasOrchard() {
        assertFalse(garden.hasOrchard());
    }

    @Test
    public void testGetHeaders(){
        assertEquals("areaInHectares, numberOfSculptures", garden.getHeaders());
    }

    @Test
    public void testGetCVS(){
        UniversityGarden garden = new UniversityGarden(2.0, 5);
        assertEquals("2.0, 5", garden.getCommaSeparatedValues());
    }
}