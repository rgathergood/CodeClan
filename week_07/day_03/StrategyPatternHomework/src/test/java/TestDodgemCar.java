import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDodgemCar {
    DodgemCar dodgemCar;

    @Before
    public void before() {
        dodgemCar = new DodgemCar(20, 4);
    }

    @Test
    public void dodgemCarHasAverageSpeed() {
        assertEquals(20, dodgemCar.getAverageSpeed());
    }

    @Test
    public void dodgemCarHasNumberOfSeats() {
        assertEquals(4, dodgemCar.getNumberOfSeats());
    }

    @Test
    public void dodgemCarCanDriveDistance() {
        assertEquals(23, dodgemCar.driveDistance(460));
    }
}
