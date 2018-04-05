package TestInstruments;

import Shop.Instruments.Drums;
import Shop.Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrums {
    Drums kit1;

    @Before
    public void before() {
        kit1 = new Drums("Reference", "Pearl", Type.PERCUSSION, 4, 4, 2500, 3000 );
    }

    @Test
    public void kitHasModel() {
        assertEquals("Reference", kit1.getModel());
    }

    @Test
    public void kitHasBrand() {
        assertEquals("Pearl", kit1.getBrand());
    }

    @Test
    public void kitHasType() {
        assertEquals(Type.PERCUSSION, kit1.getType());
    }

    @Test
    public void kitHasNumberOfDrums() {
        assertEquals(4, kit1.getNumberOfDrums());
    }

    @Test
    public void kitHasNumberOfCymbals() {
        assertEquals(4, kit1.getNumberOfCymbals());
    }

    @Test
    public void kitHasBuyPrice() {
        assertEquals(2500, kit1.getBuyPrice(), 0.01);
    }

    @Test
    public void kitHasSellPrice() {
        assertEquals(3000, kit1.getSellPrice(), 0.01);
    }

    @Test
    public void canPlayDrums() {
        assertEquals("BADUM TSS", kit1.play());
    }

    @Test
    public void drumsMarkUp() {
        assertEquals(500, kit1.getMarkUp(), 0.01);
    }
}
