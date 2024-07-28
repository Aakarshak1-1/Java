import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// How to find only duplicate elements with its count from the String ArrayList in Java8?
public class Duplicatekeys {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C++");
        list.add("Java");
        list.add("C++");

        Map<Object, Long> hash_map = list.stream()
                .collect(Collectors.groupingBy(element -> element, Collectors.counting()));
        hash_map.entrySet().forEach(element -> {
            if (element.getValue() == 1) {
                System.out.println(element.getKey());
            }
        });
    }
}
