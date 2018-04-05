import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {

    InternetRadio internetRadio;

    @Before
    public void before() {
        internetRadio = new InternetRadio();
    }

    @Test
    public void canConnect() {
        assertEquals("connecting to CodeClan network", internetRadio.connect("CodeClan"));
    }

    @Test
    public void canTuneToStation() {
        assertEquals("Tuned to CodeClan Radio", internetRadio.tune("CodeClan Radio"));
    }
}
