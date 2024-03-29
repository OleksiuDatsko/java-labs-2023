package ua.lviv.iot.algo.part1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Garden {

    protected double areaInHectares;

    public abstract boolean hasVegetableGarden();

    public abstract boolean hasOrchard();

    public String getHeaders() {
        return "areaInHectares";
    }

    public String getCommaSeparatedValues() {
        return String.valueOf(areaInHectares);
    }
}
