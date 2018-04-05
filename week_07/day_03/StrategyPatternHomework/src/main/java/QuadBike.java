public class QuadBike extends Vehicle implements IDriveable {
    private int engineCapacity;

    public QuadBike(int averageSpeed, int engineCapacity) {
        super(averageSpeed);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return this.engineCapacity;
    }

    @Override
    public int driveDistance(int distance) {
        return distance / this.averageSpeed;
    }
}
