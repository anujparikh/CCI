import org.junit.Test;

/**
 * Created by anujparikh on 11/14/16.
 */
public class StackFromLLTest {

    @Test
    public void inputDataOnStackWithLLTest() {
        StackFromLL inputStack = new StackFromLL();
        inputStack.push(5);
        inputStack.push(2);
        inputStack.push(4);
        System.out.println("Search: " + inputStack.search(2));
        inputStack.pop();
        inputStack.printStack();
    }
}
