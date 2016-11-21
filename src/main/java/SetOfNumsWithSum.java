import java.util.Arrays;

/**
 * Created by anujparikh on 11/21/16.
 */
public class SetOfNumsWithSum {

    public static void getPairOfNosWithInputArrayAndSum(int[] input, int sum) {
        Arrays.sort(input);
        for (int i = 0, j = input.length - 1; i < j; ) {
            if (input[i] + input[j] < sum) i++;
            else if (input[i] + input[j] > sum) j--;
            else {
                System.out.println("Pair is: " + input[i] + " & " + input[j]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 5, 3, 6, 9, 7, 8};
        getPairOfNosWithInputArrayAndSum(input, 15);
    }
}
