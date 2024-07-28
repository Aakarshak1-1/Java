import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dummy {
    public static void main(String[] args) {
        // ----------------------------------------
        // Create a Dummy List, Map and Set for stream
        // ----------------------------------------

        // List
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().filter(element -> element % 2 == 0).forEach(element -> System.out.print(element + ","));
        System.out.println();

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        map.entrySet().stream().filter(element -> element.getValue() % 2 == 0)
                .forEach(element -> System.out.println(element));

        // Set
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set,1,2,2,2,3,4,5);
        System.out.print(set);

        

    }
}
