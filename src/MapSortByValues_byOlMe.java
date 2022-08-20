import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

 /*
        Write a method that can sort the map by values
     */

public class MapSortByValues_byOlMe {


    public static void main(String[] args) {

        Map<String, Integer> map;
        map = Map.of("Math", 98, "Data Structure", 85, "Database", 91, "Java", 95,
                "Operating System", 79, "Networking", 80, "Something", 80);
        System.out.println("There was a map \n"+map+
                "\nI sorted this map by value \n" + sortByValue(map));
    }
    private static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        Map<String, Integer> result = new LinkedHashMap<>();

        (new TreeSet<>(map.values())).forEach(eachSortedValue -> {

            map.forEach((k, v) -> {
                if (v.equals(eachSortedValue)) {
                    result.put(k, v);

                }
            });
        });
        return result;
    }
}
