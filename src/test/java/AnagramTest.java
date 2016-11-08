import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by anujparikh on 11/7/16.
 */
public class AnagramTest {

    @Test
    public void whenInputAnagramStringsThenReturnTrue() {
        Anagram testInput = new Anagram();
        Assert.assertTrue(testInput.checkIfStringsAreAnagram("abcd", "cdba"));
        Assert.assertTrue(testInput.checkIfStringsAreAnagram("Clint Eastwood", "Old West action"));
        Assert.assertTrue(testInput.checkIfStringsAreAnagram("The best things in life are free", "Nail biting refreshes the feet"));
        Assert.assertFalse(testInput.checkIfStringsAreAnagram("asdf", "dert"));
    }
}
