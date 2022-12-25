package island.animal.utils;

import island.animal.Animal;
import island.animal.kind.enumerator.Kind;
import island.location.Cell;

import java.util.List;
import java.util.Map;

import static island.animal.kind.enumerator.Kind.*;
import static island.animal.kind.enumerator.Kind.FOX;
import static island.model.IslandGenerator.ISLAND;

public class Logger {
    private static int totalCount = 0;
    private Cell cell;

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public void printInfo(int day) {
        int wolfAmount = 0;
        int anacondaAmount = 0;
        int foxAmount = 0;
        int bearAmount = 0;
        int eagleAmount = 0;
        int horseAmount = 0;
        int deerAmount = 0;
        int rabbitAmount = 0;
        int mouseAmount = 0;
        int goatAmount = 0;
        int sheepAmount = 0;
        int boarAmount = 0;
        int buffaloAmount = 0;
        int duckAmount = 0;
        int caterpillarAmount = 0;
        int plantAmount = 0;
        // Details for each cell
        for (int i = 0; i < ISLAND.length; i++) {
            for (int j = 0; j < ISLAND[i].length; j++) {

                wolfAmount += ISLAND[i][j].getAnimals().get(WOLF).size();
                anacondaAmount += ISLAND[i][j].getAnimals().get(ANACONDA).size();
                foxAmount += ISLAND[i][j].getAnimals().get(FOX).size();
                bearAmount += ISLAND[i][j].getAnimals().get(BEAR).size();
                eagleAmount += ISLAND[i][j].getAnimals().get(EAGLE).size();
                horseAmount += ISLAND[i][j].getAnimals().get(HORSE).size();
                deerAmount += ISLAND[i][j].getAnimals().get(DEER).size();
                rabbitAmount += ISLAND[i][j].getAnimals().get(RABBIT).size();
                mouseAmount += ISLAND[i][j].getAnimals().get(MOUSE).size();
                goatAmount += ISLAND[i][j].getAnimals().get(GOAT).size();
                sheepAmount += ISLAND[i][j].getAnimals().get(SHEEP).size();
                boarAmount += ISLAND[i][j].getAnimals().get(BOAR).size();
                buffaloAmount += ISLAND[i][j].getAnimals().get(BUFFALO).size();
                duckAmount += ISLAND[i][j].getAnimals().get(DUCK).size();
                caterpillarAmount += ISLAND[i][j].getAnimals().get(CATERPILLAR).size();
                plantAmount += ISLAND[i][j].getAnimals().get(PLANT).size();

            }
        }
        System.out.printf("Day: %d\n", day);
        print( " \uD83D\uDC3A", wolfAmount, WOLF);
        print(" \uD83D\uDC0D", anacondaAmount, ANACONDA);
        print(" \uD83E\uDD8A", foxAmount, FOX);
        print(" \uD83D\uDC3B", bearAmount, BEAR);
        print(" \uD83E\uDD85", eagleAmount, EAGLE);
        print(" \uD83D\uDC0E", horseAmount, HORSE);
        print(" \uD83E\uDD8C", deerAmount, DEER);
        print(" \uD83D\uDC07", rabbitAmount, RABBIT);
        print(" \uD83D\uDC01", mouseAmount, MOUSE);
        print(" \uD83D\uDC10", goatAmount, GOAT);
        print(" \uD83D\uDC11", sheepAmount, SHEEP);
        print(" \uD83D\uDC17", boarAmount, BOAR);
        print(" \uD83D\uDC03", buffaloAmount, BUFFALO);
        print(" \uD83E\uDD86", duckAmount, DUCK);
        print(" \uD83D\uDC1B", caterpillarAmount, CATERPILLAR);
        print(" \uD83E\uDEB4", plantAmount, PLANT);
    }

    private void printTotal(int totalCount) {
        System.out.printf("Общее количество животных на острове = %d", totalCount);
    }

    private void print(String icon, int amount, Kind kind) {

        for (Map.Entry<Kind, List<Animal>> pair : cell.getAnimals().entrySet()) {
            List<Animal> animals = pair.getValue();
        }

        System.out.printf(
                "%s[Общее количество = %d, Количество погибших = %d, Количество перемещений = %d, Количество новорожденных = %d]\n",
                icon, amount, 0, amount - cell.getAnimals().get(kind).size(), 0
        );
    }
}
