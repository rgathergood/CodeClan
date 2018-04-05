package Rooms;

import Guest.Guest;
import Rooms.Room;

import java.util.ArrayList;

public interface ICheckIn {
    void checkInGuestToRoom(ArrayList<Guest> guests, String name);
}
