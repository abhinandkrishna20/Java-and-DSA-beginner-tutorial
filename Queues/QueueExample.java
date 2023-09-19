package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Enqueuing elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Dequeuing and displaying elements
        while (!queue.isEmpty()) {
            int front = queue.poll();
            System.out.println("Dequeued: " + front);
        }
    }
}