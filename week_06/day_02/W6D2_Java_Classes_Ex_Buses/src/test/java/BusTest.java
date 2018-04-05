import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before() {
        bus = new Bus("Leith");
        person = new Person();
    }

    @Test
    public void busHasDestination() {
        assertEquals("Leith", bus.getDestination());
    }

    @Test
    public void canGetNumberOfPassengers() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPerson(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void checkBusUnderCapacity() {
        assertTrue(bus.isUnderCapacity());
    }

    @Test
    public void checkBusAtCapacity() {
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        assertFalse(bus.isUnderCapacity());
    }

    @Test
    public  void canAddPersonIfUnderCapacity() {
        bus.addPersonIfUnderCapacity(person);
        assertEquals(1, bus.passengerCount());

    }

    @Test
    public void cannotAddPersonIfAtCapacity(){
        bus.addPersonIfUnderCapacity(person);
        bus.addPersonIfUnderCapacity(person);
        bus.addPersonIfUnderCapacity(person);
        bus.addPersonIfUnderCapacity(person);
        bus.addPersonIfUnderCapacity(person);
        assertEquals(4, bus.passengerCount());
    }

    @Test
    public void canRemovePerson() {
        bus.addPersonIfUnderCapacity(person);
        bus.removePerson(person);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void
}
