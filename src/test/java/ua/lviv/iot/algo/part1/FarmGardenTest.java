package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FarmGardenTest {
    FarmGarden garden = new FarmGarden();
    @Test
    public void testHasVegetableGarden() {
        Assertions.assertTrue(garden.hasVegetableGarden());
    }

    @Test
    public void testHasOrchard() {
        Assertions.assertTrue(garden.hasOrchard());
    }
}
