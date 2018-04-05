import java.util.HashMap;

public class CountryPopulations {
    public static void main(String[] args) {
        HashMap<String, Integer> countryPopulations = new HashMap<>();

        countryPopulations.put("UK", 64100000);
        countryPopulations.put("Germany", 80620000);
        countryPopulations.put("France", 66030000);
        countryPopulations.put("Japan", 127300000);

        System.out.println(("Population of the UK is " + countryPopulations.get("UK")));
        System.out.println(countryPopulations.values());
        System.out.println(countryPopulations.keySet());

    }

}
