/**
 * Created by anujparikh on 11/8/16.
 */
public class Replace {
    public char[] replaceSpaceInString(char[] input) {
        int spaceCounter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' ') spaceCounter++;
        }
        if (spaceCounter == 0) {
            return input;
        }
        char[] newOutputArray = new char[input.length + (spaceCounter * 2)];
        for (int i = 0, j = 0; i < input.length; i++, j++) {
            if (input[i] == ' ') {
                newOutputArray[j] = '%';
                newOutputArray[++j] = '2';
                newOutputArray[++j] = '0';
            } else {
                newOutputArray[j] = input[i];
            }
        }
        System.out.println(newOutputArray);
        return newOutputArray;
    }
}
