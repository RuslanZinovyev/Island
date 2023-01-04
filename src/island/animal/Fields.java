package island.animal;

public class Fields {

    private final String name;
    private final String icon;
    private final double weight;
    private final int speed;
    private final double maxFoodRequired;
    private final int maxCount;

    public Fields(String name, String icon, double weight, int speed, double maxFoodRequired, int maxCount) {
        this.name = name;
        this.icon = icon;
        this.weight = weight;
        this.speed = speed;
        this.maxFoodRequired = maxFoodRequired;
        this.maxCount = maxCount;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public double getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public double getMaxFoodRequired() {
        return maxFoodRequired;
    }

    public int getMaxCount() {
        return maxCount;
    }


    @Override
    public String toString() {
        return "Fields{" +
                "name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", satiety=" + maxFoodRequired +
                ", maxCount=" + maxCount +
                '}';
    }
}
