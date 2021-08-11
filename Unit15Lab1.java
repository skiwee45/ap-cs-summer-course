public class Unit15Lab1 {
    public static void main(String[] args) {
        String palindrome = "a man a plan a canal panama";
        System.out.printf("%nString: \"%s\"\tIs Palindrome: %b", palindrome, testPalindrome(palindrome));
        String notPalindrome = "this is not a palindrome";
        System.out.printf("%nString: \"%s\"\tIs Palindrome: %b", notPalindrome, testPalindrome(notPalindrome));
    }

    //input must be a non-empty string, all spaces will be removed
    //output is whether or not the input is a palindrome, disregarding spaces
    public static boolean testPalindrome(String str) {
        String temp = str.replace(" ", "");
        return checkPalindrome(temp);
    }

    //input must be non-empty string
    //returns whether or not input is a palindrome
    private static boolean checkPalindrome(String str) {
        if (str.length() == 1) {
            return true;
        }

        if (str.length() == 2) {
            return (str.charAt(0) == str.charAt(str.length() - 1));
        }

        return (str.charAt(0) == str.charAt(str.length() - 1)) && checkPalindrome(str.substring(1, str.length() - 1));
    }
}
