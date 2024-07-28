import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Hash_set {
    HashSet<String> set = new HashSet<>();

    HashSet<String> create() {
        set = new HashSet<>();
        return set;
    }

    void add(String str) {
        set.add(str);
    }

    void delete(String str) {
        set.add(str);
    }

    boolean check(String str) {
        return set.contains(str);
    }

    void print() {
        System.out.println(set);
    }

    void print(boolean check) {
        System.out.println(check);
    }
}

class Tree_set {
    TreeSet<String> set = new TreeSet<>();

    TreeSet<String> create() {
        set = new TreeSet<>();
        return set;
    }

    void add(String str) {
        set.add(str);
    }

    void delete(String str) {
        set.remove(str);
    }

    boolean check(String str) {
        return set.contains(str);
    }

    void print() {
        System.out.println(set);
    }

    void print(boolean check) {
        System.out.println(check);
    }
}

class LinkedHash_set {
    LinkedHashSet<String> set = new LinkedHashSet<>();

    LinkedHashSet<String> create() {
        set = new LinkedHashSet<>();
        return set;
    }

    void add(String str) {
        set.add(str);
    }

    void delete(String str) {
        set.remove(str);
    }

    boolean check(String str) {
        return set.contains(str);
    }

    void print() {
        System.out.println(set);
    }

    void print(boolean check) {
        System.out.println(check);
    }
}

public class Sets {
    public static void main(String[] args) {
        // Hash_set set = new Hash_set();
        // set.create();
        // set.add("C");
        // set.add("A");
        // set.add("B");
        // set.add("D");
        // set.print();

        // set.check("A");
        // set.print(set.check("A"));

        // Tree_set set = new Tree_set();
        // set.create();
        // set.add("C");
        // set.add("A");
        // set.add("B");
        // set.add("D");
        // set.print();

        // set.print(set.check("A"));

        // set.delete("B");
        // set.print();

        LinkedHash_set set = new LinkedHash_set();
        set.create();
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("D");
        set.print();

        set.print(set.check("A"));

        set.delete("B");
        set.print();
    }
}
