package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
abstract public class Garden {
    private double areaInHectares;
    abstract public boolean hasVegetableGarden();
    abstract public boolean hasOrchard();
}
