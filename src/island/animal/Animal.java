package island.animal;

import island.animal.kind.enumerator.Kind;
import island.config.Configuration;
import island.location.Cell;
import island.model.IslandGenerator;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {

    private final Fields fields;

    public Animal(Fields fields) {
        this.fields = fields;
    }

    public Fields getFields() {
        return fields;
    }

    public boolean move(Cell cell) {
        if (fields.getName().equals("Plant")) {
            return false;
        }
        int newRow = (cell.getRow() + fields.getSpeed()) % Configuration.row;
        int newColumn = (cell.getColumn() + fields.getSpeed()) % Configuration.column;

        boolean isMove = ThreadLocalRandom.current().nextBoolean();

        if (newRow >= Configuration.row || newColumn >= Configuration.column || newRow < 0 || newColumn < 0) {
            isMove = false;
        }

        if (isMove){
            Kind kind = Kind.valueOf(this.getClass().getSimpleName().toUpperCase());
            IslandGenerator.ISLAND[newRow][newColumn].getAnimals().get(kind).add(this);
        }

        return isMove;
    }

    @Override
    public String toString() {
        return fields.getIcon();
    }

}
