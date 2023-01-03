package island.animal.utils;

import island.animal.Animal;
import island.location.Cell;

import static island.animal.kind.enumerator.Kind.*;
import static island.model.IslandGenerator.ISLAND;

public class Logger {

    public void printInfo(int day) {
        int wolfAmount = 0;
        long wolfMoveCounter = 0;

        int snakeAmount = 0;
        long snakeMoveCounter = 0;
        long snakeDeath = 0;

        int foxAmount = 0;
        long foxMoveCounter = 0;

        int bearAmount = 0;
        long bearMoveCounter = 0;

        int eagleAmount = 0;
        long eagleMoveCounter = 0;

        int horseAmount = 0;
        long horseMoveCounter = 0;

        int deerAmount = 0;
        long deerMoveCounter = 0;

        int rabbitAmount = 0;
        long rabbitMoveCounter = 0;

        int mouseAmount = 0;
        long mouseMoveCounter = 0;

        int goatAmount = 0;
        long goatMoveCounter = 0;

        int sheepAmount = 0;
        long sheepMoveCounter = 0;

        int boarAmount = 0;
        long boarMoveCounter = 0;

        int buffaloAmount = 0;
        long buffaloMoveCounter = 0;

        int duckAmount = 0;
        long duckMoveCounter = 0;

        int caterpillarAmount = 0;
        long caterpillarMoveCounter = 0;

        int plantAmount = 0;

        for (Cell[] cells : ISLAND) {
            for (Cell cell : cells) {

                wolfAmount += cell.getAnimals().get(WOLF).size();
                wolfMoveCounter += cell.getAnimals().get(WOLF).stream().mapToInt(Animal::getMoveCount).sum();

                snakeAmount += cell.getAnimals().get(SNAKE).size();
                snakeMoveCounter += cell.getAnimals().get(SNAKE).stream().mapToInt(Animal::getMoveCount).sum();

                foxAmount += cell.getAnimals().get(FOX).size();
                foxMoveCounter += cell.getAnimals().get(FOX).stream().mapToInt(Animal::getMoveCount).sum();

                bearAmount += cell.getAnimals().get(BEAR).size();
                bearMoveCounter += cell.getAnimals().get(BEAR).stream().mapToInt(Animal::getMoveCount).sum();

                eagleAmount += cell.getAnimals().get(EAGLE).size();
                eagleMoveCounter += cell.getAnimals().get(EAGLE).stream().mapToInt(Animal::getMoveCount).sum();

                horseAmount += cell.getAnimals().get(HORSE).size();
                horseMoveCounter += cell.getAnimals().get(HORSE).stream().mapToInt(Animal::getMoveCount).sum();

                deerAmount += cell.getAnimals().get(DEER).size();
                deerMoveCounter += cell.getAnimals().get(DEER).stream().mapToInt(Animal::getMoveCount).sum();

                rabbitAmount += cell.getAnimals().get(RABBIT).size();
                rabbitMoveCounter += cell.getAnimals().get(RABBIT).stream().mapToInt(Animal::getMoveCount).sum();

                mouseAmount += cell.getAnimals().get(MOUSE).size();
                mouseMoveCounter += cell.getAnimals().get(MOUSE).stream().mapToInt(Animal::getMoveCount).sum();

                goatAmount += cell.getAnimals().get(GOAT).size();
                goatMoveCounter += cell.getAnimals().get(GOAT).stream().mapToInt(Animal::getMoveCount).sum();

                sheepAmount += cell.getAnimals().get(SHEEP).size();
                sheepMoveCounter += cell.getAnimals().get(SHEEP).stream().mapToInt(Animal::getMoveCount).sum();

                boarAmount += cell.getAnimals().get(BOAR).size();
                boarMoveCounter += cell.getAnimals().get(BOAR).stream().mapToInt(Animal::getMoveCount).sum();

                buffaloAmount += cell.getAnimals().get(BUFFALO).size();
                buffaloMoveCounter += cell.getAnimals().get(BUFFALO).stream().mapToInt(Animal::getMoveCount).sum();

                duckAmount += cell.getAnimals().get(DUCK).size();
                duckMoveCounter += cell.getAnimals().get(DUCK).stream().mapToInt(Animal::getMoveCount).sum();

                caterpillarAmount += cell.getAnimals().get(CATERPILLAR).size();
                caterpillarMoveCounter += cell.getAnimals().get(CATERPILLAR).stream().mapToInt(Animal::getMoveCount).sum();

                plantAmount += cell.getAnimals().get(PLANT).size();

            }
        }
        System.out.printf("Day: %d\n", day);
        print(" \uD83D\uDC3A", wolfAmount, wolfMoveCounter, 0);
        print(" \uD83D\uDC0D", snakeAmount, snakeMoveCounter, snakeDeath);
        print(" \uD83E\uDD8A", foxAmount, foxMoveCounter, 0);
        print(" \uD83D\uDC3B", bearAmount, bearMoveCounter, 0);
        print(" \uD83E\uDD85", eagleAmount, eagleMoveCounter, 0);
        print(" \uD83D\uDC0E", horseAmount, horseMoveCounter, 0);
        print(" \uD83E\uDD8C", deerAmount, deerMoveCounter, 0);
        print(" \uD83D\uDC07", rabbitAmount, rabbitMoveCounter, 0);
        print(" \uD83D\uDC01", mouseAmount, mouseMoveCounter, 0);
        print(" \uD83D\uDC10", goatAmount, goatMoveCounter, 0);
        print(" \uD83D\uDC11", sheepAmount, sheepMoveCounter, 0);
        print(" \uD83D\uDC17", boarAmount, boarMoveCounter, 0);
        print(" \uD83D\uDC03", buffaloAmount, buffaloMoveCounter, 0);
        print(" \uD83E\uDD86", duckAmount, duckMoveCounter, 0);
        print(" \uD83D\uDC1B", caterpillarAmount, caterpillarMoveCounter, 0);
        print(" \uD83E\uDEB4", plantAmount, 0, 0);
    }

    private void print(String icon, int amount, long moveCounter, long deathCounter) {
        System.out.printf(
                "%s[Общее количество = %d, Количество погибших = %d, Количество перемещений = %d, Количество новорожденных = %d]\n",
                icon, amount, deathCounter, moveCounter, 0
        );
    }
}
