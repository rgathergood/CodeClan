package TestInstruments;

import Shop.Instruments.Keyboard;
import Shop.Instruments.Type;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestKeyboard {
    Keyboard keyboard1;

    @Before
    public void before() {
        keyboard1 = new Keyboard("FP-30", "Roland", Type.KEYS, "Wood", 600, 700);
    }

    @Test
    public void keyboardHasModel() {
        assertEquals("FP-30", keyboard1.getModel());
    }

    @Test
    public void keyboardHasBrand() {
        assertEquals("Roland", keyboard1.getBrand());
    }

    @Test
    public void keyboardHasType() {
        assertEquals(Type.KEYS, keyboard1.getType());
    }

    @Test
    public void keyboardHasMaterial() {
        assertEquals("Wood", keyboard1.getMaterial());
    }

    @Test
    public void keyboardHasBuyPrice() {
        assertEquals(600, keyboard1.getBuyPrice(), 0.01);
    }

    @Test
    public void keyboardHasSellPrice() {
        assertEquals(700, keyboard1.getSellPrice(), 0.01);
    }

    @Test
    public void canPlayKeyboard() {
        assertEquals("PLINKY PLONK", keyboard1.play());
    }

    @Test
    public void keyboardMarkUp() {
        assertEquals(100, keyboard1.getMarkUp(), 0.01);
    }
}
