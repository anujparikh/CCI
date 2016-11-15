import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by anujparikh on 11/15/16.
 */
public class BalanceParentheses {

    public boolean checkForBalancedParentheses(String input) {

        java.util.Stack<Character> parenthesesStack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put('(', ')');
        mapping.put('{', '}');
        mapping.put('[', ']');

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                parenthesesStack.push(mapping.get(c));
            } else {
                if (parenthesesStack.isEmpty() || c != parenthesesStack.pop()) return false;
            }
        }
        return parenthesesStack.isEmpty();
    }
}
