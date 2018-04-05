package TestAccessories;

import Shop.Accessories.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStrings {
    Strings strings;

    @Before
    public void before() {
        strings = new Strings("Slinky Classics", "Ernie Ball", 4, 6);
    }

    @Test
    public void stringsHasItem() {
        assertEquals("Slinky Classics", strings.getItem());
    }

    @Test
    public void stringsHasBrand() {
        assertEquals("Ernie Ball", strings.getBrand());
    }

    @Test
    public void stringsHasBuyPrice() {
        assertEquals(4, strings.getBuyPrice(), 0.01);
    }

    @Test
    public void stringsHasSellPrice() {
        assertEquals(6, strings.getSellPrice(), 0.01);
    }

    @Test
    public void stringsMarkUp() {
        assertEquals(2, strings.getMarkUp(), 0.01);
    }
}
