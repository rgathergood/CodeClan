import Jaeger.Mark1;
import Kaiju.Hakuja;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMark1 {
    Mark1 mark1;
    Hakuja hakuja;

    @Before
    public void before() {
        mark1 = new Mark1("Horizon Brave", 40, 10, 20);
        hakuja = new Hakuja("Hakuja", 50);
    }

    @Test
    public void mark1HasType() {
        assertEquals("Horizon Brave", mark1.getType());
    }

    @Test
    public void mark1HasHealthValue() {
        assertEquals(40, mark1.getHealthValue());
    }

    @Test
    public void mark1HasPunchValue() {
        assertEquals(10, mark1.getPunchValue());
    }

    @Test
    public void mark1HasExplodeValue() {
        assertEquals(20, mark1.getExplodeValue());
    }

    @Test
    public void punchAttack() {
        mark1.punchAttack(hakuja);
        assertEquals(40, hakuja.getHealthValue());
    }

    @Test
    public void explodeAttack() {
        mark1.explodeAttack(hakuja);
        assertEquals(30, hakuja.getHealthValue());
    }

    @Test
    public void takeDamageFromKaiju() {
        mark1.takeDamageFromKaiju(10);
        assertEquals(30, mark1.getHealthValue());
    }
}
