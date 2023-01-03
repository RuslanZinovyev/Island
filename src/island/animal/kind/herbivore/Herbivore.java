package island.animal.kind.herbivore;

import island.animal.Animal;
import island.animal.Fields;

import java.util.Iterator;
import java.util.List;

public abstract class Herbivore extends Animal {
    private double consumedFood = 0;
    private int hunger = 0;

    public Herbivore(Fields fields) {
        super(fields);
    }

    public void eat(List<Animal> plants) {
        Iterator<Animal> iterator = plants.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            this.consumedFood += 1;
            if (this.getFields().getMaxFoodRequired() >= consumedFood) {
                iterator.remove();
            } else if (hunger > 7) {
                iterator.remove();
            } else {
                hunger++;
                break;
            }
        }
    }
}
