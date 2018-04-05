public class Printer implements IPeripheral, IPrint {

  private String make;
  private String model;

  public Printer(String make, String model) {
      this.make = make;
      this.model = model;
  }

    @Override
    public String connect() {
        return "connected";
    }

    @Override
    public String click() {
        return "hi";
    }

    @Override
    public String print(String data) {
        return "I am printing " + data;
    }
}
