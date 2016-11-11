import java.util.HashMap;
import java.util.Map;

/**
 * Created by anujparikh on 11/10/16.
 */
public class RepeatElementArray {
    public int searchOneRepeatElement(int[] inputArray) {
        Map<Integer, Boolean> mapping = new HashMap<>();
        for (int i : inputArray) {
            if (mapping.get(i) != null) {
                return i;
            } else {
                mapping.put(i, false);
            }
        }
        return -1;
    }

    // given n
    public int searchOneRepeatElementWithoutSpace(int[] inputArray, int n) {
        int xor = inputArray[0];
        int xor2 = 1;
        for (int i = 1; i < inputArray.length; i++) {
            xor ^= inputArray[i];
        }
        for (int i = 2; i <= n; i++) {
            xor2 ^= i;
        }
        return (xor ^ xor2);
    }
}
