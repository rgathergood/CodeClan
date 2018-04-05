public class Driver implements IDriveable {
    private String name;
    private IDriveable vehicle;

    public Driver(String name, IDriveable vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    @Override
    public int driveDistance(int distance) {
        return distance;
    }

    public String getName() {
        return name;
    }

    public IDriveable getVehicle() {
        return vehicle;
    }

    public void setVehicle(IDriveable vehicle) {
        this.vehicle = vehicle;
    }
}
