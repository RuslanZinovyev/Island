package island.animal.kind.herbivore;

import island.animal.Fields;

public class Buffalo extends Herbivore {
    public static int deathCounter = 0;
    public static int moveCounter = 0;
    public static int bornCounter = 0;

    public Buffalo(Fields fields) {
        super(fields);
    }
}
