public class PolarBear extends Bear {
    public PolarBear(String name) {
        super(name);
    }

    @Override
    public String gatherFood() {
      return "Gone fishing...";
    }

    @Override
    public String hibernate() {
        return "Polar bears don't actually hibernate";
    }
}
