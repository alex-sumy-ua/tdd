package org.example;

public class StringManipulator {
    public String reverseString(String input) {
        // TODO: Implement the logic to reverse the input string
        if (input.isEmpty() || input.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(input.length() - i - 1));
        }
        return sb.toString();
    }

    public boolean isPalindrome(String input) {
        // TODO: Implement the logic to check if the input string is a palindrome
        // (A palindrome = same forwards as backwards)
        boolean result = false;
        return input.equals(reverseString(input));
    }

}
