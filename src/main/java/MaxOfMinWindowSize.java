/**
 * Created by anujparikh on 11/17/16.
 */
public class MaxOfMinWindowSize {

    public int[] calculateMaxOfMinsOfEveyWindowSize(int input[]) {
        int[] outputArray = new int[input.length];

        for (int i = 1; i <= input.length; i++) {
            int max = Integer.MIN_VALUE;
            int min;
            for (int j = 0; j < input.length && i + j <= input.length; j++) {
                min = Integer.MAX_VALUE;
                for (int k = j; k < i + j; k++) {
                    if (min > input[k]) {
                        min = input[k];
                    }
                }
                if (max < min) {
                    max = min;
                }
            }
            outputArray[i - 1] = max;
        }

        return outputArray;
    }

}
