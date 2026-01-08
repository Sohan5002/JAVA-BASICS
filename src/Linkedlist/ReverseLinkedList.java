package Linkedlist;

import java.util.Scanner;

public class ReverseLinkedList {
    
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Function to insert at the end
    public void insertAtEnd(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    // Recursive function to print linked list in reverse
    public void reverseDisplay(Node temp) {
        if (temp == null) return; // Base condition
        reverseDisplay(temp.next); // Recursive call for next node
        System.out.print(temp.data + " "); // Print after recursion
    }

    // Function to print normally
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseLinkedList list = new ReverseLinkedList();

        System.out.println("Enter number of elements:");
        int size = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            list.insertAtEnd(data);
        }

        System.out.println("Linked List before reversing:");
        list.display();

        System.out.println("Linked List after reverse display:");
        list.reverseDisplay(list.head); // Pass head for recursion
        System.out.println();

        sc.close();
    }
}
