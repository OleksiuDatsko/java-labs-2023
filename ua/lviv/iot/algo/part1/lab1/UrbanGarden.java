package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class UrbanGarden extends Garden {
    private boolean isRoofTop;
    private int numberOfPlantContainers;

    public UrbanGarden(double areaInHectares, boolean isRoofTop, int numberOfPlantContainers) {
        super(areaInHectares);
        this.isRoofTop = isRoofTop;
        this.numberOfPlantContainers = numberOfPlantContainers;
    }

    @Override
    public boolean hasVegetableGarden() {
        return true;
    }

    @Override
    public boolean hasOrchard() {
        return false;
    }
}