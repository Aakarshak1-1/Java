import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

// How to count each element/word from the String ArrayList in Java8?
public class Count {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");
        list.add("C++");

        Map<String, Long> hash_map = list.stream()
                .collect(Collectors.groupingBy(element -> element, Collectors.counting()));
        hash_map.entrySet().forEach(element -> System.out.println(element.getKey() + ": " + element.getValue()));
    }
}
