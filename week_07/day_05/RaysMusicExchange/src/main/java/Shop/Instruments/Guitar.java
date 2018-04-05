package Shop.Instruments;

public class Guitar extends Instruments {
    private boolean electric;

    public Guitar(String model, String brand, Type type, boolean electric, double buyPrice, double sellPrice) {
        super(model, brand, type, buyPrice, sellPrice);
        this.electric = electric;
    }

    public boolean getIsElectric() {
        return this.electric;
    }
}
