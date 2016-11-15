import org.junit.Test;

/**
 * Created by anujparikh on 11/14/16.
 */
public class TwoStackTest {

    @Test
    public void whenInputValidIntegerOnStackThenReturnTrue() {
        TwoStack testInput = new TwoStack(5);
        testInput.push1(1);
        testInput.push1(2);
        testInput.push1(3);
        testInput.push1(4);
        testInput.push2(10);
        testInput.push2(11);
        testInput.push2(12);
        testInput.push2(13);
        System.out.println("Pop1: " + testInput.pop1());
        System.out.println("Pop2: " + testInput.pop1());
        System.out.println("Pop11: " + testInput.pop2());
        System.out.println("Pop12: " + testInput.pop2());
        testInput.push1(5);
        testInput.push1(6);
        testInput.push2(15);
        testInput.push2(16);
        testInput.printStack1();
        testInput.printStack2();
    }

    @Test
    public void whenInputExceedsCapacityThenReturnFalseTest() {
        TwoStack testInput = new TwoStack(2);
        testInput.push1(1);
        testInput.push1(1);
        testInput.push2(1);
        testInput.push2(1);
        testInput.printStack1();
        testInput.printStack2();
        System.out.println(testInput.push1(2));
    }
}
