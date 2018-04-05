package Monster;

public abstract class Monster {
    private String name;
    public int healthPoints;

    public Monster(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public int takeDamage(int damage) {
        return healthPoints -= damage;
    }
}
