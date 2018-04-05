package Shop.Accessories;

public class Book extends Accessories {
    private int pages;

    public Book(String item, String brand, int pages, double buyPrice, double sellPrice) {
        super(item, brand, buyPrice, sellPrice);
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }
}
