import org.junit.Test;

/**
 * Created by anujparikh on 11/11/16.
 */
public class LoneElementInArrayTest {
    @Test
    public void inputArrayWithTwiceRepeatingElementTest() {
        int[] testInput = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        LoneElementInArray input = new LoneElementInArray();
        System.out.println(input.findElementThatAppearsOnce(testInput));
    }

    @Test
    public void inputArrayWithThriceRepeatingElementTest() {
        int[] testInput = {1, 1, 1, 2, 2, 3, 2, 4, 4, 4, 5, 5, 5};
        LoneElementInArray input = new LoneElementInArray();
        System.out.println(input.findElementThatAppearsOnce(testInput));
    }
}
