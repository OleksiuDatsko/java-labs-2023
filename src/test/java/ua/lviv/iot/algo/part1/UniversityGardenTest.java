package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

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
}