package island.animal.kind.herbivore;

import island.animal.Fields;

public class Sheep extends Herbivore {
    public static int deathCounter = 0;
    public static int moveCounter = 0;
    public static int bornCounter = 0;

    public Sheep(Fields fields) {
        super(fields);
    }
}
