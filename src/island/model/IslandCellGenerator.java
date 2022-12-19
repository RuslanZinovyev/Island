package island.model;

import island.location.Cell;

import java.util.ArrayList;
import java.util.List;

public class IslandCellGenerator {
    private static final List<List<Cell>> island = new ArrayList<>();
    //TODO these fields shouldn't be hardcoded, they must be taken from the configuration file.
    private static final int x = 1;
    private static final int y = 2;

    static {
        for (int i = 0; i < y; i++) {
            List<Cell> cells = new ArrayList<>();
            for (int j = 0; j < x; j++) {
                cells.add(new Cell());
            }
            island.add(cells);
        }
    }

    public List<List<Cell>> generateIsland() {
        return island;
    }

}
