public class MagicCarpet extends Carpet implements IFly {
    public MagicCarpet(String colour) {
        super(colour);
    }

    public String fly() {
        return "Hovering up, straightening out, flying off!";
    }
}