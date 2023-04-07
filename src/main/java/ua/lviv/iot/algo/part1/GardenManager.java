package ua.lviv.iot.algo.part1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
public class GardenManager {
    private final List<Garden> gardens = new LinkedList<>();

    public void addGarden(final Garden garden) {
        gardens.add(garden);
    }

    public void addGarden(final Garden[] gardens) {
        for(Garden garden : gardens){
            this.gardens.add(garden);
        }
    }

    public List<Garden> findAllWithVegetableGarden() {
        return gardens.stream()
                      .filter(garden -> garden.hasVegetableGarden())
                      .collect(Collectors.toList());
    }

    public List<Garden> findAllWithAreaGreaterThan(double area) {
        return gardens.stream()
                      .filter(garden -> garden.areaInHectares > area)
                      .collect(Collectors.toList());
    }
}
