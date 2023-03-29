package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class BotanicGarden extends Garden{
    private int numberOfGreenhouses;
    @Override
    public boolean hasVegetableGarden() {
        return false;
    }

    @Override
    public boolean hasOrchard() {
        return true;
    }
}
