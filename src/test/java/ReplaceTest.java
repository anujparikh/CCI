import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anujparikh on 11/8/16.
 */
public class ReplaceTest {

    @Test
    public void whenInputCharArrayWithSpaceThenReturnNewCharArray() {
        char[] input = {'a', 'b', ' ', 'c'};
        char[] expectedOutput = {'a', 'b', '%', '2', '0', 'c'};
        Replace testInput = new Replace();
        Assert.assertArrayEquals(expectedOutput, testInput.replaceSpaceInString(input));
    }

    @Test
    public void whenInputCharArrayWithNoSpaceThenReturnSameCharArray() {
        char[] input = {'a', 'b', 'c'};
        char[] expectedOutput = {'a', 'b', 'c'};
        Replace testInput = new Replace();
        Assert.assertArrayEquals(expectedOutput, testInput.replaceSpaceInString(input));
    }
}
