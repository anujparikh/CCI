/**
 * Created by anujparikh on 11/17/16.
 */
public class ReverseStack {
    public void reverseStack(java.util.Stack<String> stack) {
        if (!stack.isEmpty()) {
            String temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }

    private void insertAtBottom(java.util.Stack<String> stack, String data) {
        if (stack.isEmpty()) {
            stack.push(data);
        } else {
            String temp = stack.pop();
            insertAtBottom(stack, data);
            stack.push(temp);
        }
    }
}
