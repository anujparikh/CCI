import org.junit.Test;

/**
 * Created by anujparikh on 11/17/16.
 */
public class SortStackTest {

    @Test
    public void whenInputIntStackReturnSortedStackTest() {
        SortStack testObject = new SortStack();
        java.util.Stack<Integer> input = new java.util.Stack<>();
        input.push(5);
        input.push(1);
        input.push(3);
        input.push(4);
        input.push(2);
        System.out.println("Original Stack: " + input);
        java.util.Stack sortedStack = testObject.sort(input);
        System.out.println("Sorted Stack: " + sortedStack);
    }
}
