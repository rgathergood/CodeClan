package Shop.Instruments;

public enum Type {
    PERCUSSION ("BADUM TSS"),
    STRINGS ("TWANGY, TWANG, PLUCKEROO"),
    ELECTRONIC ("IH79IQYRHQB3F80WRGFGQY"),
    KEYS ("PLINKY PLONK");

    private String sound;

    Type(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

}
