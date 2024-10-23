package StackDSA;

import java.util.Stack;

public class MaxOfMinWindow {

    static int[] maxOfMin(int[] arr, int n) {
        // Arrays to store the index of previous and next smaller elements.
        int[] left = new int[n];  // previous smaller element
        int[] right = new int[n]; // next smaller element

        // Stack to find previous and next smaller elements.
        Stack<Integer> s = new Stack<>();

        // Initializing previous smaller and next smaller.
        // For the left array, initialize left[i] = -1 (means no smaller element to the left).
        for (int i = 0; i < n; i++) {
            left[i] = -1;
        }
        // For the right array, initialize right[i] = n (means no smaller element to the right).
        for (int i = 0; i < n; i++) {
            right[i] = n;
        }

        // Fill left array (previous smaller element for each element).
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                left[i] = s.peek();
            }
            s.push(i);
        }

        // Clear the stack to reuse it for the next smaller elements.
        s.clear();

        // Fill right array (next smaller element for each element).
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                right[s.peek()] = i;
                s.pop();
            }
            s.push(i);
        }

        // Create an array to store the result (maximum of minimums for every window size).
        int[] result = new int[n + 1];  // result[i] will store the maximum of minimums of window size 'i'

        // Fill the result array using the left and right arrays.
        for (int i = 0; i < n; i++) {
            // Length of the window where arr[i] is the minimum
            int len = right[i] - left[i] - 1;
            // Update the result for this window size.
            result[len] = Math.max(result[len], arr[i]);
        }

        // Some entries in result[] might be empty (0), so we need to fill them.
        for (int i = n - 1; i >= 1; i--) {
            result[i] = Math.max(result[i], result[i + 1]);
        }

        // Since result[] is 1-based (result[1] holds max of min for window size 1), ignore result[0].
        int[] ans = new int[n];
        for (int i = 1; i <= n; i++) {
            ans[i - 1] = result[i];
        }

        return ans;
    }
}
