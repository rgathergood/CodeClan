import Jaeger.Mark2;
import Kaiju.Hakuja;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHakuja {
    Hakuja hakuja;
    Mark2 mark2;

    @Before
    public void before() {
        hakuja = new Hakuja("Hakuja", 50);
        mark2 = new Mark2("Solar Prophet", 60, 20, 40);
    }

    @Test
    public void hakujaHasName() {
        assertEquals("Hakuja", hakuja.getName());
    }

    @Test
    public void hakujaHasHealthValue() {
        assertEquals(50, hakuja.getHealthValue());
    }

    @Test
    public void hakujaHasAttackValue() {
        assertEquals(30, hakuja.getAttackValue());
    }

    @Test
    public void hajukaHasRoar() {
        assertEquals("ROOOAARR!!!", hakuja.roar());
    }

    @Test
    public void hajukaCanMove() {
        assertEquals("The Kaiju tunnels towards Tokyo!", hakuja.move("tunnels"));
    }

    @Test
    public void canAttackJaeger() {
        hakuja.attack(mark2);
        assertEquals(30, mark2.getHealthValue());
    }

    @Test
    public void takeDamageFromJaeger() {
        hakuja.takeDamageFromJaeger(10);
        assertEquals(40, hakuja.getHealthValue());
    }
}
