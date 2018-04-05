public class DodgemCar extends Vehicle implements IDriveable {
    private int numberOfSeats;

    public DodgemCar(int averageSpeed, int numberOfSeats) {
        super(averageSpeed);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public int driveDistance(int distance) {
        return distance / this.averageSpeed;
    }
}
