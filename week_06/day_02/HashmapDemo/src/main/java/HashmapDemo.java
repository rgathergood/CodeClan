import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap<>();

        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");

//        favouriteFruits.values();
//        favouriteFruits.keySet();
//        favouriteFruits.size(); no. of key values
//        favouriteFruits.clear(); empties hashmap
//        favouriteFruits.containsKey("Bob); boolean returns true
//        favouriteFruits.containsValue("Strawberry");
//        favouriteFruits.remove("Bob") removes

        System.out.println(favouriteFruits.get("Alice"));
    }
}
