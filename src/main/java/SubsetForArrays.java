import java.util.HashMap;
import java.util.Map;

/**
 * Created by anujparikh on 11/21/16.
 */
public class SubsetForArrays {

    public static boolean checkArray2SubsetOfArray1(int[] array1, int[] array2) {
        Map<Integer, Integer> array2HashMap = new HashMap<>();
        for (int i : array2) {
            array2HashMap.put(i, array2HashMap.get(i) == null ? 1 : array2HashMap.get(i) + 1);
        }
        for (int i : array1) {
            if (array2HashMap.get(i) != null) {
                array2HashMap.put(i, array2HashMap.get(i) - 1);
            }
        }

        for (Map.Entry<Integer, Integer> entrySet : array2HashMap.entrySet()) {
            System.out.println(entrySet.getKey() + "\t-->\t" + entrySet.getValue());
        }

        for (int v : array2HashMap.values()) {
            if (v != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] input1 = {11, 1, 13, 21, 3, 7};
        int[] input2 = {11, 3, 7, 1};
        System.out.println(checkArray2SubsetOfArray1(input1, input2));
    }
}
