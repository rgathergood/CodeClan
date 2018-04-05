import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Dwight Schrute", "JX234569Z", 40000);
    }

    @Test
    public void developHasName() {
        assertEquals("Dwight Schrute", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNationalInsurance() {
        assertEquals("JX234569Z", databaseAdmin.getNationalInsurance());
    }

    @Test
    public void databaseAdminHasSalary() {
        assertEquals(40000, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void databaseAdminGetsRaise() {
        assertEquals(44000, databaseAdmin.raiseSalary(1.1), 0.001);
    }

    @Test
    public void databaseAdminGetsBonus() {
        assertEquals(400, databaseAdmin.payBonus(0.01), 0.001);
    }

}
