package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString(callSuper = true)
public class BotanicGarden extends Garden {

    private int numberOfGreenhouses;

    public BotanicGarden(double areaInHectares, int numberOfGreenhouses) {
        super(areaInHectares);
        this.numberOfGreenhouses = numberOfGreenhouses;
    }

    @Override
    public boolean hasVegetableGarden() {
        return false;
    }

    @Override
    public boolean hasOrchard() {
        return true;
    }
}