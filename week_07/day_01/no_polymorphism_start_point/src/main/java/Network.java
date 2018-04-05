import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int items;

    public Network(String name) {
        this.devices = new ArrayList<>();
        this.name = name;
        this.items = 5;
    }

    public String getName() {
        return name;
    }

    public int deviceCount() {
        return devices.size();
    }

    public void connect(IConnect device) {
        if (checkFreeSlots() > 0)
            devices.add(device);
    }

    public void disconnectAll() {
        devices.clear();
    }

    public int itemCapacity() {
        return this.items;
    }

    public int checkFreeSlots() {
        return this.items - this.devices.size();
    }
}