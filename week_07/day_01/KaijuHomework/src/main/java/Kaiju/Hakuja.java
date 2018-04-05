package Kaiju;

public class Hakuja extends Kaiju implements IMove {
    public Hakuja(String name, int HealthValue) {
        super(name, HealthValue, 30);
    }

    @Override
    public String move(String movement) {
        return "The Kaiju " + movement + " towards Tokyo!";
    }

}
