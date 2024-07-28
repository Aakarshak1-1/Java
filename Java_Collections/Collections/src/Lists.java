import java.util.ArrayList;
import java.util.LinkedList;

class Array_Lists {
    ArrayList<Integer> list;

    ArrayList<Integer> create() {
        list = new ArrayList<>();
        return list;
    }

    void add(int element) {
        list.add(element);
    }

    int get(int index) {
        int element = list.get(index);
        return element;
    }

    void set(int index, int element) {
        list.set(index, element);
    }

    void delete(int index) {
        list.remove(index);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    void print() {
        System.out.println(list);
    }

    void print(int element) {
        System.out.println(element);
    }
}

class Linked_Lists {
    LinkedList<Integer> list;

    LinkedList<Integer> create() {
        list = new LinkedList<>();
        return list;
    }

    void add(int element) {
        list.add(element);
    }

    int get(int index) {
        int element = list.get(index);
        return element;
    }

    void set(int index, int element) {
        list.set(index, element);
    }

    void delete(int index) {
        list.remove(index);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    void print() {
        System.out.println(list);
    }

    void print(int element) {
        System.out.println(element);
    }
}

public class Lists {
    public static void main(String[] args) throws Exception {
        // 1. Array Lists
        /*
         * Created Own class and methods
         * 
         * Array_Lists list = new Array_Lists();
         * list.create();
         * list.add(0);
         * list.add(100);
         * list.add(10);
         * 
         * list.print();
         * list.print(list.get(1));
         * 
         * list.set(0, 1);
         * list.print();
         * 
         * list.delete(0);
         * list.print();
         * 
         */

        // 2. Linked Lists
        /*
         * Linked_Lists list = new Linked_Lists();
         * list.create();
         * list.add(0);
         * list.add(100);
         * list.add(10);
         * list.add(2);
         * list.print();
         * 
         * list.print(list.get(1));
         * 
         * list.set(0, 1);
         * list.print();
         * 
         * list.delete(0);
         * list.print();
         */
    }

}
