package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    public void testGetHeaders(){
        assertEquals("areaInHectares, numberOfGreenhouses", garden.getHeaders());
    }

    @Test
    public void testGetCVS(){
        BotanicGarden garden = new BotanicGarden(2.0, 5);
        assertEquals("2.0, 5", garden.getCommaSeparatedValues());
    }
}
