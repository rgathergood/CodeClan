package ShoppingBasket;

import java.util.ArrayList;

public class Basket {
    private Customer customer;
    private ArrayList<Item> items;
    private double total;
    private int itemCount;

    public Basket(Customer customer) {
        this.customer = customer;
        items = new ArrayList<>();
        this.total = 0;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public boolean customerHasLoyaltyCard() {
        return customer.hasLoyaltyCard();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void emptyBasket() {
        items.clear();
    }

    public int basketItemCount() {
        for (Item item : items) {
            itemCount += item.getQuantity();
        }
        return itemCount;
    }

    public double basketTotalValue() {
        for(Item item : items ) {
            total += item.getPrice();
            if (item.getQuantity() % 2 == 0 ) {
                total -= item.getPrice() / 2;
            }
            if (total >= 20.01) {
                total -= (total * 0.1);
            }
            if (customer.hasLoyaltyCard()) {
                total -= (total * 0.02);
            }
        }
        return total;
    }
}
