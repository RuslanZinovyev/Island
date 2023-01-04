package island.animal.utils;

import island.animal.Animal;
import island.animal.kind.herbivore.Rabbit;
import island.location.Cell;

import static island.animal.kind.enumerator.Kind.*;

public class Logger {
    int wolfAmount = 0;
    int snakeAmount = 0;
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

    long wolfMoveCounter = 0;
    long snakeMoveCounter = 0;
    long foxMoveCounter = 0;
    long bearMoveCounter = 0;
    long eagleMoveCounter = 0;
    long horseMoveCounter = 0;
    long deerMoveCounter = 0;
    long rabbitMoveCounter = 0;
    long mouseMoveCounter = 0;
    long goatMoveCounter = 0;
    long sheepMoveCounter = 0;
    long boarMoveCounter = 0;
    long buffaloMoveCounter = 0;
    long duckMoveCounter = 0;
    long caterpillarMoveCounter = 0;

    public void clearFields() {
        wolfAmount = 0;
        snakeAmount = 0;
        foxAmount = 0;
        bearAmount = 0;
        eagleAmount = 0;
        horseAmount = 0;
        deerAmount = 0;
        rabbitAmount = 0;
        mouseAmount = 0;
        goatAmount = 0;
        sheepAmount = 0;
        boarAmount = 0;
        buffaloAmount = 0;
        duckAmount = 0;
        caterpillarAmount = 0;
        plantAmount = 0;

         wolfMoveCounter = 0;
         snakeMoveCounter = 0;
         foxMoveCounter = 0;
         bearMoveCounter = 0;
         eagleMoveCounter = 0;
         horseMoveCounter = 0;
         deerMoveCounter = 0;
         rabbitMoveCounter = 0;
         mouseMoveCounter = 0;
         goatMoveCounter = 0;
         sheepMoveCounter = 0;
         boarMoveCounter = 0;
         buffaloMoveCounter = 0;
         duckMoveCounter = 0;
         caterpillarMoveCounter = 0;
    }

    public void countAnimalsOnCell(Cell[] cells) {
        for (Cell cell : cells) {
            wolfAmount += cell.getAnimals().get(WOLF).size();
            snakeAmount += cell.getAnimals().get(SNAKE).size();
            foxAmount += cell.getAnimals().get(FOX).size();
            bearAmount += cell.getAnimals().get(BEAR).size();
            eagleAmount += cell.getAnimals().get(EAGLE).size();
            horseAmount += cell.getAnimals().get(HORSE).size();
            deerAmount += cell.getAnimals().get(DEER).size();
            rabbitAmount += cell.getAnimals().get(RABBIT).size();
            mouseAmount += cell.getAnimals().get(MOUSE).size();
            goatAmount += cell.getAnimals().get(GOAT).size();
            sheepAmount += cell.getAnimals().get(SHEEP).size();
            boarAmount += cell.getAnimals().get(BOAR).size();
            buffaloAmount += cell.getAnimals().get(BUFFALO).size();
            duckAmount += cell.getAnimals().get(DUCK).size();
            caterpillarAmount += cell.getAnimals().get(CATERPILLAR).size();
            plantAmount += cell.getAnimals().get(PLANT).size();
        }
    }

    public void countMovesOnCell(Cell[] cells) {
        for (Cell cell : cells) {
            wolfMoveCounter += cell.getAnimals().get(WOLF).stream().mapToInt(Animal::getMoveCount).sum();
            snakeMoveCounter += cell.getAnimals().get(SNAKE).stream().mapToInt(Animal::getMoveCount).sum();
            foxMoveCounter += cell.getAnimals().get(FOX).stream().mapToInt(Animal::getMoveCount).sum();
            bearMoveCounter += cell.getAnimals().get(BEAR).stream().mapToInt(Animal::getMoveCount).sum();
            eagleMoveCounter += cell.getAnimals().get(EAGLE).stream().mapToInt(Animal::getMoveCount).sum();
            horseMoveCounter += cell.getAnimals().get(HORSE).stream().mapToInt(Animal::getMoveCount).sum();
            deerMoveCounter += cell.getAnimals().get(DEER).stream().mapToInt(Animal::getMoveCount).sum();
            rabbitMoveCounter += cell.getAnimals().get(RABBIT).stream().mapToInt(Animal::getMoveCount).sum();
            mouseMoveCounter += cell.getAnimals().get(MOUSE).stream().mapToInt(Animal::getMoveCount).sum();
            goatMoveCounter += cell.getAnimals().get(GOAT).stream().mapToInt(Animal::getMoveCount).sum();
            sheepMoveCounter += cell.getAnimals().get(SHEEP).stream().mapToInt(Animal::getMoveCount).sum();
            boarMoveCounter += cell.getAnimals().get(BOAR).stream().mapToInt(Animal::getMoveCount).sum();
            buffaloMoveCounter += cell.getAnimals().get(BUFFALO).stream().mapToInt(Animal::getMoveCount).sum();
            duckMoveCounter += cell.getAnimals().get(DUCK).stream().mapToInt(Animal::getMoveCount).sum();
            caterpillarMoveCounter += cell.getAnimals().get(CATERPILLAR).stream().mapToInt(Animal::getMoveCount).sum();
        }
    }

    public void printInfo(int day) {
        System.out.printf("Day: %d\n", day);
        print(" \uD83D\uDC3A", wolfAmount, wolfMoveCounter, 0);
        print(" \uD83D\uDC0D", snakeAmount, snakeMoveCounter, 0);
        print(" \uD83E\uDD8A", foxAmount, foxMoveCounter, 0);
        print(" \uD83D\uDC3B", bearAmount, bearMoveCounter, 0);
        print(" \uD83E\uDD85", eagleAmount, eagleMoveCounter, 0);
        print(" \uD83D\uDC0E", horseAmount, horseMoveCounter, 0);
        print(" \uD83E\uDD8C", deerAmount, deerMoveCounter, 0);
        print(" \uD83D\uDC07", rabbitAmount, rabbitMoveCounter, Rabbit.deathCounter);
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
