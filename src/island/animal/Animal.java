package island.animal;

import island.animal.kind.Factory;
import island.animal.kind.enumerator.Kind;
import island.config.Configuration;
import island.location.Cell;
import island.model.IslandGenerator;

import java.util.concurrent.ThreadLocalRandom;
import static island.animal.utils.Counter.countMoves;

public abstract class Animal {

    public static final String PLANT = "Plant";
    private final Fields fields;

    public Animal(Fields fields) {
        this.fields = fields;
    }

    public Fields getFields() {
        return fields;
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
            countMoves(kind);
        }

        return isMove;
    }

    public void breed(Cell cell) {
        boolean isBorn = ThreadLocalRandom.current().nextBoolean();

        int column = cell.getColumn();
        int row = cell.getRow();


        if (isBorn) {
            Kind kind = Kind.valueOf(this.getClass().getSimpleName().toUpperCase());
            IslandGenerator.ISLAND[row][column].getAnimals().get(kind).add(Factory.getInstance().getAnimalByKind(kind));
        }
    }


    @Override
    public String toString() {
        return fields.getIcon();
    }
}
