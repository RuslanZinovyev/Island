package island.animal;

import island.animal.kind.enumerator.Kind;
import island.animal.kind.herbivore.*;
import island.animal.kind.predator.*;
import island.config.Configuration;
import island.location.Cell;
import island.model.IslandGenerator;

import java.util.concurrent.ThreadLocalRandom;

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

    @Override
    public String toString() {
        return fields.getIcon();
    }

    private void countMoves(Kind kind) {
        switch (kind) {
            case WOLF -> Wolf.moveCounter++;
            case SNAKE -> Snake.moveCounter++;
            case FOX -> Fox.moveCounter++;
            case BEAR -> Bear.moveCounter++;
            case EAGLE -> Eagle.moveCounter++;
            case HORSE -> Horse.moveCounter++;
            case DEER -> Deer.moveCounter++;
            case RABBIT -> Rabbit.moveCounter++;
            case MOUSE -> Mouse.moveCounter++;
            case GOAT -> Goat.moveCounter++;
            case SHEEP -> Sheep.moveCounter++;
            case BOAR -> Boar.moveCounter++;
            case BUFFALO -> Buffalo.moveCounter++;
            case DUCK -> Duck.moveCounter++;
            case CATERPILLAR -> Caterpillar.moveCounter++;
        }
    }

}
