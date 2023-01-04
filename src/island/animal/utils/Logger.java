package island.animal.utils;

import island.animal.Animal;
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

    int wolfMoveCounter = 0;
    int snakeMoveCounter = 0;
    int foxMoveCounter = 0;
    int bearMoveCounter = 0;
    int eagleMoveCounter = 0;
    int horseMoveCounter = 0;
    int deerMoveCounter = 0;
    int rabbitMoveCounter = 0;
    int mouseMoveCounter = 0;
    int goatMoveCounter = 0;
    int sheepMoveCounter = 0;
    int boarMoveCounter = 0;
    int buffaloMoveCounter = 0;
    int duckMoveCounter = 0;
    int caterpillarMoveCounter = 0;

    public void clearFields() {
        clearAmountCounters();
        clearMoveCounters();
        clearDeathCounters();
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

//    public void countMovesOnCell(Cell[][] island) {
//        for (Cell[] cells : island) {
//            for (Cell cell : cells) {
//                wolfMoveCounter += cell.getAnimals().get(WOLF).stream().mapToInt(Animal::getMoveCount).sum();
//                snakeMoveCounter += cell.getAnimals().get(SNAKE).stream().mapToInt(Animal::getMoveCount).sum();
//                foxMoveCounter += cell.getAnimals().get(FOX).stream().mapToInt(Animal::getMoveCount).sum();
//                bearMoveCounter += cell.getAnimals().get(BEAR).stream().mapToInt(Animal::getMoveCount).sum();
//                eagleMoveCounter += cell.getAnimals().get(EAGLE).stream().mapToInt(Animal::getMoveCount).sum();
//                horseMoveCounter += cell.getAnimals().get(HORSE).stream().mapToInt(Animal::getMoveCount).sum();
//                deerMoveCounter += cell.getAnimals().get(DEER).stream().mapToInt(Animal::getMoveCount).sum();
//                rabbitMoveCounter += cell.getAnimals().get(RABBIT).stream().mapToInt(Animal::getMoveCount).sum();
//                mouseMoveCounter += cell.getAnimals().get(MOUSE).stream().mapToInt(Animal::getMoveCount).sum();
//                goatMoveCounter += cell.getAnimals().get(GOAT).stream().mapToInt(Animal::getMoveCount).sum();
//                sheepMoveCounter += cell.getAnimals().get(SHEEP).stream().mapToInt(Animal::getMoveCount).sum();
//                boarMoveCounter += cell.getAnimals().get(BOAR).stream().mapToInt(Animal::getMoveCount).sum();
//                buffaloMoveCounter += cell.getAnimals().get(BUFFALO).stream().mapToInt(Animal::getMoveCount).sum();
//                duckMoveCounter += cell.getAnimals().get(DUCK).stream().mapToInt(Animal::getMoveCount).sum();
//                caterpillarMoveCounter += cell.getAnimals().get(CATERPILLAR).stream().mapToInt(Animal::getMoveCount).sum();
//            }
//        }
//    }

    public void printInfo(int day) {
        System.out.printf("Day: %d\n", day);
        print(" \uD83D\uDC3A", wolfAmount, Wolf.moveCounter, Wolf.deathCounter);
        print(" \uD83D\uDC0D", snakeAmount, Snake.moveCounter, Snake.deathCounter);
        print(" \uD83E\uDD8A", foxAmount, Fox.moveCounter, Fox.deathCounter);
        print(" \uD83D\uDC3B", bearAmount, Bear.moveCounter, Bear.deathCounter);
        print(" \uD83E\uDD85", eagleAmount, Eagle.moveCounter, Eagle.deathCounter);
        print(" \uD83D\uDC0E", horseAmount, Horse.moveCounter, Horse.deathCounter);
        print(" \uD83E\uDD8C", deerAmount, Deer.moveCounter, Deer.deathCounter);
        print(" \uD83D\uDC07", rabbitAmount, Rabbit.moveCounter, Rabbit.deathCounter);
        print(" \uD83D\uDC01", mouseAmount, Mouse.moveCounter, Mouse.deathCounter);
        print(" \uD83D\uDC10", goatAmount, Goat.moveCounter, Goat.deathCounter);
        print(" \uD83D\uDC11", sheepAmount, Sheep.moveCounter, Sheep.deathCounter);
        print(" \uD83D\uDC17", boarAmount, Bear.moveCounter, Bear.deathCounter);
        print(" \uD83D\uDC03", buffaloAmount, Buffalo.moveCounter, Buffalo.deathCounter);
        print(" \uD83E\uDD86", duckAmount, Duck.moveCounter, Duck.deathCounter);
        print(" \uD83D\uDC1B", caterpillarAmount, Caterpillar.moveCounter, Caterpillar.deathCounter);
        print(" \uD83E\uDEB4", plantAmount, 0, Plant.deathCounter);
    }

    private void print(String icon, int amount, int moveCounter, int deathCounter) {
        System.out.printf(
                "%s[Общее количество = %d, Количество погибших = %d, Количество перемещений = %d, Количество новорожденных = %d]\n",
                icon, amount, deathCounter, moveCounter, 0
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
}
