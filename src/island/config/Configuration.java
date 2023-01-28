package island.config;

import island.animal.Fields;
import island.animal.kind.enumerator.Kind;

import java.util.HashMap;
import java.util.Map;

import static island.animal.kind.enumerator.Kind.*;

public class Configuration {

    public static final int row = 3;
    public static final int column = 2;
    public static Map<Kind, Fields> animalFields = new HashMap<>();
    public static int[][] probabilities = new int[values().length][values().length];
    public static Map<Kind, Integer> breedChance = new HashMap<>();

    private Configuration() {}

    static {
        animalFields.put(WOLF, new Fields("Wolf", " \uD83D\uDC3A", 50, 3, 8, 30));
        animalFields.put(SNAKE, new Fields("Snake", " \uD83D\uDC0D", 15, 1, 3, 30));
        animalFields.put(FOX, new Fields("Fox", " \uD83E\uDD8A", 8, 2, 2, 30));
        animalFields.put(BEAR, new Fields("Bear", " \uD83D\uDC3B", 500, 2, 80, 5));
        animalFields.put(EAGLE, new Fields("Eagle", " \uD83E\uDD85", 6, 3, 1, 20));
        animalFields.put(HORSE, new Fields("Horse", " \uD83D\uDC0E", 400, 4, 60, 20));
        animalFields.put(DEER, new Fields("Deer", " \uD83E\uDD8C", 300, 4, 50, 20));
        animalFields.put(RABBIT, new Fields("Rabbit", " \uD83D\uDC07", 2, 2, 0.45f, 150));
        animalFields.put(MOUSE, new Fields("Mouse", " \uD83D\uDC01", 0.05, 1, 0.01f, 500));
        animalFields.put(GOAT, new Fields("Goat", " \uD83D\uDC10", 60, 3, 10, 140));
        animalFields.put(SHEEP, new Fields("Sheep", " \uD83D\uDC11", 70, 3, 15, 140));
        animalFields.put(BOAR, new Fields("Boar", " \uD83D\uDC17", 400, 2, 50, 50));
        animalFields.put(BUFFALO, new Fields("Buffalo", " \uD83D\uDC03", 700, 3, 100, 10));
        animalFields.put(DUCK, new Fields("Duck", " \uD83E\uDD86", 1, 4, 0.15, 200));
        animalFields.put(CATERPILLAR, new Fields("Caterpillar", " \uD83D\uDC1B", 0.01f, 1, 1, 1000));
        animalFields.put(PLANT, new Fields("Plant", " \uD83E\uDEB4", 1, 0, 0, 4000));
        // WOLF
        breedChance.put(WOLF, 3);
        probabilities[WOLF.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[WOLF.ordinal()][FOX.ordinal()] = 0;
        probabilities[WOLF.ordinal()][BEAR.ordinal()] = 0;
        probabilities[WOLF.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[WOLF.ordinal()][HORSE.ordinal()] = 10;
        probabilities[WOLF.ordinal()][DEER.ordinal()] = 15;
        probabilities[WOLF.ordinal()][RABBIT.ordinal()] = 60;
        probabilities[WOLF.ordinal()][MOUSE.ordinal()] = 80;
        probabilities[WOLF.ordinal()][GOAT.ordinal()] = 60;
        probabilities[WOLF.ordinal()][SHEEP.ordinal()] = 70;
        probabilities[WOLF.ordinal()][BOAR.ordinal()] = 15;
        probabilities[WOLF.ordinal()][BUFFALO.ordinal()] = 10;
        probabilities[WOLF.ordinal()][DUCK.ordinal()] = 40;
        probabilities[WOLF.ordinal()][CATERPILLAR.ordinal()] = 0;
        probabilities[WOLF.ordinal()][PLANT.ordinal()] = 0;
        // SNAKE
        breedChance.put(SNAKE, 3);
        probabilities[SNAKE.ordinal()][WOLF.ordinal()] = 0;
        probabilities[SNAKE.ordinal()][FOX.ordinal()] = 15;
        probabilities[SNAKE.ordinal()][BEAR.ordinal()] = 0;
        probabilities[SNAKE.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[SNAKE.ordinal()][HORSE.ordinal()] = 10;
        probabilities[SNAKE.ordinal()][DEER.ordinal()] = 15;
        probabilities[SNAKE.ordinal()][RABBIT.ordinal()] = 20;
        probabilities[SNAKE.ordinal()][MOUSE.ordinal()] = 40;
        probabilities[SNAKE.ordinal()][GOAT.ordinal()] = 0;
        probabilities[SNAKE.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[SNAKE.ordinal()][BOAR.ordinal()] = 0;
        probabilities[SNAKE.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[SNAKE.ordinal()][DUCK.ordinal()] = 10;
        probabilities[SNAKE.ordinal()][CATERPILLAR.ordinal()] = 0;
        probabilities[SNAKE.ordinal()][PLANT.ordinal()] = 0;
        // FOX
        breedChance.put(FOX, 3);
        probabilities[FOX.ordinal()][WOLF.ordinal()] = 0;
        probabilities[FOX.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[FOX.ordinal()][BEAR.ordinal()] = 0;
        probabilities[FOX.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[FOX.ordinal()][HORSE.ordinal()] = 0;
        probabilities[FOX.ordinal()][DEER.ordinal()] = 0;
        probabilities[FOX.ordinal()][RABBIT.ordinal()] = 70;
        probabilities[FOX.ordinal()][MOUSE.ordinal()] = 90;
        probabilities[FOX.ordinal()][GOAT.ordinal()] = 0;
        probabilities[FOX.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[FOX.ordinal()][BOAR.ordinal()] = 0;
        probabilities[FOX.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[FOX.ordinal()][DUCK.ordinal()] = 60;
        probabilities[FOX.ordinal()][CATERPILLAR.ordinal()] = 40;
        probabilities[FOX.ordinal()][PLANT.ordinal()] = 0;
        // BEAR
        breedChance.put(BEAR, 3);
        probabilities[BEAR.ordinal()][WOLF.ordinal()] = 0;
        probabilities[BEAR.ordinal()][SNAKE.ordinal()] = 80;
        probabilities[BEAR.ordinal()][FOX.ordinal()] = 0;
        probabilities[BEAR.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[BEAR.ordinal()][HORSE.ordinal()] = 40;
        probabilities[BEAR.ordinal()][DEER.ordinal()] = 80;
        probabilities[BEAR.ordinal()][RABBIT.ordinal()] = 80;
        probabilities[BEAR.ordinal()][MOUSE.ordinal()] = 90;
        probabilities[BEAR.ordinal()][GOAT.ordinal()] = 70;
        probabilities[BEAR.ordinal()][SHEEP.ordinal()] = 70;
        probabilities[BEAR.ordinal()][BOAR.ordinal()] = 50;
        probabilities[BEAR.ordinal()][BUFFALO.ordinal()] = 20;
        probabilities[BEAR.ordinal()][DUCK.ordinal()] = 10;
        probabilities[BEAR.ordinal()][CATERPILLAR.ordinal()] = 0;
        probabilities[BEAR.ordinal()][PLANT.ordinal()] = 0;
        // EAGLE
        breedChance.put(EAGLE, 5);
        probabilities[EAGLE.ordinal()][WOLF.ordinal()] = 0;
        probabilities[EAGLE.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[EAGLE.ordinal()][FOX.ordinal()] = 10;
        probabilities[EAGLE.ordinal()][BEAR.ordinal()] = 0;
        probabilities[EAGLE.ordinal()][HORSE.ordinal()] = 0;
        probabilities[EAGLE.ordinal()][DEER.ordinal()] = 0;
        probabilities[EAGLE.ordinal()][RABBIT.ordinal()] = 90;
        probabilities[EAGLE.ordinal()][MOUSE.ordinal()] = 90;
        probabilities[EAGLE.ordinal()][GOAT.ordinal()] = 0;
        probabilities[EAGLE.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[EAGLE.ordinal()][BOAR.ordinal()] = 0;
        probabilities[EAGLE.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[EAGLE.ordinal()][DUCK.ordinal()] = 80;
        probabilities[EAGLE.ordinal()][CATERPILLAR.ordinal()] = 0;
        probabilities[EAGLE.ordinal()][PLANT.ordinal()] = 0;
        // HORSE
        breedChance.put(HORSE, 8);
        probabilities[HORSE.ordinal()][WOLF.ordinal()] = 0;
        probabilities[HORSE.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[HORSE.ordinal()][FOX.ordinal()] = 0;
        probabilities[HORSE.ordinal()][BEAR.ordinal()] = 0;
        probabilities[HORSE.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[HORSE.ordinal()][DEER.ordinal()] = 0;
        probabilities[HORSE.ordinal()][RABBIT.ordinal()] = 0;
        probabilities[HORSE.ordinal()][MOUSE.ordinal()] = 0;
        probabilities[HORSE.ordinal()][GOAT.ordinal()] = 0;
        probabilities[HORSE.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[HORSE.ordinal()][BOAR.ordinal()] = 0;
        probabilities[HORSE.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[HORSE.ordinal()][DUCK.ordinal()] = 0;
        probabilities[HORSE.ordinal()][CATERPILLAR.ordinal()] = 0;
        probabilities[HORSE.ordinal()][PLANT.ordinal()] = 100;
        // DEER
        breedChance.put(DEER, 5);
        probabilities[DEER.ordinal()][WOLF.ordinal()] = 0;
        probabilities[DEER.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[DEER.ordinal()][FOX.ordinal()] = 0;
        probabilities[DEER.ordinal()][BEAR.ordinal()] = 0;
        probabilities[DEER.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[DEER.ordinal()][HORSE.ordinal()] = 0;
        probabilities[DEER.ordinal()][RABBIT.ordinal()] = 0;
        probabilities[DEER.ordinal()][MOUSE.ordinal()] = 0;
        probabilities[DEER.ordinal()][GOAT.ordinal()] = 0;
        probabilities[DEER.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[DEER.ordinal()][BOAR.ordinal()] = 0;
        probabilities[DEER.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[DEER.ordinal()][DUCK.ordinal()] = 0;
        probabilities[DEER.ordinal()][CATERPILLAR.ordinal()] = 0;
        probabilities[DEER.ordinal()][PLANT.ordinal()] = 100;
        // RABBIT
        breedChance.put(RABBIT, 40);
        probabilities[RABBIT.ordinal()][WOLF.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][FOX.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][BEAR.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][HORSE.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][DEER.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][MOUSE.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][GOAT.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][BOAR.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][DUCK.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][CATERPILLAR.ordinal()] = 0;
        probabilities[RABBIT.ordinal()][PLANT.ordinal()] = 100;
        // MOUSE
        breedChance.put(MOUSE, 30);
        probabilities[MOUSE.ordinal()][WOLF.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][FOX.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][BEAR.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][HORSE.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][DEER.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][RABBIT.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][GOAT.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][BOAR.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][DUCK.ordinal()] = 0;
        probabilities[MOUSE.ordinal()][CATERPILLAR.ordinal()] = 90;
        probabilities[MOUSE.ordinal()][PLANT.ordinal()] = 100;
        // GOAT
        breedChance.put(GOAT, 5);
        probabilities[GOAT.ordinal()][WOLF.ordinal()] = 0;
        probabilities[GOAT.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[GOAT.ordinal()][FOX.ordinal()] = 0;
        probabilities[GOAT.ordinal()][BEAR.ordinal()] = 0;
        probabilities[GOAT.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[GOAT.ordinal()][HORSE.ordinal()] = 0;
        probabilities[GOAT.ordinal()][DEER.ordinal()] = 0;
        probabilities[GOAT.ordinal()][RABBIT.ordinal()] = 0;
        probabilities[GOAT.ordinal()][MOUSE.ordinal()] = 0;
        probabilities[GOAT.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[GOAT.ordinal()][BOAR.ordinal()] = 0;
        probabilities[GOAT.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[GOAT.ordinal()][DUCK.ordinal()] = 0;
        probabilities[GOAT.ordinal()][CATERPILLAR.ordinal()] = 0;
        probabilities[GOAT.ordinal()][PLANT.ordinal()] = 100;
        // SHEEP
        breedChance.put(SHEEP, 15);
        probabilities[SHEEP.ordinal()][WOLF.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][FOX.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][BEAR.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][HORSE.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][DEER.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][RABBIT.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][MOUSE.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][GOAT.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][BOAR.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][DUCK.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][CATERPILLAR.ordinal()] = 0;
        probabilities[SHEEP.ordinal()][PLANT.ordinal()] = 100;
        // BOAR
        breedChance.put(BOAR, 10);
        probabilities[BOAR.ordinal()][WOLF.ordinal()] = 0;
        probabilities[BOAR.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[BOAR.ordinal()][FOX.ordinal()] = 0;
        probabilities[BOAR.ordinal()][BEAR.ordinal()] = 0;
        probabilities[BOAR.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[BOAR.ordinal()][HORSE.ordinal()] = 0;
        probabilities[BOAR.ordinal()][DEER.ordinal()] = 0;
        probabilities[BOAR.ordinal()][RABBIT.ordinal()] = 0;
        probabilities[BOAR.ordinal()][MOUSE.ordinal()] = 50;
        probabilities[BOAR.ordinal()][GOAT.ordinal()] = 0;
        probabilities[BOAR.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[BOAR.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[BOAR.ordinal()][DUCK.ordinal()] = 0;
        probabilities[BOAR.ordinal()][CATERPILLAR.ordinal()] = 90;
        probabilities[BOAR.ordinal()][PLANT.ordinal()] = 100;
        // BUFFALO
        breedChance.put(BUFFALO, 10);
        probabilities[BUFFALO.ordinal()][WOLF.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][FOX.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][BEAR.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][HORSE.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][DEER.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][RABBIT.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][MOUSE.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][GOAT.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][BOAR.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][DUCK.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][CATERPILLAR.ordinal()] = 0;
        probabilities[BUFFALO.ordinal()][PLANT.ordinal()] = 100;
        // DUCK
        breedChance.put(DUCK, 10);
        probabilities[DUCK.ordinal()][WOLF.ordinal()] = 0;
        probabilities[DUCK.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[DUCK.ordinal()][FOX.ordinal()] = 0;
        probabilities[DUCK.ordinal()][BEAR.ordinal()] = 0;
        probabilities[DUCK.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[DUCK.ordinal()][HORSE.ordinal()] = 0;
        probabilities[DUCK.ordinal()][DEER.ordinal()] = 0;
        probabilities[DUCK.ordinal()][RABBIT.ordinal()] = 0;
        probabilities[DUCK.ordinal()][MOUSE.ordinal()] = 0;
        probabilities[DUCK.ordinal()][GOAT.ordinal()] = 0;
        probabilities[DUCK.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[DUCK.ordinal()][BOAR.ordinal()] = 0;
        probabilities[DUCK.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[DUCK.ordinal()][CATERPILLAR.ordinal()] = 90;
        probabilities[DUCK.ordinal()][PLANT.ordinal()] = 100;
        // CATERPILLAR
        breedChance.put(CATERPILLAR, 20);
        probabilities[CATERPILLAR.ordinal()][WOLF.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][SNAKE.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][FOX.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][BEAR.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][EAGLE.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][HORSE.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][DEER.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][RABBIT.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][MOUSE.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][GOAT.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][SHEEP.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][BOAR.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][BUFFALO.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][DUCK.ordinal()] = 0;
        probabilities[CATERPILLAR.ordinal()][PLANT.ordinal()] = 100;

        // PLANT
        breedChance.put(PLANT, 10);
    }
}
