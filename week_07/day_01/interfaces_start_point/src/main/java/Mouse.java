public class Mouse implements IPeripheral {

    @Override
    public String connect() {
        return "connected to mouse";
    }

    @Override
    public String click() {
        return "click click";
    }
}
