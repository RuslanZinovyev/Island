package island.animal.kind.herbivore;

import island.animal.Fields;

public class Horse extends Herbivore {
    public static int deathCounter = 0;
    public static int moveCounter = 0;

    public Horse(Fields fields) {
        super(fields);
    }
}
