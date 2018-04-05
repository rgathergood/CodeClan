package Shop.Accessories;

import Shop.ISell;

public abstract class Accessories implements ISell {
    private String item;
    private String brand;
    private double buyPrice;
    private double sellPrice;

    public Accessories(String item, String brand, double buyPrice, double sellPrice) {
        this.item = item;
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getItem() {
        return this.item;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double getMarkUp() {
        return sellPrice - buyPrice;
    }
}
