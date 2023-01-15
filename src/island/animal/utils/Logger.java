package island.animal.utils;

import island.animal.kind.enumerator.Kind;
import island.animal.kind.herbivore.*;
import island.animal.kind.plant.Plant;
import island.animal.kind.predator.*;
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

    public void clearFields() {
        clearAmountCounters();
        clearMoveCounters();
        clearDeathCounters();
        clearBirthCounters();
    }

    public void countAnimalsOnCell(Cell[][] island) {
        for (Cell[] cells : island) {
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
    }

    public int countAnimalsOnIsland(Cell[][] island) {
        int allAnimals = 0;
        for (Cell[] cells : island) {
            for (Cell cell : cells) {
                Kind[] kinds = Kind.values();
                for (Kind kind : kinds) {
                    allAnimals += cell.getAnimals().get(kind).size();
                }
            }
        }
        return allAnimals;
    }

    public void printInfo(int day) {
        System.out.printf("Day: %d\n", day);
        print(" \uD83D\uDC3A", wolfAmount, Wolf.moveCounter, Wolf.deathCounter, Wolf.birthCounter);
        print(" \uD83D\uDC0D", snakeAmount, Snake.moveCounter, Snake.deathCounter, Snake.bornCounter);
        print(" \uD83E\uDD8A", foxAmount, Fox.moveCounter, Fox.deathCounter, Fox.bornCounter);
        print(" \uD83D\uDC3B", bearAmount, Bear.moveCounter, Bear.deathCounter, Bear.bornCounter);
        print(" \uD83E\uDD85", eagleAmount, Eagle.moveCounter, Eagle.deathCounter, Eagle.bornCounter);
        print(" \uD83D\uDC0E", horseAmount, Horse.moveCounter, Horse.deathCounter, Horse.bornCounter);
        print(" \uD83E\uDD8C", deerAmount, Deer.moveCounter, Deer.deathCounter, Deer.bornCounter);
        print(" \uD83D\uDC07", rabbitAmount, Rabbit.moveCounter, Rabbit.deathCounter, Rabbit.bornCounter);
        print(" \uD83D\uDC01", mouseAmount, Mouse.moveCounter, Mouse.deathCounter, Mouse.bornCounter);
        print(" \uD83D\uDC10", goatAmount, Goat.moveCounter, Goat.deathCounter, Goat.bornCounter);
        print(" \uD83D\uDC11", sheepAmount, Sheep.moveCounter, Sheep.deathCounter, Sheep.bornCounter);
        print(" \uD83D\uDC17", boarAmount, Boar.moveCounter, Boar.deathCounter, Boar.bornCounter);
        print(" \uD83D\uDC03", buffaloAmount, Buffalo.moveCounter, Buffalo.deathCounter, Buffalo.bornCounter);
        print(" \uD83E\uDD86", duckAmount, Duck.moveCounter, Duck.deathCounter, Duck.bornCounter);
        print(" \uD83D\uDC1B", caterpillarAmount, Caterpillar.moveCounter, Caterpillar.deathCounter, Caterpillar.bornCounter);
        print(" \uD83E\uDEB4", plantAmount, 0, Plant.deathCounter, Plant.bornCounter);
    }

    private void print(String icon, int amount, int moveCounter, int deathCounter, int birthCounter) {
        System.out.printf(
                "%s[Общее количество = %d, Количество смертей = %d, Количество перемещений = %d, Количество новорожденных = %d]\n",
                icon, amount, deathCounter, moveCounter, birthCounter
        );
    }

    private void clearAmountCounters() {
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
    }

    private void clearDeathCounters() {
        Wolf.deathCounter = 0;
        Snake.deathCounter = 0;
        Fox.deathCounter = 0;
        Bear.deathCounter = 0;
        Eagle.deathCounter = 0;
        Horse.deathCounter = 0;
        Deer.deathCounter = 0;
        Rabbit.deathCounter = 0;
        Mouse.deathCounter = 0;
        Goat.deathCounter = 0;
        Sheep.deathCounter = 0;
        Boar.deathCounter = 0;
        Buffalo.deathCounter = 0;
        Duck.deathCounter = 0;
        Caterpillar.deathCounter = 0;
        Plant.deathCounter = 0;
    }

    private void clearMoveCounters() {
        Wolf.moveCounter = 0;
        Snake.moveCounter = 0;
        Fox.moveCounter = 0;
        Bear.moveCounter = 0;
        Eagle.moveCounter = 0;
        Horse.moveCounter = 0;
        Deer.moveCounter = 0;
        Rabbit.moveCounter = 0;
        Mouse.moveCounter = 0;
        Goat.moveCounter = 0;
        Sheep.moveCounter = 0;
        Boar.moveCounter = 0;
        Buffalo.moveCounter = 0;
        Duck.moveCounter = 0;
        Caterpillar.moveCounter = 0;
    }

    private void clearBirthCounters() {
        Wolf.birthCounter = 0;
        Snake.bornCounter = 0;
        Fox.bornCounter = 0;
        Bear.bornCounter = 0;
        Eagle.bornCounter = 0;
        Horse.bornCounter = 0;
        Deer.bornCounter = 0;
        Rabbit.bornCounter = 0;
        Mouse.bornCounter = 0;
        Goat.bornCounter = 0;
        Sheep.bornCounter = 0;
        Boar.bornCounter = 0;
        Buffalo.bornCounter = 0;
        Duck.bornCounter = 0;
        Caterpillar.bornCounter = 0;
        Plant.bornCounter = 0;
    }
}
