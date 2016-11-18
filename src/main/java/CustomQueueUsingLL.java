import java.util.LinkedList;

/**
 * Created by anujparikh on 11/17/16.
 */
public class CustomQueueUsingLL {

    private LinkedList<Integer> inputLL;
    private int size;
    private int capacity;

    CustomQueueUsingLL(int capacity) {
        this.inputLL = new LinkedList<>();
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean enqueue(int data) {
        if (size >= capacity) {
            System.out.println("Queue is full");
            return false;
        }
        inputLL.add(data);
        size++;
        return true;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        size--;
        return inputLL.remove();
    }

    public int front() {
        return inputLL.peekFirst();
    }

    public int rear() {
        return inputLL.peekLast();
    }

    public void printQueue() {
        System.out.println("size: " + size);
        System.out.println(inputLL);
    }
}
