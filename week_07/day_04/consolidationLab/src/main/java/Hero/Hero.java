package Hero;

public abstract class Hero {
    private String name;
    private int healthPoints;

    public Hero(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }
}
