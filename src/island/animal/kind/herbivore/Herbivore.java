package island.animal.kind.herbivore;

import island.animal.Animal;
import island.animal.Fields;
import island.animal.kind.plant.Plant;

import java.util.Iterator;
import java.util.List;

import static island.animal.utils.Counter.countPlantDeath;

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

    public void eat(List<Plant> plants) {
        Iterator<Plant> iterator = plants.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            this.consumedFood += 1;
            if (this.getFields().getMaxFoodRequired() >= consumedFood) {
                iterator.remove();
                countPlantDeath();
            } else {
                break;
            }
        }
    }
}
