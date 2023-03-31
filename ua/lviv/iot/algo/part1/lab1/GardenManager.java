package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
public class GardenManager {
    private final List<Garden> gardens = new LinkedList<>();
    public void addGarden(final Garden garden){
        gardens.add(garden);
    }
    public List<Garden> findAllWithVegetableGarden(){
        return gardens.stream().
                filter(garden -> garden.hasVegetableGarden()).
                collect(Collectors.toList());
    }
    public List<Garden> findAllWithAreaGreaterThan(double area){
        return gardens.stream().
                filter(garden -> garden.getAreaInHectares() > area).
                collect(Collectors.toList());
    }
    public static void main(String[] args) {
        GardenManager gardens = new GardenManager();

        BotanicGarden botanicGarden = new BotanicGarden(2.0, 5);
        BotanicGarden nationalBotanicGardenGrishko = new BotanicGarden(130, 5);
        UniversityGarden universityGarden = new UniversityGarden(0.75,16);
        UrbanGarden urbanGarden = new UrbanGarden(0.001,true, 10);
        JapaneseGarden japaneseGarden = new JapaneseGarden(6.5,10);

        gardens.addGarden(botanicGarden);
        gardens.addGarden(nationalBotanicGardenGrishko);
        gardens.addGarden(universityGarden);
        gardens.addGarden(urbanGarden);
        gardens.addGarden(japaneseGarden);

        for(var garden : gardens.gardens){
            System.out.println(garden);
        }
        System.out.println("\nGardens with vegetable garden");
        for(var garden : gardens.findAllWithVegetableGarden()){
            System.out.println(garden);
        }
        System.out.println("\nGardens with area bigger than 10.0 hectares");
        for (var garden : gardens.findAllWithAreaGreaterThan(10.0)){
            System.out.println(garden);
        }
    }
}
