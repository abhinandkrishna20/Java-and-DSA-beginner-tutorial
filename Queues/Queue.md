
# Queues in Programming

## What is a Queue?

- A queue is a linear data structure that follows the First-In-First-Out (FIFO) principle.
- In a queue, elements are added at one end (rear) and removed from the other end (front).
- Queues are often used for tasks where the order of processing is important, such as managing tasks in a printer queue or handling requests in a web server.

## Basic Queue Operations

1. **Enqueue (or Push)**: Adding an element to the rear of the queue.

2. **Dequeue (or Pop)**: Removing and returning the element from the front of the queue.

3. **Peek (or Front)**: Viewing the element at the front of the queue without removing it.

4. **isEmpty**: Checking if the queue is empty.

5. **Size**: Counting the number of elements in the queue.

## Sample Queue Program in Java

```java
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
```

This Java program demonstrates the use of a queue using the `java.util.Queue` interface, implemented by `java.util.LinkedList`. It enqueues elements, then dequeues and displays them.

**Output**:
```
Dequeued: 10
Dequeued: 20
Dequeued: 30
```

Feel free to modify this program or explore more advanced queue operations and applications to deepen your understanding.
```

You can save this content in a `.md` file, for example, `queues.md`, and it will render correctly as a Markdown document when viewed in a Markdown-compatible editor or GitHub repository.