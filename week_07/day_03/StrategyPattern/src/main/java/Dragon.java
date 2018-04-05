public class Dragon extends MythicalBeast implements IFly {
    public Dragon(String name) {
        super(name);
    }

    public String fly() {
        return "Standing up tall, beating wings, lift off!";
    }
}