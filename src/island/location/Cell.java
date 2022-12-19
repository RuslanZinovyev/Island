package island.location;

import island.animal.Animal;
import island.animal.Plant;
import island.animal.kind.enumerator.Kind;
import island.animal.kind.herbivore.*;
import island.animal.kind.predator.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static island.animal.kind.enumerator.Kind.*;

public class Cell {
    private final Map<Kind, List<? extends Animal>> animals = new HashMap<>();
    private final List<Plant> plants = new ArrayList<>();

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

    public Map<Kind, List<? extends Animal>> getAnimals() {
        return animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    private Map<Kind, List<? extends Animal>> populateByKind(Kind name, int times) {
        switch (name) {
            case WOLF -> {
                List<Wolf> wolves = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    wolves.add(new Wolf());
                }
                animals.put(WOLF, wolves);
            }
            case ANACONDA -> {
                List<Anaconda> anacondas = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    anacondas.add(new Anaconda());
                }
                animals.put(ANACONDA, anacondas);
            }
            case FOX -> {
                List<Fox> foxes = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    foxes.add(new Fox());
                }
                animals.put(FOX, foxes);
            }
            case BEAR -> {
                List<Bear> bears = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    bears.add(new Bear());
                }
                animals.put(BEAR, bears);
            }
            case EAGLE -> {
                List<Eagle> eagles = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    eagles.add(new Eagle());
                }
                animals.put(EAGLE, eagles);
            }
            case HORSE -> {
                List<Horse> horses = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    horses.add(new Horse());
                }
                animals.put(HORSE, horses);
            }
            case DEER -> {
                List<Deer> deers = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    deers.add(new Deer());
                }
                animals.put(DEER, deers);
            }
            case RABBIT -> {
                List<Rabbit> rabbits = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    rabbits.add(new Rabbit());
                }
                animals.put(RABBIT, rabbits);
            }
            case MOUSE -> {
                List<Mouse> mice = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    mice.add(new Mouse());
                }
                animals.put(MOUSE, mice);
            }
            case GOAT -> {
                List<Goat> goats = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    goats.add(new Goat());
                }
                animals.put(GOAT, goats);
            }
            case SHEEP -> {
                List<Sheep> sheeps = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    sheeps.add(new Sheep());
                }
                animals.put(SHEEP, sheeps);
            }
            case BOAR -> {
                List<Boar> boars = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    boars.add(new Boar());
                }
                animals.put(BOAR, boars);
            }
            case BUFFALO -> {
                List<Buffalo> buffalo = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    buffalo.add(new Buffalo());
                }
                animals.put(BUFFALO, buffalo);
            }
            case DUCK -> {
                List<Duck> ducks = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    ducks.add(new Duck());
                }
                animals.put(DUCK, ducks);
            }
            case CATERPILLAR -> {
                List<Caterpillar> caterpillars = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    caterpillars.add(new Caterpillar());
                }
                animals.put(CATERPILLAR, caterpillars);
            }
            case PLANT -> {
                for (int i = 0; i < times; i++) {
                    plants.add(new Plant());
                }
            }
        }

        return animals;
    }

    private int getRandomNumberFromRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "animals=" + animals +
                ", plants=" + plants +
                '}';
    }
}
