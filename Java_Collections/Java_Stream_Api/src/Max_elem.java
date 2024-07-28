import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Write a Program to find the Maximum element in an array?
public class Max_elem {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 2, 3, 4, 5, 6, 78, 9, 10);
        int max = arr.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println(max);
    }
}