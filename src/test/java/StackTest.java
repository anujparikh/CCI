import org.junit.Test;

/**
 * Created by anujparikh on 11/13/16.
 */
public class StackTest {

    @Test
    public void createStackAndPushTest() {
        Stack testStack = new Stack(10);
        System.out.println("Is Stack Empty: " + testStack.isEmpty());
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.push(4);
        testStack.push(5);
        testStack.push(4);
        testStack.pop();
        System.out.println("Peep: " + testStack.peep());
        System.out.println("Is Stack Empty: " + testStack.isEmpty());
        testStack.printStack();
    }
}
