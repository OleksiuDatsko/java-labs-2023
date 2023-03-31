package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class FarmGarden extends Garden {
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
}
