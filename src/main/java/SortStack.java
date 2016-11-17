import java.util.Stack;

/**
 * Created by anujparikh on 11/17/16.
 */
public class SortStack {
    public void getElementFromStack(java.util.Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            getElementFromStack(stack);
            insertAtBottom(stack, temp);
        }
    }

    private void insertAtBottom(java.util.Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
        } else {
            int temp = stack.pop();
            if (data > temp) {
                int tempVar = data;
                data = temp;
                temp = tempVar;
            }
            insertAtBottom(stack, data);
            stack.push(temp);
        }
    }

    public java.util.Stack<Integer> sort(Stack<Integer> input) {
        Stack<Integer> outputStack = new Stack<>();
        Stack<Integer> bufferStack = new Stack<>();
        while (!input.isEmpty()) {
            if (outputStack.isEmpty()) {
                outputStack.push(input.pop());
            } else if (input.peek() >= outputStack.peek()) {
                outputStack.push(input.pop());
            } else {
                while (!outputStack.isEmpty() && input.peek() < outputStack.peek()) {
                    bufferStack.push(outputStack.pop());
                }
                outputStack.push(input.pop());
                while (!bufferStack.isEmpty()) {
                    outputStack.push(bufferStack.pop());
                }
            }
        }
        return outputStack;
    }
}
