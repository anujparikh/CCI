/**
 * Created by anujparikh on 11/7/16.
 */
public class RemoveDuplication {
    public String removeDuplicateCharFromStr(String input) {
        for (int i = 0; i < input.length(); i++) {
            int j = input.indexOf(input.charAt(i), i + 1);
            if (j != -1) {
                input = input.substring(0, j) + input.substring(j + 1);
                i--;
            }
        }
        return input;
    }
}
