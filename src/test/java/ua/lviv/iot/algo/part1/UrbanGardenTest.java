package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UrbanGardenTest {
    UrbanGarden garden = new UrbanGarden();
    @Test
    public void testHasVegetableGarden() {
        assertTrue(garden.hasVegetableGarden());
    }
    @Test
    public void testHasOrchard() {
        assertFalse(garden.hasOrchard());
    }
    @Test
    public void testAddContainer(){
        UrbanGarden garden = new UrbanGarden(10, false, 10);
        garden.addContainer(10);
        assertEquals(20, garden.getNumberOfPlantContainers());
    }
}
