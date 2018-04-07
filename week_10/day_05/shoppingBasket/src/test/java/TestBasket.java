import ShoppingBasket.Basket;
import ShoppingBasket.Customer;
import ShoppingBasket.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBasket {
    Basket basket;
    Customer customer1;
    Item item1;
    Item item2;

    @Before
    public void before(){
        customer1 = new Customer("Gary");
        basket = new Basket(customer1);
        item1 = new Item("Jacket", 19.99);
        item2 = new Item("Jeans", 39.99);
    }

    @Test
    public void basketHasCustomer() {
    assertEquals("Gary", basket.getCustomerName());
    }

    @Test
    public void canAddItem() {
        basket.addItem(item1);
        assertEquals(1, basket.basketItemCount());
    }

    @Test
    public void canRemoveItem() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.removeItem(item1);
        assertEquals(1, basket.basketItemCount());
    }

    @Test
    public void canEmptyBasket() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.emptyBasket();
        assertEquals(0, basket.basketItemCount());
    }

    @Test
    public void canGetTotal0() {
        assertEquals(0, basket.basketTotalValue(), 0.01);
    }

    @Test
    public void canGetTotal() {
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(59.98, basket.basketTotalValue(), 0.01);
    }

    @Test
    public void canGetTotalRemove() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.removeItem(item1);
        assertEquals(39.99, basket.basketTotalValue(), 0.01);
    }
}
