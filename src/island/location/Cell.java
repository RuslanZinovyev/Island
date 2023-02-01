package island.location;

import island.animal.Animal;
import island.animal.kind.Factory;
import island.animal.kind.enumerator.Kind;
import island.animal.kind.plant.Plant;
import island.config.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cell {

    private final int row;
    private final int column;
    private final Map<Kind, List<Animal>> animals = new ConcurrentHashMap<>();
    private final List<Plant> plants = new ArrayList<>();
    private final Lock lock = new ReentrantLock(true);

    public Cell(int row, int column) {
        populateIsland();
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Map<Kind, List<Animal>> getAnimals() {
        return animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void populateIsland() {
        Kind[] kindSet = Kind.values();
        int plantsNumber = getRandomNumberFromRange(0, Configuration.plantFields.get("Plant").getMaxCount());
        for (Kind kind : kindSet) {
            int num = getRandomNumberFromRange(0, Configuration.animalFields.get(kind).getMaxCount());
            List<Animal> animalSet = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                Animal animal = Factory.getInstance().getAnimalByKind(kind);
                animalSet.add(animal);
            }
            animals.put(kind, animalSet);
        }
        for (int i = 0; i < plantsNumber; i++) {
            plants.add(new Plant());
        }
    }

    public Lock getLock() {
        return lock;
    }

    private int getRandomNumberFromRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "row=" + row +
                ", column=" + column +
                ", animals=" + animals +
                '}';
    }
}
