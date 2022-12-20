package island.model;

import island.animal.Animal;
import island.animal.kind.enumerator.Kind;
import island.config.Configuration;
import island.location.Cell;

import java.util.List;
import java.util.Map;

public class IslandGenerator {
    private static Cell[][] island = new Cell[Configuration.row][Configuration.column];

    // initialize island with cells
    public void initialize() {
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                island[i][j] = new Cell(i, j);
            }
        }
    }

    public void printInfo(){
        // Details for each cell
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                System.out.print(island[i][j] + "\t");
                System.out.print(island[i][j].getAnimals());
                System.out.println();
            }
            System.out.println();
        }
        int totalCount = 0;

        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                Map<Kind, List<? extends Animal>> map = island[i][j].getAnimals();
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
