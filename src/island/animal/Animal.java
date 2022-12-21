package island.animal;

import island.animal.kind.enumerator.Kind;
import island.config.Configuration;
import island.location.Cell;
import island.model.IslandGenerator;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {

    private final String name;
    private final String icon;
    private final double weight;
    private final int speed;
    private final double satiety;
    private final boolean isAlive;

    public Animal(Fields fields) {
        this.name = fields.getName();
        this.icon = fields.getIcon();
        this.weight = fields.getWeight();
        this.speed = fields.getSpeed();
        this.satiety = fields.getSatiety();
        this.isAlive = fields.isAlive();
    }

    public abstract boolean move(Cell cell);

    @Override
    public String toString() {
        return icon;
    }

}
