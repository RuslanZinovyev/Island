package island.animal;

import island.animal.kind.enumerator.Kind;
import island.config.Configuration;
import island.location.Cell;
import island.model.IslandGenerator;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {

    public static final String PLANT = "Plant";
    private final Fields fields;
    private int moveCount = 0;

    public Animal(Fields fields) {
        this.fields = fields;
    }

    public Fields getFields() {
        return fields;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public boolean move(Cell cell) {
        if (fields.getName().equals(PLANT)) {
            return false;
        }
        int newRow = (cell.getRow() + fields.getSpeed()) % Configuration.row;
        int newColumn = (cell.getColumn() + fields.getSpeed()) % Configuration.column;

        boolean isMove = ThreadLocalRandom.current().nextBoolean();

        if (newRow < 0 || newColumn < 0) {
            isMove = false;
        }

        if (isMove) {
            Kind kind = Kind.valueOf(this.getClass().getSimpleName().toUpperCase());
            IslandGenerator.ISLAND[newRow][newColumn].getAnimals().get(kind).add(this);
            moveCount++;
        }

        return isMove;
    }

    @Override
    public String toString() {
        return fields.getIcon();
    }

}
