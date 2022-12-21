package island.main;

import island.model.IslandGenerator;

/**
 * The only purpose of this class is to run applications.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        IslandGenerator islandGenerator = new IslandGenerator();
        islandGenerator.initialize();
        islandGenerator.printInfo();
    }
}
