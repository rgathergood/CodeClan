import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrizzlyBearTest {
    GrizzlyBear grizzlyBear;

    @Before
    public void before() {
        grizzlyBear = new GrizzlyBear("Yogi");
    }

    @Test
    public void grizzlyBearHasName() {
        assertEquals("Yogi", grizzlyBear.getName());
    }

    @Test
    public void grizzlyBearCanEat() {
        assertEquals("OM NOM NOM", grizzlyBear.eat());
    }

    @Test
    public void grizzlyBearCanSleep() {
        assertEquals("Zzz", grizzlyBear.sleep());
    }

    @Test
    public void grizzlyBearCanGatherFood() {
        assertEquals("Gathering food violently", grizzlyBear.gatherFood());
    }

    @Test
    public void grizzlyBearCanHibernate() {
        assertEquals("Time to sleep", grizzlyBear.hibernate());
    }
}
