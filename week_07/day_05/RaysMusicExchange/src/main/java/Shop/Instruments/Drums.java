package Shop.Instruments;

public class Drums extends Instruments {
    private int numberOfDrums;
    private int numberOfCymbals;

    public Drums(String model, String brand, Type type, int numberOfDrums, int numberOfCymbals, double buyPrice, double sellPrice) {
        super(model, brand, type, buyPrice, sellPrice);
        this.numberOfDrums = numberOfDrums;
        this.numberOfCymbals = numberOfCymbals;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public int getNumberOfCymbals() {
        return numberOfCymbals;
    }
}

