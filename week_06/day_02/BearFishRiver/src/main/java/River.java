import java.util.ArrayList;

public class River {
    private ArrayList<Salmon> fishes;

    public River() {
        fishes = new ArrayList<>();
    }

    public void addFish(Salmon salmon) {
        fishes.add(salmon);
    }

    public int fishCount() {
        return fishes.size();
    }

    public Salmon removeFish() {
        return fishes.remove(0);
    }
}
