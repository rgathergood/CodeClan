package Kaiju;

import Jaeger.Jaeger;
import Jaeger.Mark1;

import java.util.ArrayList;

public abstract class Kaiju {
    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String roar() {
        return  "ROOOAARR!!!";
    }

    public void takeDamageFromJaeger(int jaegerAttack) {
        this.healthValue -= jaegerAttack;
    }

    public void attack(Jaeger jaeger) {
        jaeger.takeDamageFromKaiju(this.attackValue);
    }

    public void attack(IDefend defend) {
        defend.defend(this.attackValue);
    }
}

interface IDefend {
    void defend(int attackPoints);
}

interface IAttack {
    void attack(IDefend defend);
}
