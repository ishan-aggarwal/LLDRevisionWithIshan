package oop_2.additionalproblems.q1;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node(Node node) {
        this.data = node.data;
        if (node.next != null) {
//            this.next = new Node(node.next);
            this.next = node.next;
        }
    }

    public static void main(String[] args) {
        // Create original linked list: 1 -> 2 -> 3
        Node head = new Node(1);
        head.next = new Node(2);

        // Deep copy
        Node copiedHead = new Node(head);

        // Print both lists before modification
        System.out.println("Original list:");
        printList(head);

        System.out.println("Copied list:");
        printList(copiedHead);

        // Modify original list
        head.data = 10;
        head.next.data = 20;

        // Print both lists after modification
        System.out.println("\nAfter modifying original list:");
        System.out.println("Original list:");
        printList(head);

        System.out.println("Copied list (should remain unchanged):");
        printList(copiedHead);
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
