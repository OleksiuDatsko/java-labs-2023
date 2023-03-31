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
                filter(garden -> garden.areaInHectares > area).
                collect(Collectors.toList());
    }
    public static void main(String[] args) {
        GardenManager gardens = new GardenManager();

        gardens.addGarden(new BotanicGarden(2.0, 5));
        gardens.addGarden(new BotanicGarden(130, 5));
        gardens.addGarden(new UniversityGarden(0.75,16));
        gardens.addGarden(new UniversityGarden(2.4,25));
        gardens.addGarden(new UrbanGarden(0.001,true, 10));
        gardens.addGarden(new UrbanGarden(0.002,false, 25));
        gardens.addGarden(new FarmGarden(10.5,8));
        gardens.addGarden(new FarmGarden(9.8,15));

        System.out.println("\nAll gardens: ");
        for(var garden : gardens.gardens){
            System.out.println(garden);
        }
        System.out.println("\nGardens with vegetable garden: ");
        for(var garden : gardens.findAllWithVegetableGarden()){
            System.out.println(garden);
        }
        System.out.println("\nGardens with area bigger than 10.0 hectares: ");
        for (var garden : gardens.findAllWithAreaGreaterThan(10.0)){
            System.out.println(garden);
        }
    }
}
