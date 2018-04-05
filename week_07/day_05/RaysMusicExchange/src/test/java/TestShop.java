import Shop.Accessories.Sticks;
import Shop.Instruments.Drums;
import Shop.Instruments.Type;
import Shop.Shop;
import Shop.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestShop {
    Shop shop;
    Drums kit1;
    Sticks sticks1;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange");
        kit1 = new Drums("Reference", "Pearl", Type.PERCUSSION, 4, 4, 2500, 3000 );
        sticks1 = new Sticks("747 Wood Tip", "Promark", "Shira Kashi", 8, 10);
    }

    @Test
    public void shopHasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void shopHasProfit() {
        assertEquals(0, shop.getProfit(), 0.01);
    }

    @Test
    public void shopHasItems() {
        ArrayList<ISell> items = new ArrayList<>();
        assertEquals(items, shop.getItems());
    }

    @Test
    public void getStockCount() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddInstrumentItem() {
        shop.addToStock(kit1);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canAddAccessoryItem() {
        shop.addToStock(kit1);
        shop.addToStock(sticks1);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canSellItem() {
        shop.addToStock(kit1);
        assertEquals(1, shop.getStockCount());
        shop.sellItem(kit1);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void getPotentialProfit() {
        shop.addToStock(kit1);
        shop.addToStock(sticks1);
        assertEquals(502, shop.potentialProfit(), 0.01);
    }

}
