import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Desktop desktop;
    InternetRadio internetRadio;

    @Before
    public void before() {
        network = new Network("CodeClan");
        desktop = new Desktop("Keith's Desktop", "Apple", "Macbook Pro");
        internetRadio = new InternetRadio();

    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(desktop);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void returnItemCapacity() {
        assertEquals(5, network.itemCapacity());
    }

    @Test
    public void networkHasFreeSlots() {
        network.connect(desktop);
        network.connect(internetRadio);
        assertEquals(3, network.checkFreeSlots());
    }
}
