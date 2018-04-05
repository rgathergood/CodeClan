public class Delorean extends Vehicle implements IDriveable {
    private int fluxCapacitorCharge;

    public Delorean(int averageSpeed, int fluxCapacitorCharge) {
        super(averageSpeed);
        this.fluxCapacitorCharge = fluxCapacitorCharge;
    }

    public int getFluxCapacitorCharge() {
        return this.fluxCapacitorCharge;
    }

    @Override
    public int driveDistance(int distance) {
        return distance / this.averageSpeed;
    }
}
