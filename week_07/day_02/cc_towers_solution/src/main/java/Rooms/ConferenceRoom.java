package Rooms;

public class ConferenceRoom extends EventRoom implements IPrice{
    private double price;

    public ConferenceRoom(String name, int capacity, double price) {
        super(name, capacity);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

}
