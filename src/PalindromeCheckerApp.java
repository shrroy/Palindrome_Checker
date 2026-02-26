/**
 * PalindromeChecker App
 * Version: 1.0
 * Description: Console-based application to validate palindrome strings.
 */


    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            // Hardcoded string (String Literal)
            String word = "malayalam";

            // Variable to store reversed string
            String reversed = "";

            // Reverse the string using loop
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }

            // Check palindrome using if-else condition
            if (word.equals(reversed)) {
                System.out.println(word + " is a Palindrome.");
            } else {
                System.out.println(word + " is NOT a Palindrome.");
            }

            System.out.println("Program Ended.");
        }
    }
