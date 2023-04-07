package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Test;

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
}
