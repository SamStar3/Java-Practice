package StackDSA;

import java.util.Stack;

public class RemovingDuplicates2 {

    public static String removePair(String str) {
        // Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Traverse the string character by character.
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // If the stack is empty or the top element is not equal to the current character,
            // push the current character onto the stack.
            if (!stack.isEmpty() && stack.peek() == currentChar) {
                // If the top element is equal to the current character, pop it to remove the pair.
                stack.pop();
            } else {
                // Push the current character to the stack.
                stack.push(currentChar);
            }
        }

        // If the stack is empty, return "Empty String".
        if (stack.isEmpty()) {
            return "Empty String";
        }

        // Otherwise, construct the resulting string from the stack.
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    // Driver code for testing the solution
    public static void main(String[] args) {
        // Example 1
        String input1 = "aaabbaaccd";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + removePair(input1));

        // Example 2
        String input2 = "aaaa";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + removePair(input2));
    }
}
