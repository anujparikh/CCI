import java.util.stream.IntStream;

public class Palindrome {
    public boolean checkStringForPalindrome(String input) {
        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) return false;
        }
        return true;
    }

    public static void checkInputForFizzBuzz(int range) {
        IntStream.rangeClosed(1, range).forEach(k -> System.out.println(checkNumber(k)));
    }

    public static String checkNumber(int k) {
        String result = ((k % 3 == 0 ? "Fizz" : "") + (k % 5 == 0 ? "Buzz" : ""));
        return result.length() == 0 ? Integer.toString(k) : result;
    }

    public static void main(String[] args) {
        Palindrome testObject = new Palindrome();
        String input = "abcdcba";
        System.out.println("Input String " + input + " is Palindrome: " + testObject.checkStringForPalindrome(input));
        input = "abcdedcba";
        System.out.println("Input String " + input + " is Palindrome: " + testObject.checkStringForPalindrome(input));
        checkInputForFizzBuzz(20);
    }
}