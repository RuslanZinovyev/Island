package island.animal.kind.enumerator;

public enum Kind {
    WOLF, SNAKE, FOX, BEAR, EAGLE, HORSE, DEER, RABBIT, MOUSE, GOAT, SHEEP, BOAR, BUFFALO, DUCK, CATERPILLAR, PLANT;

    public static Kind[] getHerbivores() {
        Kind[] herbivores = { HORSE, DEER, RABBIT, MOUSE, GOAT, SHEEP, BOAR, BUFFALO, DUCK, CATERPILLAR };
        return herbivores;
    }

    public static Kind[] getAnimals() {
        Kind[] animals = { WOLF, SNAKE, FOX, BEAR, EAGLE, HORSE, DEER, RABBIT, MOUSE, GOAT, SHEEP, BOAR, BUFFALO, DUCK, CATERPILLAR };
        return animals;
    }
}
