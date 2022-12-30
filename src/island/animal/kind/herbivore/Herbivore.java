package island.animal.kind.herbivore;

import island.animal.Animal;
import island.animal.Fields;
import island.animal.kind.plant.Plant;

import java.util.Iterator;
import java.util.List;

public abstract class Herbivore extends Animal {
    double consumedFood = 0;

    public Herbivore(Fields fields) {
        super(fields);
    }

    public void eat(List<Animal> plants) {
        Iterator<Animal> iterator = plants.iterator();
        while (iterator.hasNext()) {
            Plant plant = (Plant) iterator.next();
            this.consumedFood += 1;
            if (this.getFields().getMaxFoodRequired() >= consumedFood) {
                iterator.remove();
            } else {
                break;
            }
        }
    }
}
