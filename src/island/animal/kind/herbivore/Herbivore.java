package island.animal.kind.herbivore;

import island.animal.Animal;
import island.animal.Fields;
import island.animal.kind.plant.Plant;
import island.animal.kind.predator.*;

import java.util.Iterator;
import java.util.List;

public abstract class Herbivore extends Animal {
    private double consumedFood = 0;
    private int hunger = 0;

    public Herbivore(Fields fields) {
        super(fields);
    }

    public int getHunger() {
        return hunger;
    }

    public void gettingHungry() {
        this.hunger++;
        this.consumedFood--;
    }

    public void eat(List<Animal> plants) {
        Iterator<Animal> iterator = plants.iterator();
        while (iterator.hasNext()) {
            Animal plant = iterator.next();
            this.consumedFood += 1;
            if (this.getFields().getMaxFoodRequired() >= consumedFood) {
                iterator.remove();
                countDeath(plant);
            } else {
                break;
            }
        }
    }

    public static void countDeath(Animal animal) {
        switch (animal.getClass().getSimpleName().toUpperCase()) {
            case "WOLF" -> Wolf.deathCounter++;
            case "SNAKE" -> Snake.deathCounter++;
            case "FOX" -> Fox.deathCounter++;
            case "BEAR" -> Bear.deathCounter++;
            case "EAGLE" -> Eagle.deathCounter++;
            case "HORSE" -> Horse.deathCounter++;
            case "DEER" -> Deer.deathCounter++;
            case "RABBIT" -> Rabbit.deathCounter++;
            case "MOUSE" -> Mouse.deathCounter++;
            case "GOAT" -> Goat.deathCounter++;
            case "SHEEP" -> Sheep.deathCounter++;
            case "BOAR" -> Boar.deathCounter++;
            case "BUFFALO" -> Buffalo.deathCounter++;
            case "DUCK" -> Duck.deathCounter++;
            case "CATERPILLAR" -> Caterpillar.deathCounter++;
            case "PLANT" -> Plant.deathCounter++;
        }
    }
}
