
// How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

class Obj {
    String key;
    int value;

    Obj(String key, int value) {
        this.key = key;
        this.value = value;
    }

    String key() {
        return key;
    }

    int value() {
        return value;
    }
}

public class List_to_Map {
    public static void main(String[] args) {
        List<Obj> list = new ArrayList<>();
        list.add(new Obj("C", 3));
        list.add(new Obj("A", 1));
        list.add(new Obj("B", 2));
        list.add(new Obj("D", 4));

        Map<String, Integer> hash_map = list.stream().collect(Collectors.toMap(Obj::key, Obj::value));
        hash_map.entrySet().forEach(element -> System.out.println(element.getKey() + ": " + element.getValue()));

    }
}
