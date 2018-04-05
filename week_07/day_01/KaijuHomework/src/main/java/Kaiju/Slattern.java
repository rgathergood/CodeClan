package Kaiju;

public class Slattern extends Kaiju implements IMove {
    public Slattern(String name, int HealthValue, int AttackValue) {
        super(name, HealthValue, AttackValue);
    }

    @Override
    public String move(String movement) {
        return "The Kaiju " + movement + " towards Tokyo!";
    }
}
