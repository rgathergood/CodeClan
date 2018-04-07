import ShoppingBasket.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestItem {
    Item item1;

    @Before
    public void before() {
        item1 = new Item("Jacket", 19.99);
    }

    @Test
    public void canGetName() {
        assertEquals("Jacket", item1.getName());
    }

    @Test
    public void canGetPrice() {
        assertEquals(19.99, item1.getPrice(), 0.01);
    }
}
