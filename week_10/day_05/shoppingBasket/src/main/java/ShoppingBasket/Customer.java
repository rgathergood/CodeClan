package ShoppingBasket;

public class Customer {
    private String name;
    private boolean loyaltyCard;

    public Customer(String name, boolean loyaltyCard) {
        this.name = name;
        this.loyaltyCard = loyaltyCard;
    }

    public String getName() {
        return name;
    }

    public boolean hasLoyaltyCard() {
        return loyaltyCard;
    }
}
