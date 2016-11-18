import org.junit.Test;

/**
 * Created by anujparikh on 11/17/16.
 */
public class CustomQueueUsingArrayTest {

    @Test
    public void whenEnqueueOperationReturnTrue() {
        CustomQueueUsingArray testObject = new CustomQueueUsingArray(4);
        testObject.enqueue(10);
        testObject.enqueue(11);
        testObject.enqueue(12);
        testObject.enqueue(13);
        testObject.dequeue();
        testObject.enqueue(14);
        testObject.dequeue();
        testObject.printQueue();
        System.out.println("\nFront: " + testObject.front());
        System.out.println("Rear: " + testObject.rear());
    }
}
