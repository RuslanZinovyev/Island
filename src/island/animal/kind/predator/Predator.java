package island.animal.kind.predator;

import island.animal.Animal;
import island.animal.Fields;
import island.animal.kind.enumerator.Kind;
import island.animal.kind.herbivore.*;
import island.config.Configuration;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Predator extends Animal {
    private double consumedFood = 0;
    private int hunger = 0;

    public Predator(Fields fields) {
        super(fields);
    }

    //TODO this method should be fixed, currently it behaves incorrectly
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
                this.consumedFood += animal.getFields().getWeight();
                if (this.getFields().getMaxFoodRequired() >= consumedFood) {
                    countDeath(animal);
                    iterator.remove();
                } else if (hunger > 7) {
                    countDeath(animal);
                    iterator.remove();
                } else {
                    hunger++;
                    break;
                }
            }
        }
    }

    private void countDeath(Animal animal) {
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
        }
    }
}
