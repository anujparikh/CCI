import java.util.EmptyStackException;

/**
 * Created by anujparikh on 11/12/16.
 */
public class Stack {

    private int capacity;
    private int[] stackData;
    private int topIndex;

    Stack(int capacity) {
        this.capacity = capacity;
        this.stackData = new int[this.capacity];
        this.topIndex = 0;
    }

    public boolean push(int data) {

        if (topIndex == capacity - 1)
            return false;

        stackData[topIndex] = data;
        topIndex++;
        return true;
    }

    public int pop() {
        if (topIndex == 0)
            throw new EmptyStackException();
        return stackData[--topIndex];
    }

    public int peep() {
        if (topIndex == 0)
            throw new EmptyStackException();
        return stackData[topIndex - 1];
    }

    public boolean isEmpty() {
        if (topIndex == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printStack() {
        for (int i = topIndex - 1; i >= 0; i--) {
            System.out.println(stackData[i]);
        }
    }

}
