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
}
