package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class UrbanGarden extends Garden {
    private boolean isRoofTop;
    private int numberOfPlantContainers;
    @Override
    public boolean hasVegetableGarden() {
        return true;
    }
    @Override
    public boolean hasOrchard() {
        return false;
    }
}