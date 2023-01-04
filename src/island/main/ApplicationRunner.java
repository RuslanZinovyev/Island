package island.main;

import island.animal.Animal;
import island.animal.kind.enumerator.Kind;
import island.animal.kind.herbivore.Herbivore;
import island.animal.kind.predator.Predator;
import island.animal.utils.Logger;
import island.location.Cell;
import island.model.IslandGenerator;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import static island.animal.kind.enumerator.Kind.PLANT;
import static island.model.IslandGenerator.ISLAND;

public class ApplicationRunner {
    static int day = 0;

    public static void main(String[] args) {
        IslandGenerator islandGenerator = new IslandGenerator();
        Logger logger = new Logger();
        islandGenerator.initialize();

        while (true) {
            day++;
            logger.countAnimalsOnCell(ISLAND);
            for (Cell[] cells : ISLAND) {
                for (Cell cell : cells) {
                    move(cell);
                    eat(cell);
                    breed(cell);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            logger.printInfo(day);
            logger.clearFields();
        }
    }

    private static void breed(Cell cell) {
    }

    private static void eat(Cell cell) {
        for (Map.Entry<Kind, List<Animal>> pair : cell.getAnimals().entrySet()) {
            boolean isGoingToEat = ThreadLocalRandom.current().nextBoolean();
            List<Animal> animals = pair.getValue();
            for (Animal animal : animals) {
                if (animal instanceof Predator) {
                    if (isGoingToEat) {
                        Kind[] allAnimals = Kind.getAnimals();
                        for (Kind eachAnimal : allAnimals) {
                            ((Predator) animal).eat(cell.getAnimals().get(eachAnimal));
                        }
                    }
                } else if (animal instanceof Herbivore) {
                    List<Animal> plants = cell.getAnimals().get(PLANT);
                    if (plants != null) {
                        if (isGoingToEat) {
                            ((Herbivore) animal).eat(plants);
                        }
                    }
                }
            }
        }
    }

    private static void move(Cell cell) {
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
