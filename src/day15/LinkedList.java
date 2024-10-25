package src.day15;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return head;
    }

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        System.out.print("Enter the number of elements: ");
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int data = sc.nextInt();
            head = insert(head, data);
        }

        display(head);
        sc.close();
    }
}

/* it creates a new Node (pass data as the Node constructor argument) and inserts it at the tail of the
linked list referenced by the  head parameter. Once the new node is added, return the reference to the  head node.

Note: The head argument is null for an empty list. */