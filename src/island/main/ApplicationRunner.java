package island.main;

import island.location.Cell;
import island.model.IslandCellGenerator;

import java.util.List;

/**
 * The only purpose of this class is to run applications.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        IslandCellGenerator islandCellGenerator = new IslandCellGenerator();
        List<List<Cell>> island = islandCellGenerator.generateIsland();
        island.forEach(row -> row.forEach(System.out::println));

    }
}
