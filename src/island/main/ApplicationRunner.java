package island.main;

import island.animal.utils.Logger;
import island.location.Cell;
import island.location.LifeCycle;
import island.model.IslandGenerator;

import static island.model.IslandGenerator.ISLAND;

public class ApplicationRunner {
    public static final String GAME_OVER = "\nGAME OVER!!!";
    public static int day = 0;

    public static void main(String[] args) {
        IslandGenerator islandGenerator = new IslandGenerator();
        LifeCycle lifeCycle = new LifeCycle();
        Logger logger = new Logger();
        islandGenerator.initialize();

        while (logger.countAnimalsOnIsland(ISLAND) != 0) {
            day++;
            logger.countAnimalsOnCell(ISLAND);
            for (Cell[] cells : ISLAND) {
                for (Cell cell : cells) {
                    lifeCycle.move(cell);
                    lifeCycle.eat(cell);
                    lifeCycle.breed(cell);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            logger.printInfo(day);
            logger.clearFields();
        }
        System.out.println(GAME_OVER);
        System.out.printf("All the animals were dead on %d day", day);
    }
}
