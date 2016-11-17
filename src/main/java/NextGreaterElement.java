import java.util.Stack;

/**
 * Created by anujparikh on 11/17/16.
 */
public class NextGreaterElement {

    public int[] calculateNextGreaterElement(int[] inputArray) {

        int[] outputArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            boolean found = false;
            for (int j = i + 1; i < inputArray.length - 1 && j < inputArray.length; j++) {
                if (inputArray[j] > inputArray[i]) {
                    outputArray[i] = inputArray[j];
                    found = true;
                    break;
                }
            }
            if (!found) {
                outputArray[i] = -1;
            }

        }
        return outputArray;
    }

    public int[] calculateNextGreaterElementUsingStack(int[] inputArray) {

        int[] outputArray = new int[inputArray.length];
        int position = inputArray.length - 1;
        int highValue = Integer.MIN_VALUE;
        int previousValue = Integer.MIN_VALUE;
        outputArray[position] = -1;

        java.util.Stack<Integer> inputStack = new Stack<>();
        for (int i : inputArray) {
            inputStack.push(i);
        }



        while (!inputStack.isEmpty()) {
            int currentValue = inputStack.pop();
            if (currentValue < previousValue) {
                outputArray[position] = previousValue;
                highValue = previousValue;
            } else if (currentValue < highValue) {
                outputArray[position] = highValue;
            } else {
                outputArray[position] = -1;
            }
            previousValue = currentValue;
            position--;

        }

        return outputArray;
    }
}
