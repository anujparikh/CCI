/**
 * Created by anujparikh on 11/10/16.
 */
public class InsertionSort {
    public int[] sort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int j = i;
            while (input[j - 1] > input[j]) {
                int temp = input[j];
                input[j] = input[j - 1];
                input[j - 1] = temp;
                if (j != 1) {
                    j--;
                }

            }
        }
        return input;
    }
}
