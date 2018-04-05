import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;
    Salmon salmon;

    @Before
    public void before() {
        bear = new Bear("Montgommery");
        salmon = new Salmon();
    }

    @Test
    public void bellyStartsEmpty() {
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon() {
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleeping() {
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
        bear.sleep();
        assertEquals(0, bear.foodCount());
    }
}
