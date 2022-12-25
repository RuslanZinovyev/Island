package island.animal.kind.herbivore;

import island.animal.Animal;
import island.animal.Fields;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Herbivore extends Animal {

    public Herbivore(Fields fields) {
        super(fields);
    }

    // TODO this method should be fixed
    public void eat(List<Animal> plants) {
        Iterator<Animal> iterator = plants.iterator();
        int randomNumber;
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            randomNumber = ThreadLocalRandom.current().nextInt(2);
            if (randomNumber == 1) {
                iterator.remove();
            }
        }
    }
}
