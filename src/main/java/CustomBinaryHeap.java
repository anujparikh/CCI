/**
 * Created by anujparikh on 11/20/16.
 */
public class CustomBinaryHeap {
    int capacity;
    int[] keyArray;
    int size;

    CustomBinaryHeap(int capacity) {
        this.capacity = capacity;
        this.keyArray = new int[this.capacity];
        this.size = 0;
    }

    CustomBinaryHeap(int[] inputArray, int capacity) {
        this.capacity = capacity;
        this.keyArray = new int[this.capacity];
        this.size = 0;

        for (int i = 0; i < inputArray.length; i++) {
            insert(inputArray[i]);
        }
    }

    public void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public int leftChild(int i) {
        return 2 * i + 1;
    }

    public int rightChild(int i) {
        return (2 * i) + 2;
    }

    public void percolateUp(int i) {
        while (i != 0 && keyArray[i] < keyArray[parent(i)]) {
            swap(keyArray, i, parent(i));
            i = parent(i);
        }
    }

    public void minHeapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int min = i;

        if (left < size && keyArray[left] < keyArray[i]) {
            min = keyArray[left];
        }
        if (right < size && keyArray[right] < keyArray[i]) {
            min = keyArray[right];
        }

        if (min != i) {
            swap(keyArray, min, i);
            minHeapify(min);
        }
    }

    public void insert(int key) {
        if (size >= capacity - 1) {
            System.out.println("Heap Overflow");
            return;
        }
        this.keyArray[size++] = key;
        percolateUp(size - 1);
    }

    public int extractMin() {
        if (size <= 0) {
            System.out.println("Empty Heap");
            return Integer.MAX_VALUE;
        }
        if (size == 1) {
            size--;
            return keyArray[0];
        }
        int root = keyArray[0];
        keyArray[0] = keyArray[size - 1];
        size--;
        minHeapify(0);
        return root;
    }

    public void decreaseKey(int i, int newKey) {
        keyArray[i] = newKey;
        percolateUp(i);
    }

    public void delete(int i) {
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }

    public void printMinHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(keyArray[i] + " ");
        }
        System.out.println();
    }
}
