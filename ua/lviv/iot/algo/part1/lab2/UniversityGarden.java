package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class UniversityGarden extends Garden {
    private int numberOfSculptures;

    public UniversityGarden(double areaInHectares, int numberOfSculptures) {
        super(areaInHectares);
        this.numberOfSculptures = numberOfSculptures;
    }

    @Override
    public boolean hasVegetableGarden() {
        return false;
    }

    @Override
    public boolean hasOrchard() {
        return false;
    }
}
