/**
 * PalindromeChecker App
 * Version: 1.0
 * Description: Console-based application to validate palindrome strings.
 */


    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            // Original string
            String original = "racecar";

            // Empty string to store reversed result
            String reversed = "";

            // Reverse the string using for loop
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);
            }

            // Compare original and reversed using equals()
            if (original.equals(reversed)) {
                System.out.println(original + " is a Palindrome.");
            } else {
                System.out.println(original + " is NOT a Palindrome.");
            }
        }
    }
