import java.util.EmptyStackException;

/**
 * Created by anujparikh on 11/13/16.
 */

// LIFO Stack
public class StackFromLL {

    private Node head;

    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.next = null;
            this.data = data;
        }
    }

    public int push(int data) {
        Node dataNode = new Node(data);
        if (this.head == null) {
            this.head = dataNode;
            return data;
        }
        dataNode.next = this.head;
        this.head = dataNode;
        return data;
    }

    public int pop() {
        if (this.head == null) {
            throw new EmptyStackException();
        } else {
            Node popNode = this.head;
            this.head = this.head.next;
            return popNode.data;
        }
    }

    public int peek() {
        if (this.head == null) {
            throw new EmptyStackException();
        } else {
            return this.head.data;
        }
    }

    public void printStack() {
        Node n = this.head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public int search(int data) {
        int counter = 1;
        Node n = this.head;
        if (data == n.data) {
            return counter;
        }
        while (n != null) {
            if (data == n.data) {
                return counter;
            }
            n = n.next;
            counter++;
        }
        return counter;
    }

    public boolean empty() {
        return this.head == null;
    }
}
