package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString(callSuper = true)
public class FarmGarden extends Garden {

    public static final String HEADERS = " numberOfTractors";

    private int numberOfTractors;

    public FarmGarden(double areaInHectares, int numberOfTractors) {
        super(areaInHectares);
        this.numberOfTractors = numberOfTractors;
    }

    @Override
    public boolean hasVegetableGarden() {
        return true;
    }

    @Override
    public boolean hasOrchard() {
        return true;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + HEADERS;
    }

    @Override
    public String getCommaSeparatedValues() {
        return super.getCommaSeparatedValues() + ", " + String.valueOf(this.numberOfTractors);
    }
}
