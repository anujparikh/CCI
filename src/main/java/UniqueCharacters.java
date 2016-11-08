/**
 * Created by anujparikh on 11/7/16.
 */
public class UniqueCharacters {
    public boolean checkUniqueCharInStringNLogN(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkUniqueCharInStringN(String input) {
        boolean[] charArray = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            if (charArray[input.charAt(i)])
                return false;
            else
                charArray[input.charAt(i)] = true;
        }
        return true;
    }

    public boolean checkUniqueCharInStringWithoutDataStructureN(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i), i + 1) != -1) {
                return false;
            }
        }
        return true;
    }
}
