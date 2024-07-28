import java.util.PriorityQueue;

class Priority_Queue {
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    PriorityQueue<Integer> create() {
        queue = new PriorityQueue<>();
        return queue;
    }

    void add(int element) {
        queue.add(element);
    }

    void delete(int element) {
        queue.remove(element);
    }

    void print() {
        System.out.println(queue);
    }

    int remove_head() {
        return queue.poll();
    }

    int show_head() {
        return queue.peek();
    }
}

public class Queue {
    public static void main(String[] args) {
        Priority_Queue queue = new Priority_Queue();
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(4);
        queue.print();
        int elem = queue.remove_head();
        System.out.println(elem);
        queue.print();
    }
}
