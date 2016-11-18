/**
 * Created by anujparikh on 11/17/16.
 */
public class CustomQueueUsingArray {
    private int[] queueArray;
    private int dequeueIndex;
    private int enqueueIndex;
    private int size;

    CustomQueueUsingArray(int capacity) {
        this.queueArray = new int[capacity];
        this.dequeueIndex = 0;
        this.enqueueIndex = 0;
        this.size = 0;
    }

    public boolean enqueue(int data) {
        if (size >= queueArray.length) {
            System.out.println("Queue Full");
            return false;
        }
        queueArray[enqueueIndex] = data;
        enqueueIndex = (enqueueIndex + 1) % queueArray.length;
        size++;
        return true;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("No Elements in queue");
            return -1;
        }
        int output = queueArray[dequeueIndex];
        dequeueIndex = (dequeueIndex + 1) % queueArray.length;
        size--;
        return output;
    }

    public int front() {
        return queueArray[dequeueIndex];
    }

    public int rear() {
        return queueArray[enqueueIndex - 1];
    }

    public void printQueue() {
        System.out.println("size: " + size);
        for (int i = dequeueIndex, j = 0; j < size; j++, i = ++i % queueArray.length) {
            System.out.print(queueArray[i] + " ");
        }
    }
}
