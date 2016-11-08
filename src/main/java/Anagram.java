/**
 * Created by anujparikh on 11/7/16.
 */
public class Anagram {
    public boolean checkIfStringsAreAnagram(String s1, String s2) {
        int[] charArray1 = new int[256];
        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");
        if (s1.length() != s2.length()) {
            return false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                charArray1[s1.charAt(i)]++;
                charArray1[s2.charAt(i)]--;
            }
        }
        for (int i : charArray1) {
            if (i != 0) return false;
        }
        return true;
    }
}
