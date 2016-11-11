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
}
