package island.location;

import island.animal.Animal;
import island.animal.kind.enumerator.Kind;
import island.animal.kind.herbivore.Herbivore;
import island.animal.kind.predator.Predator;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import static island.animal.kind.enumerator.Kind.PLANT;
import static island.animal.utils.Counter.countDeath;

public class LifeCycle {

    public void breed(Cell cell) {
        for (Map.Entry<Kind, List<Animal>> pair : cell.getAnimals().entrySet()) {
            List<Animal> animals = pair.getValue();
            for (int i = 0; i < animals.size(); i++) {
                animals.get(i).breed(cell);
            }
        }
    }

    public void eat(Cell cell) {
        for (Map.Entry<Kind, List<Animal>> pair : cell.getAnimals().entrySet()) {

            boolean isGoingToEat;
            List<Animal> animals = pair.getValue();
            Iterator<Animal> iterator = animals.iterator();

            while (iterator.hasNext()) {
                Animal animal = iterator.next();
                if (animal instanceof Predator) {
                    isGoingToEat = ThreadLocalRandom.current().nextBoolean();
                    if (isGoingToEat) {
                        Kind[] allAnimals = Kind.getAnimals();
                        for (Kind eachAnimal : allAnimals) {
                            ((Predator) animal).eat(cell.getAnimals().get(eachAnimal));
                        }
                    } else if (((Predator) animal).getHunger() > 2) {
                        iterator.remove();
                        countDeath(animal);
                        break;
                    } else {
                        ((Predator) animal).gettingHungry();
                    }
                } else if (animal instanceof Herbivore) {
                    List<Animal> plants = cell.getAnimals().get(PLANT);
                    if (plants.size() != 0) {
                        isGoingToEat = ThreadLocalRandom.current().nextBoolean();
                        if (isGoingToEat) {
                            ((Herbivore) animal).eat(plants);
                        } else if (((Herbivore) animal).getHunger() > 7) {
                            iterator.remove();
                            countDeath(animal);
                            break;
                        } else {
                            ((Herbivore) animal).gettingHungry();
                        }
                    } else {
                        iterator.remove();
                        countDeath(animal);
                    }
                }
            }
        }
    }

    public void move(Cell cell) {
        for (Map.Entry<Kind, List<Animal>> pair : cell.getAnimals().entrySet()) {
            List<Animal> animals = pair.getValue();
            Iterator<Animal> iterator = animals.iterator();
            while (iterator.hasNext()) {
                Animal animal = iterator.next();
                boolean isMove = animal.move(cell);
                if (isMove) {
                    iterator.remove();
                }
            }
        }
    }
}
