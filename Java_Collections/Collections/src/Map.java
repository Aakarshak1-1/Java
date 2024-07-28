import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

class Hash_Map {
    HashMap<String, Integer> hash_map;

    HashMap<String, Integer> create() {
        hash_map = new HashMap<>();
        return hash_map;
    }

    void add(String str, int val) {
        hash_map.put(str, val);
    }

    void delete(String str) {
        hash_map.remove(str);
    }

    Set<String> keys() {
        return hash_map.keySet();
    }

    Collection<Integer> values() {
        return hash_map.values();
    }

    void print() {
        System.out.println(hash_map);
    }

    void print(Set<String> object) {
        System.out.println(object);
    }

    void print(Collection<Integer> object) {
        System.out.println(object);
    }

    @Override
    public String toString() {
        return hash_map.toString();
    }
}

class LinkedHash_Map {
    LinkedHashMap<String, Integer> lkd_hash_map = new LinkedHashMap<>();

    LinkedHashMap<String, Integer> create() {
        lkd_hash_map = new LinkedHashMap<>();
        return lkd_hash_map;
    }

    void add(String str, int val) {
        lkd_hash_map.put(str, val);
    }

    void delete(String str) {
        lkd_hash_map.remove(str);
    }

    Set<String> keys() {
        return lkd_hash_map.keySet();
    }

    Collection<Integer> values() {
        return lkd_hash_map.values();
    }

    void print() {
        System.out.println(lkd_hash_map);
    }

    void print(Set<String> object) {
        System.out.println(object);
    }

    void print(Collection<Integer> object) {
        System.out.println(object);
    }

    @Override
    public String toString() {
        return lkd_hash_map.toString();
    }
}

class Tree_Map {
    TreeMap<String, Integer> tree_map = new TreeMap<>();

    TreeMap<String, Integer> create() {
        tree_map = new TreeMap<>();
        return tree_map;
    }

    void add(String str, int val) {
        tree_map.put(str, val);
    }

    void delete(String str) {
        tree_map.remove(str);
    }

    Set<String> keys() {
        return tree_map.keySet();
    }

    Collection<Integer> values() {
        return tree_map.values();
    }

    void print() {
        System.out.println(tree_map);
    }

    void print(Set<String> object) {
        System.out.println(object);
    }

    void print(Collection<Integer> object) {
        System.out.println(object);
    }

    @Override
    public String toString() {
        return tree_map.toString();
    }
}

class Hash_Table {
    Hashtable<String, Integer> tree_map = new Hashtable<>();

    Hashtable<String, Integer> create() {
        tree_map = new Hashtable<>();
        return tree_map;
    }

    void add(String str, int val) {
        tree_map.put(str, val);
    }

    void delete(String str) {
        tree_map.remove(str);
    }

    Set<String> keys() {
        return tree_map.keySet();
    }

    Collection<Integer> values() {
        return tree_map.values();
    }

    void print() {
        System.out.println(tree_map);
    }

    void print(Set<String> object) {
        System.out.println(object);
    }

    void print(Collection<Integer> object) {
        System.out.println(object);
    }

    @Override
    public String toString() {
        return tree_map.toString();
    }
}

class Concurrent_HashMap {
    ConcurrentHashMap<String, Integer> hash_map;

    ConcurrentHashMap<String, Integer> create() {
        hash_map = new ConcurrentHashMap<>();
        return hash_map;
    }

    void add(String str, int val) {
        hash_map.put(str, val);
    }

    void delete(String str) {
        hash_map.remove(str);
    }

    Set<String> keys() {
        return hash_map.keySet();
    }

    Collection<Integer> values() {
        return hash_map.values();
    }

    void print() {
        System.out.println(hash_map);
    }

    void print(Set<String> object) {
        System.out.println(object);
    }

    void print(Collection<Integer> object) {
        System.out.println(object);
    }

    @Override
    public String toString() {
        return hash_map.toString();
    }
}

public class Map {
    public static void main(String[] args) {
        // 1. Hash_Map
        /*
         * Hash_Map hash_map = new Hash_Map();
         * hash_map.create();
         * hash_map.add("A", 1);
         * hash_map.add("B", 2);
         * hash_map.add("C", 3);
         * hash_map.add("D", 4);
         * hash_map.print();
         * 
         * hash_map.print(hash_map.keys());
         * 
         * hash_map.print(hash_map.values());
         */

        // 2. LinkedHash_Map
        /*
         * LinkedHash_Map lkd_hash_map = new LinkedHash_Map();
         * lkd_hash_map.create();
         * lkd_hash_map.add("A", 1);
         * lkd_hash_map.add("B", 2);
         * lkd_hash_map.add("C", 3);
         * lkd_hash_map.add("D", 4);
         * lkd_hash_map.print();
         * lkd_hash_map.add("D", 2);
         * lkd_hash_map.print();
         * 
         * lkd_hash_map.print(lkd_hash_map.keys());
         * 
         * lkd_hash_map.print(lkd_hash_map.values());
         */

        // 3. Tree Map
        // Stores Sorted element based on the keys
        /*
         * Tree_Map tree_map = new Tree_Map();
         * tree_map.create();
         * tree_map.add("C", 3);
         * tree_map.add("A", 1);
         * tree_map.add("B", 2);
         * tree_map.add("D", 4);
         * tree_map.print();
         * 
         * tree_map.print(tree_map.keys());
         * 
         * tree_map.print(tree_map.values());
         */

        // 4. Hashtable

        // Hash_Table hash_table = new Hash_Table();
        // hash_table.create();
        // hash_table.add("A", 1);
        // hash_table.add("B", 2);
        // hash_table.add("C", 3);
        // hash_table.add("D", 4);
        // hash_table.print();

        // hash_table.print(hash_table.keys());

        // hash_table.print(hash_table.values());

        // 5. COncurrent HashMap
        Concurrent_HashMap map = new Concurrent_HashMap();
        map.create();
        map.add("C", 3);
        map.add("A", 1);
        map.add("B", 2);
        map.add("D", 4);
        map.print();

        map.print(map.keys());

        map.delete("A");
        map.print(map.keys());
        
        map.print(map.values());

    }

}
