/**
 * Created by anujparikh on 11/7/16.
 */
public class ReverseString {
    public String reverseCStyleString(String input) {
        StringBuilder outputBuilder = new StringBuilder(" ");
        for (int i = input.length() - 1; i >= 0; i--) {
            outputBuilder.append(input.charAt(i));
        }
        return outputBuilder.toString();
    }
}
