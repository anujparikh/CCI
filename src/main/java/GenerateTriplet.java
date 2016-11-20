/**
 * Created by anujparikh on 11/20/16.
 */
public class GenerateTriplet {

    public static void calculateAllPossibleTriplet(int[] input) {
        int counter = 1;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                for (int k = j + 1; k < input.length; k++) {
                    System.out.println(counter++ + " ---> " + input[i] + ", " + input[j] + ", " + input[k] + " Sum: " + (input[i] + input[j] + input[k]));
                }
            }
        }
    }

    public static void fetchTripletWithSumZero(int[] input) {
        int j, k;
        for (int i = 0; i < input.length - 2; i++) {
            j = i + 1;
            k = input.length - 1;
            while (j < k) {
                int sum = input[i] + input[j] + input[k];
                if (sum == 0) {
                    System.out.println("Final with Zero sum: " + input[i] + ", " + input[j] + ", " + input[k]);
                    return;
                }
                if (sum < 0) j++;
                else k--;
            }
        }
    }

    public static void calculateAllPossiblePairs(int[] input, int k) {
        for (int i = 0, j = input.length - 1; i < j; ) {
            int sum = input[i] + input[j];
            if (sum == k) {
                System.out.println(input[i] + ", " + input[j] + " Sum: " + sum);
                return;
            }
            if (sum < k) {
                i++;
            } else if (sum > k) {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int[] input2 = {-10, 1, 4, 6, 8, 45};
        calculateAllPossiblePairs(input, 3);
        calculateAllPossibleTriplet(input);
        fetchTripletWithSumZero(input2);
    }

}
