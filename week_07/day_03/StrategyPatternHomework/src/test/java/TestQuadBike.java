import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestQuadBike {
    QuadBike quadBike;

    @Before
    public void before() {
        quadBike  = new QuadBike(30, 400);
    }

    @Test
    public void quadBikeHasAverageSpeed() {
        assertEquals(30, quadBike.getAverageSpeed());
    }

    @Test
    public void quadBikeHasEngineCapacity() {
        assertEquals(400, quadBike.getEngineCapacity());
    }

    @Test
    public void quadBikeCanDriveDistance() {
        assertEquals(23, quadBike.driveDistance(690));
    }
}
