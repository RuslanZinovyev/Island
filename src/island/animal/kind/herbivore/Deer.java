package island.animal.kind.herbivore;

import island.animal.Fields;

public class Deer extends Herbivore {
    public static int deathCounter = 0;
    public static int moveCounter = 0;

    public Deer(Fields fields) {
        super(fields);
    }
}
