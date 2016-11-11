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

    public void delete(int key) {
        Node n = this.head;
        if (n == null) {
            return;
        }

        if (n.data == key) {
            this.head = n.next;
            return;
        }

        while (n.next.data != key) {
            n = n.next;
        }

        if (n.next.next != null) {
            n.next = n.next.next;
        } else {
            n.next = null;
        }
    }

    public void deleteAll(int key) {
        if (this.head == null)
            return;
        Node n = this.head;

        /*while (n.data == key && this.head != null) {
            if (n.next != null) {
                this.head = n.next;
                n = this.head;
            } else {
                this.head = null;
            }
        }

        while (n.next != null) {
            if (n.next.data == key) {
                if (n.next.next != null) {
                    n.next = n.next.next;
                } else {
                    n.next = null;
                }
            } else {
                n = n.next;
            }
        }*/

        while (n != null) {
            delete(key);
            n = n.next;
        }
    }

    private int getCountRec(Node n) {
        if (n == null)
            return 0;
        return 1 + getCountRec(n.next);
    }

    public int getCount() {
        return getCountRec(this.head);
    }

    private boolean searchKeyRec(Node n, int key) {
        return n != null && (n.data == key || searchKeyRec(n.next, key));
    }

    public boolean searchKey(int key) {
        return searchKeyRec(this.head, key);
    }

    /*public void insertionSort() {
        Node n = this.head;
        while (n != null) {
            sortedInsert(n.data);
            n = n.next;
        }
    }*/

    public void sortedInsert(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        if (newNode.data < this.head.data) {
            newNode.next = this.head;
            this.head = newNode;
            return;
        }
        Node n = this.head;
        while (n.next != null && (newNode.data > n.next.data)) {
            ;
            n = n.next;
        }
        if (n.next != null) {
            newNode.next = n.next;
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
