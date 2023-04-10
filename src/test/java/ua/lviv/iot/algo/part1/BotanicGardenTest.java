package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class  BotanicGardenTest {
    BotanicGarden garden = new BotanicGarden();
    @Test
    public void testHasVegetableGarden() {
        assertFalse(garden.hasVegetableGarden());
    }

    @Test
    public void testHasOrchard() {
        assertTrue(garden.hasOrchard());
    }
}
