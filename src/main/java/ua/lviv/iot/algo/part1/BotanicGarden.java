package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString(callSuper = true)
public class BotanicGarden extends Garden {

    public static final String HEADERS = " numberOfGreenhouses";

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

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + HEADERS;
    }

    @Override
    public String getCommaSeparatedValues() {
        return super.getCommaSeparatedValues() + ", " + String.valueOf(this.numberOfGreenhouses);
    }
}
