import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class List_task {
    public static void main(String[] args) {
        // Given a list of integers, sort all the values present in it using Stream
        // functions?
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 4, 3, 2, 1);
        System.out.println(list);
        List<Integer> res = list.stream().sorted().collect(Collectors.toList());
        System.out.println(res);
    }
}
