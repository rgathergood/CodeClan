package TestAccessories;

import Shop.Accessories.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {
    Book book1;

    @Before
    public void before() {
        book1 = new Book("Alfred's Piano for Adults", "William A Palmer", 83, 10, 14 );
    }

    @Test
    public void bookHasItem() {
        assertEquals("Alfred's Piano for Adults", book1.getItem());
    }

    @Test
    public void bookHasBrand() {
        assertEquals("William A Palmer", book1.getBrand());
    }

    @Test
    public void bookHasPages() {
        assertEquals(83, book1.getPages());
    }

    @Test
    public void bookHasBuyPrice() {
        assertEquals(10, book1.getBuyPrice(), 0.01);
    }

    @Test
    public void bookHasSellPrice() {
        assertEquals(14, book1.getSellPrice(), 0.01);
    }

    @Test
    public void bookMarkUp() {
        assertEquals(4, book1.getMarkUp(), 0.01);
    }
}
