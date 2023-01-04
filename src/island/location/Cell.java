package island.location;

import island.animal.Animal;
import island.animal.kind.Factory;
import island.animal.kind.enumerator.Kind;
import island.config.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Cell {

    private final int row;
    private final int column;
    private final Map<Kind, List<Animal>> animals = new ConcurrentHashMap<>();

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

    public void populateIsland() {
        Kind[] kindSet = Kind.values();
        for (Kind kind : kindSet) {
            int num = getRandomNumberFromRange(0, Configuration.animalFields.get(kind).getMaxCount());
            List<Animal> animalSet = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                Animal animal = Factory.getInstance().getAnimalByKind(kind);
                animalSet.add(animal);
            }
            animals.put(kind, animalSet);
        }
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
