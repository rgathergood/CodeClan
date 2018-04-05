import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Gareth Denham", "JX656829Q", 50000);
    }

    @Test
    public void developHasName() {
        assertEquals("Gareth Denham", developer.getName());
    }

    @Test
    public void developerHasNationalInsurance() {
        assertEquals("JX656829Q", developer.getNationalInsurance());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(50000, developer.getSalary(), 0.001);
    }

    @Test
    public void developerGetsRaise() {
        assertEquals(55000, developer.raiseSalary(1.1), 0.001);
    }

    @Test
    public void developerGetsBonus() {
        assertEquals(500, developer.payBonus(0.01), 0.001 );
    }

}
