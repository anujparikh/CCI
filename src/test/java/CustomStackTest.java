import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by anujparikh on 11/13/16.
 */
public class CustomStackTest {

    @Test
    public void createStackAndPushTest() {
        CustomStack testCustomStack = new CustomStack(Integer.class, 10);
        System.out.println("Is CustomStack Empty: " + testCustomStack.empty());
        testCustomStack.push(1);
        testCustomStack.push(2);
        testCustomStack.push(3);
        testCustomStack.push(4);
        testCustomStack.push(5);
        testCustomStack.push(4);
        testCustomStack.pop();
        System.out.println("Peep: " + testCustomStack.peep());
        System.out.println("Is CustomStack Empty: " + testCustomStack.empty());
        testCustomStack.printStack();
    }

    @Ignore
    @Test
    public void infixToPostfixTest() {
        String testInput = "a+b*(c^d-e)^(f+g*h)-i";
        CustomStack.infixToPostFix(testInput);
    }
}
