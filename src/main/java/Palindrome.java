public class Palindrome {
    public boolean checkStringForPanlindrome(String input) {
        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome testObject = new Palindrome();
        String input = "abcdcba";
        System.out.println("Input String " + input + " is Palindrome: " + testObject.checkStringForPanlindrome(input));
        input = "abcdedcba";
        System.out.println("Input String " + input + " is Palindrome: " + testObject.checkStringForPanlindrome(input));
    }
}