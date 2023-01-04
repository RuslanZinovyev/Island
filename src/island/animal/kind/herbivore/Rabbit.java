package island.animal.kind.herbivore;

import island.animal.Fields;

public class Rabbit extends Herbivore {
    public static int deathCounter = 0;
    public static int moveCounter = 0;

    public Rabbit(Fields fields) {
        super(fields);
    }
}
