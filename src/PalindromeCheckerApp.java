/**
 * PalindromeChecker App
 * Version: 1.0
 * Description: Console-based application to validate palindrome strings.
 */


    public class PalindromeCheckerApp{

        public static void main(String[] args) {

            // Original string
            String original = "level";

            // Convert String to character array
            char[] characters = original.toCharArray();

            // Two-pointer variables
            int start = 0;
            int end = characters.length - 1;

            boolean isPalindrome = true;

            // Compare characters from both ends
            while (start < end) {
                if (characters[start] != characters[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            // Display result
            if (isPalindrome) {
                System.out.println(original + " is a Palindrome.");
            } else {
                System.out.println(original + " is NOT a Palindrome.");
            }
        }
    }
