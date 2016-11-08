import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by anujparikh on 11/7/16.
 */
public class RemoveDuplicationTest {

    @Test
    public void whenStringWithDupCharInputThenRemoveDupChar() {
        RemoveDuplication testInput = new RemoveDuplication();
        Assert.assertEquals("anujprikh", testInput.removeDuplicateCharFromStr("anujparikh"));
        Assert.assertEquals("asdf", testInput.removeDuplicateCharFromStr("asdfasdfasdf"));
        Assert.assertEquals("asdf", testInput.removeDuplicateCharFromStr("aaaassssddddffff"));
    }

    @Test
    public void whenStringWithAllDupCharInputThenOutputSingleChar() {
        RemoveDuplication testInput = new RemoveDuplication();
        Assert.assertEquals("a", testInput.removeDuplicateCharFromStr("aaaaaaa"));
    }
}
