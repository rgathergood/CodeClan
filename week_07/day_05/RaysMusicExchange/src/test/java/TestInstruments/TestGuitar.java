package TestInstruments;

import Shop.Instruments.Guitar;
import Shop.Instruments.Type;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestGuitar {
    Guitar guitar1;

    @Before
    public void before() {
        guitar1 = new Guitar("Stratocaster", "Fender", Type.STRINGS, true, 700, 800);
    }

    @Test
    public void guitarHasModel() {
        assertEquals("Stratocaster", guitar1.getModel());
    }

    @Test
    public void guitarHasBrand() {
        assertEquals("Fender", guitar1.getBrand());
    }

    @Test
    public void guitarHasType() {
        assertEquals(Type.STRINGS, guitar1.getType());
    }

    @Test
    public void guitarIsElectric() {
        assertEquals(true, guitar1.getIsElectric());
    }

    @Test
    public void guitarHasBuyPrice() {
        assertEquals(700, guitar1.getBuyPrice(), 0.01);
    }

    @Test
    public void guitarHasSellPrice() {
        assertEquals(800, guitar1.getSellPrice(), 0.01);
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("TWANGY, TWANG, PLUCKEROO", guitar1.play());
    }

    @Test
    public void guitarMarkUp() {
        Assert.assertEquals(100, guitar1.getMarkUp(), 0.01);
    }
}
