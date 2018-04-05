import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolarBearTest {
    PolarBear polarBear;

    @Before
    public void before() {
        polarBear  = new PolarBear("Montgomery");
    }

    @Test
    public void polarBearHasName() {
        assertEquals("Montgomery", polarBear.getName());
    }

    @Test
    public void polarBearCanEat() {
        assertEquals("OM NOM NOM", polarBear.eat());
    }

    @Test
    public void polarBearCanSleep() {
        assertEquals("Zzz", polarBear.sleep());
    }

    @Test
    public void polarBearCanGatherFood() {
        assertEquals("Gone fishing...", polarBear.gatherFood());
    }

    @Test
    public void polarBearCanHibernate() {
        assertEquals("Polar bears don't actually hibernate", polarBear.hibernate());
    }
}
