package Hotel;

import Guest.Guest;
import Rooms.*;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private DiningRoom diningRoom;
    private ConferenceRoom conferenceRoom;
    private ArrayList<EventRoom> eventRooms;

    public Hotel(String name) {
        this.name = name;
        eventRooms = new ArrayList<>();
        bedrooms = new ArrayList<Bedroom>();
    }

    public String getName() {
        return name;
    }

    public void addEventRoom(EventRoom eventRoom) {
        eventRooms.add(eventRoom);
    }

    public ArrayList<Bedroom> getBedrooms() {
        return new ArrayList<Bedroom>(bedrooms);
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public ConferenceRoom getConferenceRoom() {
        return this.conferenceRoom;
    }

    public ArrayList<EventRoom> getEventRooms() {
        return this.eventRooms;
    }

    public void setConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }

    public void checkInGuestToRoom(ArrayList<Guest> guests, String name) {
        for(EventRoom room: eventRooms) {
            if(room.getName().equals(name)) {
                room.checkInGuests(guests);
                return;
            }
        }
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public ArrayList<Guest> getGuestsCheckedIntoBedroom(int number) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                return room.getGuests();
            }
        }
        return new ArrayList<Guest>();
    }

    public void checkGuestsIntoBedroom(int number, ArrayList<Guest> guestList) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                room.checkInGuests(guestList);
                return;
            }
        }
    }

    public void checkGuestsOutOfBedroom(int number) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                room.checkOut();
                return;
            }
        }
    }
}
