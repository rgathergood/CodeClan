import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before() {
        this.bear = new Bear("Baloo", 25, 95.62);
    }

    @Test
    public void hasName() {
//        Bear bear = new Bear("Baloo", 25);
        String name = this.bear.getName();
        assertEquals("Baloo", name);
    }

    @Test
    public void hasAge() {
//        Bear bear = new Bear("Baloo", 25);
        int age = this.bear.getAge();
        assertEquals(25, age);
    }

    @Test
    public void hasWeight() {
        double weight = this.bear.getWeight();
        assertEquals(95.62, weight, 0.01);
    }

    @Test
    public void readyToHibernateIfGreaterThan80() {
        boolean ready = bear.readyToHibernate();
        assertEquals(true, ready);
    }

    @Test
    public void notReadyToHibernateIfLessThan80() {
        Bear notReadyBear = new Bear ("Baloo", 25, 60.00);
        boolean isReady = notReadyBear.readyToHibernate();
        assertEquals(false, isReady);
    }
}
