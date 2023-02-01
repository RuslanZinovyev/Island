package island.main;

import island.animal.utils.Logger;
import island.location.Cell;
import island.location.LifeCycle;
import island.location.PlantGrowth;
import island.model.IslandGenerator;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static island.model.IslandGenerator.ISLAND;

public class ApplicationRunner {
    public static final String GAME_OVER = "\nGAME OVER!!!";
    public static int day = 0;

    public static void main(String[] args) {
        ScheduledExecutorService executorLifeCycle = Executors.newScheduledThreadPool(2);
        ScheduledExecutorService executorPlantGrowth = Executors.newScheduledThreadPool(2);

        IslandGenerator islandGenerator = new IslandGenerator();
        Logger logger = new Logger();
        islandGenerator.initialize();

        while (logger.countAnimalsOnIsland(ISLAND) != 0) {
            day++;
            logger.countAnimalsOnCell(ISLAND);
            for (Cell[] cells : ISLAND) {
                for (Cell cell : cells) {
                    executorPlantGrowth.scheduleWithFixedDelay(new PlantGrowth(cell), 1, 1, TimeUnit.SECONDS);
                    executorLifeCycle.scheduleWithFixedDelay(new LifeCycle(cell), 2, 1, TimeUnit.SECONDS);
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
        System.out.printf("All the animals were dead on %d day\n", day);
    }
}
