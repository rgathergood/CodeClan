package Shop.Instruments;

public class Keyboard extends Instruments {
    private String material;

    public Keyboard(String model, String brand, Type type, String material, double buyPrice, double sellPrice) {
        super(model, brand, type, buyPrice, sellPrice);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
