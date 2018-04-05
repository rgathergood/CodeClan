package Jaeger;

import Kaiju.Kaiju;

public abstract class Jaeger {
    private String type;
    private int healthValue;
    private int punchValue;
    private int explodeValue;

    public Jaeger(String type, int healthValue, int punchValue, int explodeValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.punchValue = punchValue;
        this.explodeValue = explodeValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getPunchValue() {
        return punchValue;
    }

    public int getExplodeValue() {
        return explodeValue;
    }

    public void punchAttack(Kaiju kaiju) {
        kaiju.takeDamageFromJaeger(this.punchValue);
    }

    public void explodeAttack(Kaiju kaiju) {
        kaiju.takeDamageFromJaeger(this.explodeValue);
    }

    public void takeDamageFromKaiju(int kaijuAttack) {
        this.healthValue -= kaijuAttack;
    }
}
