# Linked Lists in Programming

## What is a Linked List?

- A linked list is a linear data structure used to store a collection of elements.
- Unlike arrays, linked lists don't have a fixed size, and elements are not stored in contiguous memory locations.
- A linked list consists of nodes, where each node contains data and a reference (link) to the next node in the list.

## Types of Linked Lists

1. **Singly Linked List**: Each node points to the next node in the list, forming a unidirectional sequence.

2. **Doubly Linked List**: Each node has references to both the next and the previous nodes, allowing bidirectional traversal.

3. **Circular Linked List**: The last node in the list points back to the first node, forming a closed loop.

## Basic Linked List Operations

1. **Insertion**: Adding a new node to the linked list.
   - Insertion at the beginning.
   - Insertion at the end.
   - Insertion at a specific position.
   
2. **Deletion**: Removing a node from the linked list.
   - Deletion at the beginning.
   - Deletion at the end.
   - Deletion of a specific node.
   
3. **Traversal**: Visiting each node in the linked list to access or manipulate data.

4. **Searching**: Finding a specific node based on its data.

5. **Length**: Counting the number of nodes in the linked list.

## Sample Linked List Program in Java

```java
public class LinkedListExample {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Creating a singly linked list
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        // Traversing the linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
