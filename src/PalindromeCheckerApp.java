/**
 * PalindromeChecker App
 * Version: 1.0
 * Description: Console-based application to validate palindrome strings.
 */


import java.util.Stack;

    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            // Original string
            String original = "malayalam";

            // Create Stack
            Stack<Character> stack = new Stack<>();

            // Push characters into stack
            for (int i = 0; i < original.length(); i++) {
                stack.push(original.charAt(i));
            }

            boolean isPalindrome = true;

            // Pop characters and compare
            for (int i = 0; i < original.length(); i++) {
                char poppedChar = stack.pop();

                if (original.charAt(i) != poppedChar) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print result
            if (isPalindrome) {
                System.out.println(original + " is a Palindrome.");
            } else {
                System.out.println(original + " is NOT a Palindrome.");
            }
        }
    }