import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination) {
        this.destination = destination;
        this.capacity = 4;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPerson(Person person) {
        this.passengers.add(person);
    }


    public boolean isUnderCapacity() {
        return this.passengerCount() < this.capacity;
    }

    public void addPersonIfUnderCapacity(Person person) {
        if (this.isUnderCapacity() ) {
            this.addPerson(person);
        }
    }

    public void removePerson(Person person) {
        this.passengers.remove(person);
    }
}
