import org.junit.Test;

/**
 * Created by anujparikh on 11/17/16.
 */
public class SortStackTest {

    @Test
    public void whenInputIntStackReturnSortedStackTest() {
        SortStack testObject = new SortStack();
        java.util.Stack<Integer> input = new java.util.Stack<>();
        input.push(1);
        input.push(3);
        input.push(2);
        input.push(6);
        input.push(5);
        testObject.getElementFromStack(input);
        System.out.println("Stack: " + input);
    }
}
