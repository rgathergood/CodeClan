public class GrizzlyBear extends Bear {
    public GrizzlyBear(String name) {
        super(name);
    }

    @Override
    public String gatherFood() {
        return "Gathering food violently";
    }

    @Override
    public String hibernate() {
        return "Time to sleep";
    }
}
