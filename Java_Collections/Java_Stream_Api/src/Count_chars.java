import java.util.Map;
import java.util.LinkedHashMap;

public class Count_chars {
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
    }
}
