import java.util.HashMap;
import java.util.Map;

/**
 * Created by anujparikh on 11/21/16.
 */
public class NoOfEmpsUndEmployee {

    public static void printNoOfEmpsBelow(Map<Character, Character> input) {
        Map<Character, Integer> mapping = new HashMap<>();
        for (Character key : input.keySet()) {
            mapping.put(key, 0);
        }
        for (Map.Entry<Character, Character> entrySet : input.entrySet()) {
            if (entrySet.getValue() != entrySet.getKey()) {
                mapping.put(entrySet.getValue(), mapping.get(entrySet.getKey()) + mapping.get(entrySet.getValue()) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entrySet : mapping.entrySet()) {
            System.out.println(entrySet.getKey() + " ---> " + entrySet.getValue());
        }
    }

    public static void main(String[] args) {
        Map<Character, Character> inputMap = new HashMap<>();
        inputMap.put('A', 'C');
        inputMap.put('B', 'C');
        inputMap.put('C', 'F');
        inputMap.put('D', 'E');
        inputMap.put('E', 'F');
        inputMap.put('F', 'F');
        printNoOfEmpsBelow(inputMap);
    }
}
