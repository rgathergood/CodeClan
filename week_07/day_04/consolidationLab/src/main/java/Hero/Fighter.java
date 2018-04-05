package Hero;

import java.util.ArrayList;

import Monster.Monster;
import Weapon.Weapon;

public class Fighter extends Hero {
    private ArrayList<Weapon> weapon;

    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
        this.weapon = new ArrayList<>();
    }

    public void attack(Monster monster) {
//        monster.healthPoints -= weapon.attackValue;
    }

}
