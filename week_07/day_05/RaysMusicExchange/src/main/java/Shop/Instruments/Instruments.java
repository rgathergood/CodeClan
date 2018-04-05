package Shop.Instruments;

import Shop.ISell;

public abstract class Instruments implements IPlay, ISell{
    private String model;
    private String brand;
    private Type type;
    private double buyPrice;
    private double sellPrice;

    public Instruments(String model, String brand, Type type, double buyPrice, double sellPrice) {
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public Type getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String play() {
        return this.type.getSound();
    }

    public double getMarkUp() {
        return sellPrice - buyPrice;
    }
}
