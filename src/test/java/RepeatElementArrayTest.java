import org.junit.Test;

/**
 * Created by anujparikh on 11/11/16.
 */
public class RepeatElementArrayTest {
    @Test
    public void checkForRepeatElementInArrayTest() {
        int[] testInput = {1, 2, 3, 4, 1, 5, 6};
        RepeatElementArray inputElement = new RepeatElementArray();
        System.out.println(inputElement.searchOneRepeatElement(testInput));
    }
}
