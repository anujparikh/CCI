import java.util.HashMap;
import java.util.Map;

/**
 * Created by anujparikh on 11/21/16.
 */
public class DuplicateNoWithinRange {

    public static boolean checkForDuplicateNoWithinGivenRange(int[] input, int range) {
        Map<Integer, Integer> inputMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {

            if (i >= range) {
                inputMap.remove(input[i - range]);
            }
            inputMap.put(input[i], 1);

            if (inputMap.get(input[i]) != null) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 1, 4, 2, 3, 4};
        System.out.println(checkForDuplicateNoWithinGivenRange(input, 3));
    }

}
