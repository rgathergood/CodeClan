import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDriver {
    Driver driver;
    QuadBike quadBike;
    DodgemCar dodgemCar;
    Delorean delorean;

    @Before
    public void before() {
        quadBike  = new QuadBike(30, 400);
        driver = new Driver("Ryan", quadBike);
    }

    @Test
    public void driverHasName() {
        assertEquals("Ryan", driver.getName());
    }

    @Test
    public void driverHasVehicle() {
        assertEquals(quadBike, driver.getVehicle());
    }

    @Test
    public void canDriveDistance() {
        assertEquals(1, driver.driveDistance(1));
    }

    @Test
    public void canDriveQuadBike() {
        quadBike  = new QuadBike(30, 400);
        driver = new Driver("Ryan", quadBike);
        assertEquals(30, driver.driveDistance(30));
    }

    @Test
    public void canDriveDodgemCar() {
        dodgemCar = new DodgemCar(20, 4);
        driver = new Driver("Ryan", dodgemCar);
        assertEquals(40, driver.driveDistance(40));
    }

    @Test
    public void canSetVehicle() {
        quadBike  = new QuadBike(30, 400);
        driver.setVehicle(quadBike);
        assertEquals(quadBike, driver.getVehicle());
    }

    @Test
    public void canDriveDelorean() {
        delorean = new Delorean(88, 33);
        driver  = new Driver("Doc Brown", delorean);
        assertEquals(1885, driver.driveDistance(1885));
    }
}
