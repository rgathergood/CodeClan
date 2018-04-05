package Shop.Accessories;

public class Sticks extends Accessories {
    private String wood;

    public Sticks(String item, String brand, String wood, double buyPrice, double sellPrice) {
        super(item, brand, buyPrice, sellPrice);
        this.wood = wood;
    }

    public String getWood() {
        return this.wood;
    }
}
