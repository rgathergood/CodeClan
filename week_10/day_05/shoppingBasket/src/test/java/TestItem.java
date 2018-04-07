import ShoppingBasket.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestItem {
    private Item item1;

    @Before
    public void before() {
        item1 = new Item("Jacket", 19.99, 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Jacket", item1.getName());
    }

    @Test
    public void canGetPrice() {
        assertEquals(39.98, item1.getPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(2, item1.getQuantity());
    }

    @Test
    public void canReduceQuantity() {
        item1.reduceQuantity();
        assertEquals(1, item1.getQuantity());
    }
}
