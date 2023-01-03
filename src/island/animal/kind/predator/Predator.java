package island.animal.kind.predator;

import island.animal.Animal;
import island.animal.Fields;
import island.animal.kind.enumerator.Kind;
import island.config.Configuration;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Predator extends Animal {

    public Predator(Fields fields) {
        super(fields);
    }

    public void eat(List<Animal> animals) {
        int randomNumber;
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            randomNumber = ThreadLocalRandom.current().nextInt(100);
            int predatorIndex = Kind.valueOf(this.getClass().getSimpleName().toUpperCase()).ordinal();
            int preyIndex = Kind.valueOf(animal.getClass().getSimpleName().toUpperCase()).ordinal();
            int currentProbability = Configuration.probabilities[predatorIndex][preyIndex];
            if (randomNumber < currentProbability) {
                iterator.remove();
            }
        }
    }
}
