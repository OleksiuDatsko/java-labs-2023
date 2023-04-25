package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString(callSuper = true)
public class UrbanGarden extends Garden {

    public static final String HEADERS = " isRoofTop, numberOfPlantContainers";

    private boolean isRoofTop;
    private int numberOfPlantContainers;

    public UrbanGarden(double areaInHectares, boolean isRoofTop, int numberOfPlantContainers) {
        super(areaInHectares);
        this.isRoofTop = isRoofTop;
        this.numberOfPlantContainers = numberOfPlantContainers;
    }

    public void addContainer(int numberOfPlantContainers) {
        this.numberOfPlantContainers = this.numberOfPlantContainers + numberOfPlantContainers;
    }

    @Override
    public boolean hasVegetableGarden() {
        return true;
    }

    @Override
    public boolean hasOrchard() {
        return false;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + HEADERS;
    }

    @Override
    public String getCommaSeparatedValues() {
        return super.getCommaSeparatedValues() + ", " + String.valueOf(this.isRoofTop) + ", " + String.valueOf(this.numberOfPlantContainers);
    }
}