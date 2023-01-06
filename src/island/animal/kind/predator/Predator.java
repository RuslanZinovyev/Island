package island.animal.kind.predator;

import island.animal.Animal;
import island.animal.Fields;
import island.animal.kind.enumerator.Kind;
import island.config.Configuration;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static island.animal.utils.Counter.countDeath;

public abstract class Predator extends Animal {
    private double consumedFood = 0;
    private int hunger = 0;

    public Predator(Fields fields) {
        super(fields);
    }

    public boolean eat(List<Animal> animals) {
        int randomNumber;
        Iterator<Animal> iterator = animals.iterator();

        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            randomNumber = ThreadLocalRandom.current().nextInt(100);

            int predatorIndex = Kind.valueOf(this.getClass().getSimpleName().toUpperCase()).ordinal();
            int preyIndex = Kind.valueOf(animal.getClass().getSimpleName().toUpperCase()).ordinal();
            int currentProbability = Configuration.probabilities[predatorIndex][preyIndex];

            if (randomNumber < currentProbability) {
                this.consumedFood += animal.getFields().getWeight();
                if (this.getFields().getMaxFoodRequired() >= consumedFood) {
                    countDeath(animal);
                    iterator.remove();
                } else if (hunger > 7) {
                    countDeath(animal);
                    return true;
                } else {
                    hunger++;
                    break;
                }
            }
        }
        return false;
    }

}
