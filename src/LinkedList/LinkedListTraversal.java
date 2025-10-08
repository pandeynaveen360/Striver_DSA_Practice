package LinkedList;

public class LinkedListTraversal {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Method to add a new node at the end
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {  // if list is empty
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) { // move to last node
            temp = temp.next;
        }
        temp.next = newNode; // link new node at end
    }

    // Method to display the list
    public void display() {
        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListTraversal list = new LinkedListTraversal();

        // Adding elements to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Displaying the linked list
        System.out.println("Linked List elements:");
        list.display();
    }
}