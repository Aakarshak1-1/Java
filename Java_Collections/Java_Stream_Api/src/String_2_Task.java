import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Given a String, find the first repeated character in it using Stream functions?
public class String_2_Task {
    public static void main(String[] args) {
        String name = "Aakarshak";
        Map<String, Integer> map = new LinkedHashMap<>();
        name.chars().forEach(element -> {
            String key = "" + (char) element;
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        });
        System.out.println(map);

        ArrayList<String> res = map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Non-repeated First Character in String is: " + res.get(0));
    }
}
