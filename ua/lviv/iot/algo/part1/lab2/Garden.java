package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
abstract public class Garden {
    protected double areaInHectares;
    abstract public boolean hasVegetableGarden();
    abstract public boolean hasOrchard();
}
