public abstract class Bear {
    private String name;

    public Bear(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String eat() {
        return "OM NOM NOM";
    }

    public String sleep() {
        return "Zzz";
    }

    public abstract String gatherFood();

    public abstract String hibernate();
}
