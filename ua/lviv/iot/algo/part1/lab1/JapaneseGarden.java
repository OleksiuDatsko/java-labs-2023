package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class JapaneseGarden extends Garden {
    private int numberOfBonsai;

    public JapaneseGarden(double areaInHectares, int numberOfBonsai) {
        super(areaInHectares);
        this.numberOfBonsai = numberOfBonsai;
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
