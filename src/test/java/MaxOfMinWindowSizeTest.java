import org.junit.Test;

/**
 * Created by anujparikh on 11/17/16.
 */
public class MaxOfMinWindowSizeTest {

    @Test
    public void whenInputArrayThenReturnMaxOfMinForAllWindowSize() {
        MaxOfMinWindowSize testObject = new MaxOfMinWindowSize();
        int[] input = {10, 20, 30, 50, 10, 70, 30};
        int[] calculatedOutput = testObject.calculateMaxOfMinsOfEveyWindowSize(input);
        for (int i = 0; i < calculatedOutput.length; i++) {
            System.out.println("Window size " + (i + 1) + " ----> " + calculatedOutput[i]);
        }
    }
}
