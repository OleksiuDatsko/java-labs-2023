package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class RockGarden extends Garden{
    @Override
    public boolean hasVegetableGarden() {
        return false;
    }

    @Override
    public boolean hasOrchard() {
        return false;
    }
}
