package island.location;

import island.animal.Animal;
import island.animal.kind.plant.Plant;
import island.animal.kind.enumerator.Kind;
import island.animal.kind.herbivore.*;
import island.animal.kind.predator.*;
import island.config.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import static island.animal.kind.enumerator.Kind.*;

public class Cell {

    private int row;
    private int column;
    private final Map<Kind, List<? extends Animal>> animals = new HashMap<>();

    public Cell() {
        populateByKind(WOLF, getRandomNumberFromRange(0, 30));
        populateByKind(ANACONDA, getRandomNumberFromRange(0, 30));
        populateByKind(FOX, getRandomNumberFromRange(0, 30));
        populateByKind(BEAR, getRandomNumberFromRange(0, 5));
        populateByKind(EAGLE, getRandomNumberFromRange(0, 20));
        populateByKind(HORSE, getRandomNumberFromRange(0, 20));
        populateByKind(DEER, getRandomNumberFromRange(0, 20));
        populateByKind(RABBIT, getRandomNumberFromRange(0, 150));
        populateByKind(MOUSE, getRandomNumberFromRange(0, 500));
        populateByKind(GOAT, getRandomNumberFromRange(0, 140));
        populateByKind(SHEEP, getRandomNumberFromRange(0, 140));
        populateByKind(BOAR, getRandomNumberFromRange(0, 50));
        populateByKind(BUFFALO, getRandomNumberFromRange(0, 10));
        populateByKind(DUCK, getRandomNumberFromRange(0, 200));
        populateByKind(CATERPILLAR, getRandomNumberFromRange(0, 1000));
        populateByKind(PLANT, getRandomNumberFromRange(0, 200));
    }

    public Cell(int row, int column) {
        this();
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Map<Kind, List<? extends Animal>> getAnimals() {
        return animals;
    }

    private Map<Kind, List<? extends Animal>> populateByKind(Kind name, int times) {
        switch (name) {
            case WOLF -> {
                List<Wolf> wolves = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    wolves.add(new Wolf(Configuration.animalFields.get(WOLF)));
                }
                animals.put(WOLF, wolves);
            }
            case ANACONDA -> {
                List<Anaconda> anacondas = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    anacondas.add(new Anaconda(Configuration.animalFields.get(ANACONDA)));
                }
                animals.put(ANACONDA, anacondas);
            }
            case FOX -> {
                List<Fox> foxes = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    foxes.add(new Fox(Configuration.animalFields.get(FOX)));
                }
                animals.put(FOX, foxes);
            }
            case BEAR -> {
                List<Bear> bears = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    bears.add(new Bear(Configuration.animalFields.get(BEAR)));
                }
                animals.put(BEAR, bears);
            }
            case EAGLE -> {
                List<Eagle> eagles = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    eagles.add(new Eagle(Configuration.animalFields.get(EAGLE)));
                }
                animals.put(EAGLE, eagles);
            }
            case HORSE -> {
                List<Horse> horses = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    horses.add(new Horse(Configuration.animalFields.get(HORSE)));
                }
                animals.put(HORSE, horses);
            }
            case DEER -> {
                List<Deer> deers = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    deers.add(new Deer(Configuration.animalFields.get(DEER)));
                }
                animals.put(DEER, deers);
            }
            case RABBIT -> {
                List<Rabbit> rabbits = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    rabbits.add(new Rabbit(Configuration.animalFields.get(RABBIT)));
                }
                animals.put(RABBIT, rabbits);
            }
            case MOUSE -> {
                List<Mouse> mice = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    mice.add(new Mouse(Configuration.animalFields.get(MOUSE)));
                }
                animals.put(MOUSE, mice);
            }
            case GOAT -> {
                List<Goat> goats = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    goats.add(new Goat(Configuration.animalFields.get(GOAT)));
                }
                animals.put(GOAT, goats);
            }
            case SHEEP -> {
                List<Sheep> sheeps = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    sheeps.add(new Sheep(Configuration.animalFields.get(SHEEP)));
                }
                animals.put(SHEEP, sheeps);
            }
            case BOAR -> {
                List<Boar> boars = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    boars.add(new Boar(Configuration.animalFields.get(BOAR)));
                }
                animals.put(BOAR, boars);
            }
            case BUFFALO -> {
                List<Buffalo> buffalo = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    buffalo.add(new Buffalo(Configuration.animalFields.get(BUFFALO)));
                }
                animals.put(BUFFALO, buffalo);
            }
            case DUCK -> {
                List<Duck> ducks = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    ducks.add(new Duck(Configuration.animalFields.get(DUCK)));
                }
                animals.put(DUCK, ducks);
            }
            case CATERPILLAR -> {
                List<Caterpillar> caterpillars = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    caterpillars.add(new Caterpillar(Configuration.animalFields.get(CATERPILLAR)));
                }
                animals.put(CATERPILLAR, caterpillars);
            }
            case PLANT -> {
                List<Plant> plants = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    plants.add(new Plant(Configuration.animalFields.get(PLANT)));
                }
                animals.put(PLANT, plants);
            }
        }

        return animals;
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
