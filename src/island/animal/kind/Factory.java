package island.animal.kind;

import island.animal.Animal;
import island.animal.kind.enumerator.Kind;
import island.animal.kind.herbivore.*;
import island.animal.kind.plant.Plant;
import island.animal.kind.predator.*;
import island.config.Configuration;

import static island.animal.kind.enumerator.Kind.*;

public class Factory {
    static Factory instance;

    private Factory() {
    }

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public Animal getAnimalByKind(Kind kind) {
        Animal animal =
                switch (kind) {
                    case WOLF -> new Wolf(Configuration.animalFields.get(WOLF));
                    case SNAKE -> new Snake(Configuration.animalFields.get(SNAKE));
                    case FOX -> new Fox(Configuration.animalFields.get(FOX));
                    case BEAR -> new Bear(Configuration.animalFields.get(BEAR));
                    case EAGLE -> new Eagle(Configuration.animalFields.get(EAGLE));
                    case HORSE -> new Horse(Configuration.animalFields.get(HORSE));
                    case DEER -> new Deer(Configuration.animalFields.get(DEER));
                    case RABBIT -> new Rabbit(Configuration.animalFields.get(RABBIT));
                    case MOUSE -> new Mouse(Configuration.animalFields.get(MOUSE));
                    case GOAT -> new Goat(Configuration.animalFields.get(GOAT));
                    case SHEEP -> new Sheep(Configuration.animalFields.get(SHEEP));
                    case BOAR -> new Boar(Configuration.animalFields.get(BOAR));
                    case BUFFALO -> new Buffalo(Configuration.animalFields.get(BUFFALO));
                    case DUCK -> new Duck(Configuration.animalFields.get(DUCK));
                    case CATERPILLAR -> new Caterpillar(Configuration.animalFields.get(CATERPILLAR));
                    case PLANT -> new Plant(Configuration.animalFields.get(PLANT));
                };

        return animal;
    }
}
