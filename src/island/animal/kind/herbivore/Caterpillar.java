package island.animal.kind.herbivore;

import island.animal.Fields;

public class Caterpillar extends Herbivore {
    public static int deathCounter = 0;
    public static int moveCounter = 0;
    public static int bornCounter = 0;

    public Caterpillar(Fields fields) {
        super(fields);
    }
}
