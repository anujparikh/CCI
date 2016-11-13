import java.util.Hashtable;

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

    /**
     * O(n^2) runtime
     * O(1)   space complexity
     */
    public void removeDuplicate() {
        Node n = this.head;
        while (n != null) {
            Node innerNode = n;
            while (innerNode.next != null) {
                if (n.data == innerNode.next.data) {
                    innerNode.next = innerNode.next.next;
                } else {
                    innerNode = innerNode.next;
                }
            }
            n = n.next;
        }
    }

    /**
     * O(n) runtime
     * O(n)   space complexity
     */
    public void removeDuplicateThroughHashTable() {
        Hashtable hashtable = new Hashtable();
        Node n = this.head;
        hashtable.put(n.data, true);
        while (n.next != null) {
            if (hashtable.containsKey(n.next.data)) {
                n.next = n.next.next;
            } else {
                hashtable.put(n.next.data, true);
                n = n.next;
            }
        }
    }

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

    public int searchNthFromLastElement(int n) {
        Node valueNode = this.head;
        Node currentNode = this.head;
        for (int i = 0; i < n; i++) {
            currentNode = currentNode.next;
        }
        while (currentNode != null) {
            valueNode = valueNode.next;
            currentNode = currentNode.next;
        }
        return valueNode.data;
    }

    public void printList() {
        Node n = this.head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public LinkedList addTwoLL(LinkedList ll1, LinkedList ll2) {
        Node n1 = ll1.head;
        Node n2 = ll2.head;
        Node currentSumNode = null;
        Node sumNode;
        LinkedList finalOutput = new LinkedList();
        int remainder = 0;

        while (n1 != null) {
            sumNode = new Node(n1.data + n2.data + remainder);
            remainder = sumNode.data / 10;
            sumNode.data = sumNode.data % 10;

            if (n1 == ll1.head) {
                finalOutput.head = sumNode;
                currentSumNode = finalOutput.head;
            } else {
                currentSumNode.next = sumNode;
                currentSumNode = currentSumNode.next;
            }
            n1 = n1.next;
            n2 = n2.next;
        }

        if (remainder != 0) {
            sumNode = new Node(remainder);
            currentSumNode.next = sumNode;
        }
        return finalOutput;
    }

    public Node searchFirstNodeInLoop() {
        Hashtable hashtable = new Hashtable();
        Node n = this.head;
        while (n.next != null) {
            if (hashtable.containsKey(n.next.data)) {
                return n.next;
            } else {
                hashtable.put(n.next.data, true);
            }
        }
        return null;
    }

    public void deleteLastOccurrence(int key) {
        Node n = this.head;
        Node lastToOneNode = null;
        if (this.head.data == key) {
            lastToOneNode = this.head;
        }
        while (n.next != null) {
            if (n.next.data == key) {
                lastToOneNode = n;
            }
            n = n.next;
        }
        if (lastToOneNode == null) {
            return;
        }
        lastToOneNode.next = lastToOneNode.next.next;
    }

    public void reverseLinkedList() {
        Node current = this.head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head = previous;
    }
}
