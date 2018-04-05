import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {
    Director director;

    @Before
    public void before() {
        director = new Director("Elon Musk", "JX1001010Q", 100000, "Leadership", 250000);
    }

    @Test
    public void directorHasName() {
        assertEquals("Elon Musk", director.getName());
    }

    @Test
    public void directorHasNationalInsurance() {
        assertEquals("JX1001010Q", director.getNationalInsurance());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(100000, director.getSalary(), 0.001);
    }

    @Test
    public void directorGetsRaise() {
        assertEquals(110000, director.raiseSalary(1.1), 0.001);
    }

    @Test
    public void directorGetsBonus() {
        assertEquals(1000, director.payBonus(0.01), 0.001);
    }

    @Test
    public void getDeptName() {
        assertEquals("Leadership", director.getDeptName());
    }

    @Test
    public void getBudget() {
        assertEquals(250000, director.getBudget(), 0.001);
    }
}
