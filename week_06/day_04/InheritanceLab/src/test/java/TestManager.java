import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("David Brent", "JX6294729D", 60000, "Finance");
    }

    @Test
    public void managerHasName() {
        assertEquals("David Brent", manager.getName());
    }

    @Test
    public void managerHasNationalInsurance() {
        assertEquals("JX6294729D", manager.getNationalInsurance());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(60000, manager.getSalary(), 0.001);
    }

    @Test
    public void managerGetsRaise() {
        assertEquals(66000, manager.raiseSalary(1.1), 0.001);
    }

    @Test
    public void managerGetsBonus() {
        assertEquals(600, manager.payBonus(0.01), 0.001);
    }

    @Test
    public void getDeptName() {
        assertEquals("Finance", manager.getDeptName());
    }
}
