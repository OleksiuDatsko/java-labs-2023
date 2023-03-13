package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Garden {
    private double area;
    private boolean hasOrchard;
    private boolean hasVegetableGarden;
    private int numberOfFlowers;
    
    private static Garden defultGarden = new Garden();

    public static Garden getInstance(){
        return defultGarden;
    }

    public void plantFlower(int count){
        numberOfFlowers += count;
    }

    public void removeFlower(int count){
        numberOfFlowers -= count;
        if(numberOfFlowers < 0){
            numberOfFlowers = 0;
        }
    }

    public void addVegetableRegion(double area){
        this.area += area;
    }

    public static void main(String[] args) {
        Garden[] gardens = {
                new Garden(),
                new Garden(240.5, true, true, 1000),
                getInstance(),
                getInstance()
        };

        for(Garden garden : gardens){
            System.out.println(garden);
        }
    }
}
