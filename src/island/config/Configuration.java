package island.config;

import island.animal.Fields;
import island.animal.kind.enumerator.Kind;

import java.util.HashMap;
import java.util.Map;

import static island.animal.kind.enumerator.Kind.*;

public class Configuration {
    public static final int row = 30;
    public static final int column = 30;
    public static Map<Kind, Fields> animalFields = new HashMap<>();

    private Configuration() {}

    static {
        animalFields.put(WOLF, new Fields("Wolf", " \uD83D\uDC3A", 50, 3, 8, true));
        animalFields.put(ANACONDA, new Fields("Anaconda", " \uD83D\uDC0D", 15, 1, 3, true));
        animalFields.put(FOX, new Fields("Fox", " \uD83E\uDD8A", 8, 2, 2, true));
        animalFields.put(BEAR, new Fields("Bear", " \uD83D\uDC3B", 500, 2, 80, true));
        animalFields.put(EAGLE, new Fields("Eagle", " \uD83E\uDD85", 6, 3, 1, true));
        animalFields.put(HORSE, new Fields("Horse", " \uD83D\uDC0E", 400, 4, 60, true));
        animalFields.put(DEER, new Fields("Deer", " \uD83E\uDD8C", 300, 4, 50, true));
        animalFields.put(RABBIT, new Fields("Rabbit"," \uD83D\uDC07", 2, 2, 0.45f, true));
        animalFields.put(MOUSE, new Fields("Mouse", " \uD83D\uDC01", 0.05, 1, 0.01f, true));
        animalFields.put(GOAT, new Fields("Goat", " \uD83D\uDC10", 60, 3, 10, true));
        animalFields.put(SHEEP, new Fields("Sheep", " \uD83D\uDC11", 70, 3, 15, true));
        animalFields.put(BOAR, new Fields("Boar", " \uD83D\uDC17", 400, 2, 50, true));
        animalFields.put(BUFFALO, new Fields("Buffalo"," \uD83D\uDC03", 700, 3, 100, true));
        animalFields.put(DUCK, new Fields("Duck", " \uD83E\uDD86", 1, 4, 0.15, true));
        animalFields.put(CATERPILLAR, new Fields("Caterpillar", " \uD83D\uDC1B", 0.01f, 0, 0, true));
        animalFields.put(PLANT, new Fields("Plant", " \uD83E\uDEB4", 1, 0, 0, true));
    }


}
