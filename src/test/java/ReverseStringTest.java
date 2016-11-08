import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by anujparikh on 11/7/16.
 */
public class ReverseStringTest {

    @Test
    public void whenInputCStyleStringThenOutputReverseString() {
        ReverseString testInput = new ReverseString();
        Assert.assertEquals(" dcba", testInput.reverseCStyleString("abcd"));
    }

    @Test
    public void whenInputEmptyCStyleStringThenOutputReverseStringWithSpace() {
        ReverseString testInput = new ReverseString();
        Assert.assertEquals(" ", testInput.reverseCStyleString(""));
    }
}
