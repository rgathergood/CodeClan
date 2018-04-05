package Shop;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> items;
    private double profit;

    public Shop(String name) {
        this.name = name;
        this.profit = 0;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getProfit() {
        return profit;
    }

    public ArrayList<ISell> getItems() {
        return items;
    }

    public void addToStock(ISell item) {
        this.items.add(item);
    }

    public int getStockCount() {
        return this.items.size();
    }

    public void sellItem(ISell item) {
        this.items.remove(item);
    }

    public double potentialProfit() {
        for (ISell item : items) {
            this.profit += item.getMarkUp();
        }
        return this.profit;
    }
}
