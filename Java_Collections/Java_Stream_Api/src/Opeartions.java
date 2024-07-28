import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Opeartions {
    public static void main(String[] args) throws Exception {
        // Immediate Operations:-
        // 1. Map
        // 2. Filter
        // 3. Sorted

        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 22, 33, 4, 5, 6, 7);
        System.out.println(arr);

        // ----------------------------------------
        // Implement all methods of Stream API {GFG}
        // ----------------------------------------

        arr.stream().filter(element -> element % 2 == 0).forEach(System.out::println);// Even Numbers

        // Terminal Operations:-
        // 1. Reduce
        // 2. Collect
        // 3. For Each
        String result = arr.stream()
                .map(Object::toString) // Convert integers to strings
                .collect(Collectors.joining(", "));
        System.out.println(result);

        int even = arr.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans +
                i);
        System.out.println(even);

    }
}
