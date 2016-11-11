/**
 * Created by anujparikh on 11/10/16.
 */
public class CircularLinkedList {
    Node first;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList() {
        Node n = this.first;
        do {
            System.out.println(n.data + " ");
            n = n.next;
        } while (n != this.first);
    }

    public void sortedInsert(int data) {
        Node newNode = new Node(data);
        if (this.first == null) {
            this.first = newNode;
            newNode.next = this.first;
            return;
        }
        Node n = this.first;
        while (n.next.data < newNode.data && n.next != first) {
            n = n.next;
        }
        if (n == this.first) {
            while (n.next != this.first) {
                n = n.next;
            }
            n.next = newNode;
            newNode.next = this.first;
            this.first = newNode;
            return;
        }
        if (n.next == this.first) {
            newNode.next = this.first;
            n.next = newNode;
            return;
        }
        newNode.next = n.next;
        n.next = newNode;
    }
}
