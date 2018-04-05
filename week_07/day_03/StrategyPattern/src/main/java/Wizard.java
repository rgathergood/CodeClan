public class Wizard {
    String name;
    IFly ride;

    public Wizard(String name, IFly ride) {
        this.name = name;
        this.ride = ride;
    }

    public String getName() {
        return this.name;
    }

    public IFly getRide() {
        return this.ride;
    }

    public String fly() {
        return this.ride.fly();
    }

    public void setRide(IFly ride) {
        this.ride = ride;
    }
}