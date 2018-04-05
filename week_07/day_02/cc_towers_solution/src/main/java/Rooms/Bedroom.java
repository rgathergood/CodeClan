package Rooms;

public class Bedroom extends Room implements IPrice {
    private int number;
    private BedroomType type;
    private double price;

    public Bedroom(int number, BedroomType type, double price) {
        super(type.getCapacity());
        this.type = type;
        this.number = number;
        this.price = price;
    }

    public int getNumber() {
        return this.number;
    }

    public String getType() {
        return this.type.getType();
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
