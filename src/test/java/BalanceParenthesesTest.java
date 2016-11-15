import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by anujparikh on 11/15/16.
 */
public class BalanceParenthesesTest {

    @Test
    public void whenValidInputGivenThenReturnTrue() {
        BalanceParentheses testInput = new BalanceParentheses();
        Assert.assertTrue(testInput.checkForBalancedParentheses("{{}}"));
    }

    @Test
    public void whenInvalidInputGivenThenReturnFalse() {
        BalanceParentheses testInput = new BalanceParentheses();
        Assert.assertFalse(testInput.checkForBalancedParentheses("{{{{)"));
    }

    @Test
    public void whenInvalidInputWithOpeningParenthesesGivenThenReturnFalse() {
        BalanceParentheses testInput = new BalanceParentheses();
        Assert.assertFalse(testInput.checkForBalancedParentheses("}}}"));
    }

    @Test
    public void whenValidInputParenthesesGivenThenReturnTrue() {
        BalanceParentheses testInput = new BalanceParentheses();
        Assert.assertTrue(testInput.checkForBalancedParentheses("[()()(({}))[]]"));
    }

    @Test
    public void whenInvalidInputParenthesesGivenThenReturnFalse() {
        BalanceParentheses testInput = new BalanceParentheses();
        Assert.assertFalse(testInput.checkForBalancedParentheses("[()()(({}))[]]["));
    }

    @Test
    public void whenInvalidInputWithProperParenthesesGivenThenReturnFalse() {
        BalanceParentheses testInput = new BalanceParentheses();
        Assert.assertFalse(testInput.checkForBalancedParentheses("{}}{"));
    }
}
