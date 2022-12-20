package island.animal;

public class Fields {
    private final String name;
    private final String icon;
    private final double weight;
    private final int speed;
    private final double satiety;
    private final boolean isAlive;

    public Fields(String name, String icon, double weight, int speed, double satiety, boolean isAlive) {
        this.name = name;
        this.icon = icon;
        this.weight = weight;
        this.speed = speed;
        this.satiety = satiety;
        this.isAlive = isAlive;
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

    public double getSatiety() {
        return satiety;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public String toString() {
        return "Fields{" +
                "name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", satiety=" + satiety +
                ", isAlive=" + isAlive +
                '}';
    }
}
