package island.animal.kind.predator;

import island.animal.Fields;
import island.animal.kind.enumerator.Kind;
import island.config.Configuration;
import island.location.Cell;
import island.model.IslandGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Predator {
    Fields fields;

    public Wolf(Fields fields) {
        super(fields);
        this.fields = fields;
    }

    @Override
    public boolean move(Cell cell) {
        int newRow = cell.getRow() + fields.getSpeed();
        int newColumn = cell.getColumn() + fields.getSpeed();

        boolean isMove = ThreadLocalRandom.current().nextBoolean();

        if (newRow >= Configuration.row || newColumn >= Configuration.column || newRow < 0 || newColumn < 0) {
            isMove = false;
        }

        if (isMove){
//            IslandGenerator.ISLAND[newRow][newColumn].getAnimals().get(Kind.WOLF).add(this);
        }

        return isMove;
    }

}
