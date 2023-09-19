package LinkedList;

public class LinkedList {
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
}
