import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusStopTest {

    Bus bus;
    BusStop busStop;
    Person person;

    @Before
    public void before() {
        busStop = new BusStop("Leith Walk");
        bus = new Bus("Leith");
        person = new Person();
    }

    @Test
    public void canGetPersonCount() {
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue(person);
        assertEquals(0, busStop.queueCount());

    }

    @Test
    public void canPickUpPersonFromQueue() {

    }

}
