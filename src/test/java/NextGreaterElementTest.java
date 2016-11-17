import org.junit.Test;

/**
 * Created by anujparikh on 11/17/16.
 */
public class NextGreaterElementTest {

    @Test
    public void whenInputArrayThenReturnNextGreaterElementsArrayTest1() {
        NextGreaterElement testObject = new NextGreaterElement();
        int input[] = {4, 5, 2, 25};
        int calculatedOutput[] = testObject.calculateNextGreaterElement(input);
        for (int i = 0; i < calculatedOutput.length; i++) {
            System.out.println((i + 1) + ": " + calculatedOutput[i]);
        }
    }

    @Test
    public void whenInputArrayThenReturnNextGreaterElementsArrayTest2() {
        NextGreaterElement testObject = new NextGreaterElement();
        int input[] = {13, 7, 6, 12};
        int calculatedOutput[] = testObject.calculateNextGreaterElement(input);
        for (int i = 0; i < calculatedOutput.length; i++) {
            System.out.println((i + 1) + ": " + calculatedOutput[i]);
        }
    }

    @Test
    public void whenInputArrayInDecOrderThenReturnNextGreaterElementsArrayTest() {
        NextGreaterElement testObject = new NextGreaterElement();
        int input[] = {13, 12, 11, 10};
        int calculatedOutput[] = testObject.calculateNextGreaterElement(input);
        for (int i = 0; i < calculatedOutput.length; i++) {
            System.out.println((i + 1) + ": " + calculatedOutput[i]);
        }
    }

    @Test
    public void whenInputArrayInIncOrderThenReturnNextGreaterElementsArrayTest() {
        NextGreaterElement testObject = new NextGreaterElement();
        int input[] = {13, 14, 15, 16};
        int calculatedOutput[] = testObject.calculateNextGreaterElement(input);
        for (int i = 0; i < calculatedOutput.length; i++) {
            System.out.println((i + 1) + ": " + calculatedOutput[i]);
        }
    }

    @Test
    public void whenInputArrayThenReturnNextGreaterElementsArrayTest1UsingStack() {
        NextGreaterElement testObject = new NextGreaterElement();
        int input[] = {4, 5, 2, 25};
        int calculatedOutput[] = testObject.calculateNextGreaterElementUsingStack(input);
        for (int i = 0; i < calculatedOutput.length; i++) {
            System.out.println((i + 1) + ": " + calculatedOutput[i]);
        }
    }

    @Test
    public void whenInputArrayThenReturnNextGreaterElementsArrayTest2UsingStack() {
        NextGreaterElement testObject = new NextGreaterElement();
        int input[] = {13, 7, 6, 12};
        int calculatedOutput[] = testObject.calculateNextGreaterElementUsingStack(input);
        for (int i = 0; i < calculatedOutput.length; i++) {
            System.out.println((i + 1) + ": " + calculatedOutput[i]);
        }
    }

    @Test
    public void whenInputArrayInDecOrderThenReturnNextGreaterElementsArrayTestUsingStack() {
        NextGreaterElement testObject = new NextGreaterElement();
        int input[] = {13, 12, 11, 10};
        int calculatedOutput[] = testObject.calculateNextGreaterElementUsingStack(input);
        for (int i = 0; i < calculatedOutput.length; i++) {
            System.out.println((i + 1) + ": " + calculatedOutput[i]);
        }
    }

    @Test
    public void whenInputArrayInIncOrderThenReturnNextGreaterElementsArrayTestUsingStack() {
        NextGreaterElement testObject = new NextGreaterElement();
        int input[] = {13, 14, 15, 16};
        int calculatedOutput[] = testObject.calculateNextGreaterElementUsingStack(input);
        for (int i = 0; i < calculatedOutput.length; i++) {
            System.out.println((i + 1) + ": " + calculatedOutput[i]);
        }
    }
}
