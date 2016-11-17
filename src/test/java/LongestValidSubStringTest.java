import org.junit.Test;

/**
 * Created by anujparikh on 11/17/16.
 */
public class LongestValidSubStringTest {

    @Test
    public void whenStringOfParenthesisInputThenReturnLargestValueOfValidMatch() {
        LongestValidSubString testObject = new LongestValidSubString();
        System.out.println(testObject.calculateNumberOfValidParenthesis("(()))()()"));
        System.out.println(testObject.calculateNumberOfValidParenthesis("((()"));
        System.out.println(testObject.calculateNumberOfValidParenthesis(")()())"));
        System.out.println(testObject.calculateNumberOfValidParenthesis("()(()))))"));
    }
}
