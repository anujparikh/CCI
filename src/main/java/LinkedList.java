public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAfter(Node prevNode, int data) {
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        }

        Node n = this.head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = newNode;
    }

    public void printList() {
        Node n = this.head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
}
