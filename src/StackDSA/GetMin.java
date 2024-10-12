package StackDSA;

import java.util.Stack;

public class GetMin {

    public static Stack<Integer> _push(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();  // Main stack
        Stack<Integer> minStack = new Stack<>();  // Auxiliary stack to store min elements

        // Pushing elements to both stack and minStack
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);

            // Push the minimum element in the minStack
            if (minStack.isEmpty()) {
                minStack.push(arr[i]);
            } else {
                // Push the smaller of the current element and the top of minStack
                minStack.push(Math.min(arr[i], minStack.peek()));
            }
        }

        return minStack;  // Return the minStack to track minimums at pop time
    }

    // Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer> minStack) {
        // Print minimum at each pop
        while (!minStack.isEmpty()) {
            System.out.print(minStack.pop() + " ");
        }
        System.out.println();
    }

    // Test the solution
    public static void main(String[] args) {
        // Test case 1
        int arr1[] = {20, 59, 42, 94, 12, 46, 51, 40, 67, 41, 7, 56};
        Stack<Integer> minStack1 = _push(arr1, arr1.length);
        _getMinAtPop(minStack1);  // Output: 7 7 12 12 12 12 12 12 20 20 20 20

        // Test case 2
        int arr2[] = {1, 6, 43, 1, 2, 0, 5};
        Stack<Integer> minStack2 = _push(arr2, arr2.length);
        _getMinAtPop(minStack2);  // Output: 0 0 1 1 1 1 1
    }
}
