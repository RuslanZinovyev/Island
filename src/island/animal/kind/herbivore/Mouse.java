package island.animal.kind.herbivore;

import island.animal.Fields;

public class Mouse extends Herbivore {
    public static int deathCounter = 0;
    public static int moveCounter = 0;

    public Mouse(Fields fields) {
        super(fields);
    }
}
