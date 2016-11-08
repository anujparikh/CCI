/**
 * Created by anujparikh on 11/7/16.
 */
public class ReverseString {
    public String reverseCStyleString(String input) {
        String output = " ";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }
}
