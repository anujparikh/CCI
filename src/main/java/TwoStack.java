/**
 * Created by anujparikh on 11/14/16.
 */
public class TwoStack {
    private int capacity;
    private int[] stackArray;
    private int pointer1;
    private int pointer2;

    TwoStack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[this.capacity * 2];
        this.pointer1 = 0;
        this.pointer2 = this.stackArray.length - 1;
    }

    public boolean push1(int data) {
        if (this.pointer1 > this.pointer2) {
            return false;
        } else {
            this.stackArray[this.pointer1++] = data;
            return true;
        }
    }

    public boolean push2(int data) {
        if (this.pointer1 > this.pointer2) {
            return false;
        } else {
            this.stackArray[this.pointer2--] = data;
            return true;
        }
    }

    public int pop1() {
        return this.stackArray[--this.pointer1];
    }

    public int pop2() {
        return this.stackArray[++this.pointer2];
    }

    public void printStack1() {
        for (int i = 0; i < this.pointer1; i++) {
            System.out.println(this.stackArray[i]);
        }
    }

    public void printStack2() {
        for (int i = this.stackArray.length - 1; i > this.pointer2; i--) {
            System.out.println(this.stackArray[i]);
        }
    }
}
