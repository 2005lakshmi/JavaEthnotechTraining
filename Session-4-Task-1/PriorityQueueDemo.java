import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.add(4);

        System.out.println("Priority Queue: " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Executing Task: " + pq.poll());
        }
    }
}