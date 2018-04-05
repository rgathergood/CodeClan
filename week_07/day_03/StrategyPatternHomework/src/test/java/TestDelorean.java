import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDelorean {
    Delorean delorean;

    @Before
    public void before() {
        delorean = new Delorean(88, 33);
    }

    @Test
    public void deloreanHasAverageSpeed() {
        assertEquals(88, delorean.getAverageSpeed());
    }

    @Test
    public void deloreanHasFluxCapacitorCharge() {
        assertEquals(33, delorean.getFluxCapacitorCharge());
    }

    @Test
    public void deloreanCanDriveDistance() {
        assertEquals(4, delorean.driveDistance(352));
    }
}
