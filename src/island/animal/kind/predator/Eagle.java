package island.animal.kind.predator;

import island.animal.Fields;

public class Eagle extends Predator {
    public static int deathCounter = 0;
    public static int moveCounter = 0;
    public static int bornCounter = 0;

    public Eagle(Fields fields) {
        super(fields);
    }
}
