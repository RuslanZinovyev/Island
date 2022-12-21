package island.model;

import island.animal.Animal;
import island.animal.kind.enumerator.Kind;
import island.config.Configuration;
import island.location.Cell;

import java.util.List;
import java.util.Map;

public class IslandGenerator {
    private static final Cell[][] ISLAND = new Cell[Configuration.row][Configuration.column];

    // initialize island with cells
    public void initialize() {
        for (int i = 0; i < ISLAND.length; i++) {
            for (int j = 0; j < ISLAND[i].length; j++) {
                ISLAND[i][j] = new Cell(i, j);
            }
        }
    }

    public void printInfo(){
        // Details for each cell
        for (int i = 0; i < ISLAND.length; i++) {
            for (int j = 0; j < ISLAND[i].length; j++) {
                System.out.print(ISLAND[i][j] + "\t");
                System.out.print(ISLAND[i][j].getAnimals());
                System.out.println();
            }
            System.out.println();
        }
        int totalCount = 0;

        for (int i = 0; i < ISLAND.length; i++) {
            for (int j = 0; j < ISLAND[i].length; j++) {
                Map<Kind, List<? extends Animal>> map = ISLAND[i][j].getAnimals();
                for (List<? extends Animal> value : map.values()) {
                    for (Animal animal : value) {
                        totalCount++;
                    }
                }
            }
        }

        System.out.println("The full amount animals on the island is: " + totalCount);
    }

}
