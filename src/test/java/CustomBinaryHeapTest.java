import org.junit.Test;

/**
 * Created by anujparikh on 11/20/16.
 */
public class CustomBinaryHeapTest {

    @Test
    public void binaryHeapCreationTest() {
        CustomBinaryHeap testObject = new CustomBinaryHeap(10);
        testObject.insert(3);
        testObject.printMinHeap();
        System.out.println("**********************");

        testObject.insert(2);
        testObject.printMinHeap();
        System.out.println("**********************");

        testObject.delete(1);
        testObject.printMinHeap();
        System.out.println("**********************");
    }
}
