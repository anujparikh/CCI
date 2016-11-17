import java.util.Stack;

/**
 * Created by anujparikh on 11/17/16.
 */
public class StockSpanProblem {
    public int[] calculateStockSpan(int[] input) {
        int[] outputArray = new int[input.length];

        for (int i = input.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (input[i] >= input[j]) {
                    outputArray[i]++;
                } else {
                    break;
                }
            }
        }
        return outputArray;
    }

    public int[] calculateStockSpanUsingStack(int[] a) {
        int[] spans = new int[a.length];
        java.util.Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            spans[i] = 1;
            while (!stack.isEmpty() && a[i] >= a[stack.peek()]) {
                spans[i] = spans[i] + spans[stack.pop()];
            }
            stack.push(i);
        }
        return spans;
    }
}
