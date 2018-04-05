import Jaeger.Mark1;
import Kaiju.Slattern;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSlattern {
    Slattern slattern;
    Mark1 mark1;

    @Before
    public void before() {
        slattern = new Slattern("Slattern", 70, 30);
        mark1 = new Mark1("Horizon Brave", 40, 10, 20);
    }

    @Test
    public void slatternHasName() {
        assertEquals("Slattern", slattern.getName());
    }

    @Test
    public void slatternHasHealthValue() {
        assertEquals(70, slattern.getHealthValue());
    }

    @Test
    public void slatternHasAttackValue() {
        assertEquals(30, slattern.getAttackValue());
    }

    @Test
    public void slatternHasRoar() {
        assertEquals("ROOOAARR!!!", slattern.roar());
    }

    @Test
    public void slatternCanMove() {
        assertEquals("The Kaiju flies towards Tokyo!", slattern.move("flies"));
    }

    @Test
    public void canAttackJaeger() {
        slattern.attack(mark1);
        assertEquals(10, mark1.getHealthValue());
    }

    @Test
    public void takeDamageFromJaeger() {
        slattern.takeDamageFromJaeger(10);
        assertEquals(60, slattern.getHealthValue());
    }
}
