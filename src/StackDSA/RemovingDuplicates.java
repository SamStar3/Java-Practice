package StackDSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemovingDuplicates {

    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here

        StringBuilder result = new StringBuilder();

        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);


            if(stack.isEmpty() || stack.peek() != x) {
                stack.push(x);
                result.append(x);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String input1 = "aaaaaabaabccccccc";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + removeConsecutiveDuplicates(input1));

        // Example 2
        String input2 = "abbccbcd";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + removeConsecutiveDuplicates(input2));
    }
}
