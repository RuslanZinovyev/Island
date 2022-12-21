package island.main;

import island.animal.Animal;
import island.animal.kind.enumerator.Kind;
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

    public static void main(String[] args) {
        IslandGenerator islandGenerator = new IslandGenerator();
        islandGenerator.initialize();

        while (true) {
            for (int i = 0; i < ISLAND.length; i++) {
                for (int j = 0; j < ISLAND[i].length; j++) {
                    Cell cell = ISLAND[i][j];
                    runEvent(cell);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            islandGenerator.printInfo();
        }
    }

    private static void runEvent(Cell cell) {
        for (Map.Entry<Kind, List<? extends Animal>> pair : cell.getAnimals().entrySet()) {
            List<? extends Animal> animals = pair.getValue();
            Iterator<? extends Animal> iterator = animals.iterator();
            while (iterator.hasNext()) {
                Animal animal = iterator.next();
                boolean isMove = animal.move(cell);
                if (isMove) iterator.remove();
            }
        }
    }

}
