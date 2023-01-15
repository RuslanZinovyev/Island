package island.animal.utils;

import island.animal.Animal;
import island.animal.kind.enumerator.Kind;
import island.animal.kind.herbivore.*;
import island.animal.kind.plant.Plant;
import island.animal.kind.predator.*;

public class Counter {
    private Counter() {}

    public static void countDeath(Animal animal) {
        switch (animal.getClass().getSimpleName().toUpperCase()) {
            case "WOLF" -> Wolf.deathCounter++;
            case "SNAKE" -> Snake.deathCounter++;
            case "FOX" -> Fox.deathCounter++;
            case "BEAR" -> Bear.deathCounter++;
            case "EAGLE" -> Eagle.deathCounter++;
            case "HORSE" -> Horse.deathCounter++;
            case "DEER" -> Deer.deathCounter++;
            case "RABBIT" -> Rabbit.deathCounter++;
            case "MOUSE" -> Mouse.deathCounter++;
            case "GOAT" -> Goat.deathCounter++;
            case "SHEEP" -> Sheep.deathCounter++;
            case "BOAR" -> Boar.deathCounter++;
            case "BUFFALO" -> Buffalo.deathCounter++;
            case "DUCK" -> Duck.deathCounter++;
            case "CATERPILLAR" -> Caterpillar.deathCounter++;
            case "PLANT" -> Plant.deathCounter++;
        }
    }

    public static void countMoves(Kind kind) {
        switch (kind) {
            case WOLF -> Wolf.moveCounter++;
            case SNAKE -> Snake.moveCounter++;
            case FOX -> Fox.moveCounter++;
            case BEAR -> Bear.moveCounter++;
            case EAGLE -> Eagle.moveCounter++;
            case HORSE -> Horse.moveCounter++;
            case DEER -> Deer.moveCounter++;
            case RABBIT -> Rabbit.moveCounter++;
            case MOUSE -> Mouse.moveCounter++;
            case GOAT -> Goat.moveCounter++;
            case SHEEP -> Sheep.moveCounter++;
            case BOAR -> Boar.moveCounter++;
            case BUFFALO -> Buffalo.moveCounter++;
            case DUCK -> Duck.moveCounter++;
            case CATERPILLAR -> Caterpillar.moveCounter++;
        }
    }

    public static void countBirth(Kind kind) {
        switch (kind) {
            case WOLF -> Wolf.birthCounter++;
            case SNAKE -> Snake.bornCounter++;
            case FOX -> Fox.bornCounter++;
            case BEAR -> Bear.bornCounter++;
            case EAGLE -> Eagle.bornCounter++;
            case HORSE -> Horse.bornCounter++;
            case DEER -> Deer.bornCounter++;
            case RABBIT -> Rabbit.bornCounter++;
            case MOUSE -> Mouse.bornCounter++;
            case GOAT -> Goat.bornCounter++;
            case SHEEP -> Sheep.bornCounter++;
            case BOAR -> Boar.bornCounter++;
            case BUFFALO -> Buffalo.bornCounter++;
            case DUCK -> Duck.bornCounter++;
            case CATERPILLAR -> Caterpillar.bornCounter++;
        }
    }
}
