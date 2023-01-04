package island.animal.kind.predator;

import island.animal.Fields;

public class Wolf extends Predator {
    public static int deathCounter = 0;
    public static int moveCounter = 0;

    public Wolf(Fields fields) {
        super(fields);
    }
}
