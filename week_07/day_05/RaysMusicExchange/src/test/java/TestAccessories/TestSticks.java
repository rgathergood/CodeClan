package TestAccessories;

import Shop.Accessories.Sticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSticks {
    Sticks sticks1;

    @Before
    public void before() {
        sticks1 = new Sticks("747 Wood Tip", "Promark", "Shira Kashi", 8, 10);
    }

    @Test
    public void sticksHasItem() {
        assertEquals("747 Wood Tip", sticks1.getItem());
    }

    @Test
    public void sticksHasBrand() {
        assertEquals("Promark", sticks1.getBrand());
    }

    @Test
    public void sticksHasWod() {
        assertEquals("Shira Kashi", sticks1.getWood());
    }

    @Test
    public void SticksHasBuyPrice() {
        assertEquals(8, sticks1.getBuyPrice(), 0.01);
    }

    @Test
    public void sticksHasSellPrice() {
        assertEquals(10, sticks1.getSellPrice(), 0.01);
    }

    @Test
    public void sticksMarkUp() {
        assertEquals(2, sticks1.getMarkUp(), 0.01);
    }
}
