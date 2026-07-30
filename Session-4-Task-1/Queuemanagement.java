import java.util.LinkedList;
import java.util.Queue;

public class QueueManagement {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Rahul");
        queue.add("Anu");
        queue.add("Kiran");
        queue.add("Priya");

        System.out.println("Queue: " + queue);

        System.out.println("Next Customer: " + queue.peek());

        System.out.println("Served Customer: " + queue.poll());

        System.out.println("Remaining Queue: " + queue);
    }
}