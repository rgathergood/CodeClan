import Guest.Guest;
import Rooms.Bedroom;
import Rooms.BedroomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom singleRoom;
    Bedroom doubleRoom;
    Bedroom twinRoom;

    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        singleRoom = new Bedroom(101, BedroomType.SINGLE, 25.00);
        doubleRoom = new Bedroom(102, BedroomType.DOUBLE, 50.00);
        twinRoom = new Bedroom(103, BedroomType.TWIN, 60.00);

        guest1 = new Guest("Ada Lovelace");
        guest2 = new Guest("Alan Turing");
    }

    //SINGLE ROOMS
    @Test
    public void singleRoomHasNumber() {
        assertEquals(101, singleRoom.getNumber());
    }

    @Test
    public void singleRoomHasRoomType() {
        assertEquals("Single", singleRoom.getType());
    }

    @Test
    public void singleRoomHasRoomPricePerNight() {
        assertEquals(25.00, singleRoom.getPrice(), 0.01);
    }

    @Test
    public void singleRoomHasCapacity() {
        assertEquals(1, singleRoom.getCapacity());
    }


    @Test
    public void singleRoomStartsVacant() {
        assertEquals(true, singleRoom.isVacant());
        assertEquals(false, singleRoom.isFull());
    }

    @Test
    public void singleRoomStartsEmpty() {
        assertEquals(0, singleRoom.numberOfGuests());
        assertEquals(false, singleRoom.isFull());
    }

    //DOUBLE ROOMS
    @Test
    public void doubleRoomHasNumber() {
        assertEquals(102, doubleRoom.getNumber());
    }

    @Test
    public void doubleRoomHasRoomType() {
        assertEquals("Double", doubleRoom.getType());
    }

    @Test
    public void doubleRoomHasRoomPricePerNight() {
        assertEquals(50.00, doubleRoom.getPrice(), 0.01);
    }

    @Test
    public void doubleRoomHasCapacity() {
        assertEquals(2, doubleRoom.getCapacity());
    }


    @Test
    public void doubleRoomStartsVacant() {
        assertEquals(true, doubleRoom.isVacant());
        assertEquals(false, doubleRoom.isFull());
    }

    @Test
    public void doubleRoomStartsEmpty() {
        assertEquals(0, doubleRoom.numberOfGuests());
        assertEquals(false, doubleRoom.isFull());
    }

    //TWIN ROOM
    @Test
    public void twinRoomHasNumber() {
        assertEquals(103, twinRoom.getNumber());
    }

    @Test
    public void twinRoomHasRoomType() {
        assertEquals("Twin", twinRoom.getType());
    }

    @Test
    public void twinRoomHasRoomPricePerNight() {
        assertEquals(60.00, twinRoom.getPrice(), 0.01);
    }

    @Test
    public void twinRoomHasCapacity() {
        assertEquals(2, twinRoom.getCapacity());
    }


    @Test
    public void twinRoomStartsVacant() {
        assertEquals(true, twinRoom.isVacant());
        assertEquals(false, twinRoom.isFull());
    }

    @Test
    public void twinRoomStartsEmpty() {
        assertEquals(0, twinRoom.numberOfGuests());
        assertEquals(false, twinRoom.isFull());
    }

    @Test
    public void cannotCheckInGuestIfRoomNotVacant() {
        ArrayList<Guest> guestList1 = new ArrayList<Guest>();
        guestList1.add(guest1);
        ArrayList<Guest> guestList2 = new ArrayList<Guest>();
        guestList2.add(guest2);
        doubleRoom.checkInGuests(guestList1);
        doubleRoom.checkInGuests(guestList2);
        assertEquals(1, doubleRoom.numberOfGuests());
        assertEquals(false, doubleRoom.isVacant());
        assertEquals(false, doubleRoom.isFull());
    }


}
