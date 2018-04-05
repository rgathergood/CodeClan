package Hero;

import HealingTool.HealingTool;

import java.util.ArrayList;

public class Healer extends Hero{

    private ArrayList<HealingTool> healingTool;

    public Healer(String name, int healthPoints) {
        super(name, healthPoints);
        this.healingTool = new ArrayList<>();
    }
}
