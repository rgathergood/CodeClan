package Rooms;

import Guest.Guest;

import java.util.ArrayList;

public abstract class EventRoom extends Room {
    private String name;
    private ArrayList<EventRoom> eventRooms;

    public EventRoom(String name, int capacity) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
