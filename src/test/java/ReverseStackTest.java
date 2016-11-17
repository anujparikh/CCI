import org.junit.Test;

import java.util.Stack;

/**
 * Created by anujparikh on 11/17/16.
 */
public class ReverseStackTest {

    @Test
    public void inputIntStackReturnReverseStack() {
        ReverseStack testObject = new ReverseStack();
        java.util.Stack<String> input = new Stack<>();
        input.push("a");
        input.push("b");
        input.push("c");
        input.push("d");
        input.push("e");
        System.out.println("Before Stack: " + input);
        testObject.reverseStack(input);
        System.out.println("Stack: " + input);
    }

}
