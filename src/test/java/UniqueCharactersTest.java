import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by anujparikh on 11/7/16.
 */
public class UniqueCharactersTest {

    @Test
    public void whenStringWithAllUniqueCharactersInputThenReturnTrue() {
        UniqueCharacters testInput = new UniqueCharacters();
        Assert.assertTrue(testInput.checkUniqueCharInStringNLogN("asdf"));
        Assert.assertTrue(testInput.checkUniqueCharInStringN("asdf"));
        Assert.assertTrue(testInput.checkUniqueCharInStringWithoutDataStructureN("asdf"));
    }

    @Test
    public void whenStringWithCommonCharactersInputThenReturnFalse() {
        UniqueCharacters testInput = new UniqueCharacters();
        Assert.assertFalse(testInput.checkUniqueCharInStringNLogN("aaa"));
        Assert.assertFalse(testInput.checkUniqueCharInStringN("aaa"));
        Assert.assertFalse(testInput.checkUniqueCharInStringWithoutDataStructureN("aaa"));
    }

    @Test
    public void whenEmptyStringInputThenReturnTrue() {
        UniqueCharacters testInput = new UniqueCharacters();
        Assert.assertTrue(testInput.checkUniqueCharInStringNLogN(""));
        Assert.assertTrue(testInput.checkUniqueCharInStringN(""));
        Assert.assertTrue(testInput.checkUniqueCharInStringWithoutDataStructureN(""));
    }
}
