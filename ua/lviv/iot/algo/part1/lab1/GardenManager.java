package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
@Getter
public class GardenManager {
    private List<Garden> gardens = new LinkedList<>();
    public void addGarden(final Garden garden){
        gardens.add(garden);
    }
    public List<Garden> findAllWithVegetableGarden(){
        return gardens.stream().
                filter(reptile -> reptile.hasVegetableGarden()).
                collect(Collectors.toList());
    }
    public static void main(String[] args) {
        GardenManager gardens = new GardenManager();
        BotanicGarden botanicGarden = new BotanicGarden(5);
        UniversityGarden universityGarden = new UniversityGarden(50);
        UrbanGarden urbanGarden = new UrbanGarden(true, 10);
        Vineyard vineyard = new Vineyard(1000);
        gardens.addGarden(botanicGarden);
        gardens.addGarden(universityGarden);
        gardens.addGarden(urbanGarden);
        gardens.addGarden(vineyard);
        var gardensWithVegetableGarden = gardens.findAllWithVegetableGarden();
        System.out.println(gardens.getGardens());
        System.out.println(gardensWithVegetableGarden);
    }
}
