import java.util.Stack;

/**
 * Created by anujparikh on 11/17/16.
 */
public class LongestValidSubString {

    public int calculateNumberOfValidParenthesis(String input) {

        java.util.Stack<Character> inputStack = new Stack<>();
        int counter = 0;
        int largest = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                inputStack.push('(');
            } else if (input.charAt(i) == ')' && !inputStack.isEmpty()) {
                if (inputStack.pop() == '(') {
                    counter += 2;
                    if (counter > largest) {
                        largest = counter;
                    }
                } else {
                    counter = 0;
                }
            } else {
                counter = 0;
            }
        }

        return largest;
    }
}
