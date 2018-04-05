import Guest.Guest;
import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom room;

    @Before
    public void before() {
        room = new ConferenceRoom("Ada Lovelace Suite", 100, 1000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Ada Lovelace Suite", room.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, room.getCapacity());
    }

    @Test
    public void hasPricePerDay() {
        assertEquals(1000, room.getPrice(), 0.01);
    }

}
