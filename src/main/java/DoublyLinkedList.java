/**
 * Created by anujparikh on 11/9/16.
 */
public class DoublyLinkedList {

    Node head;

    public static class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    public void printList() {
        Node n = this.head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }

        Node oldFirstNode = this.head;
        oldFirstNode.previous = newNode;
        newNode.previous = null;
        newNode.next = oldFirstNode;
        this.head = newNode;
    }

    public void insertAfter(Node prevNode, int data) {

        if (prevNode == null) {
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.previous = prevNode;
        newNode.next.previous = newNode;
    }

    public void insertBefore(Node nextNode, int data) {

        if (nextNode == null) {
            return;
        }

        Node newNode = new Node(data);
        newNode.previous = nextNode.previous;
        nextNode.previous.next = newNode;
        newNode.next = nextNode;
        nextNode.previous = newNode;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        Node n = this.head;
        while (n.next != null) {
            n = n.next;
        }
        newNode.previous = n.next;
        n.next = newNode;
    }
}
