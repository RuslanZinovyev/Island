package island.main;

import island.animal.Animal;
import island.animal.kind.enumerator.Kind;
import island.animal.utils.Logger;
import island.location.Cell;
import island.model.IslandGenerator;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static island.model.IslandGenerator.ISLAND;

/**
 * The only purpose of this class is to run applications.
 */
public class ApplicationRunner {
    static int day = 0;

    public static void main(String[] args) {
        IslandGenerator islandGenerator = new IslandGenerator();
        Logger logger = new Logger();
        islandGenerator.initialize();

        while (true) {
            day++;
            for (Cell[] cells : ISLAND) {
                for (Cell cell : cells) {
                    logger.setCell(cell);
                    runEvent(cell);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            logger.printInfo(day);
        }
    }

    private synchronized static void runEvent(Cell cell) {
        for (Map.Entry<Kind, List<Animal>> pair : cell.getAnimals().entrySet()) {
            List<Animal> animals = pair.getValue();
            Iterator<Animal> iterator = animals.iterator();
            while (iterator.hasNext()) {
                Animal animal = iterator.next();
                boolean isMove = animal.move(cell);
                if (isMove) iterator.remove();
            }
        }
    }

}
