package Deque;

import java.util.ArrayDeque;
public class RotateDequeByK {

    public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int k) {
        int n = deque.size();
        k = k % n; // Normalize k to avoid unnecessary full rotations
        for (int i = 0; i < k; i++) {
            // Remove the first element and add it to the back
            deque.addLast(deque.removeFirst());
        }
    }

    // Function to rotate deque right by k places
    public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int k) {
        int n = deque.size();
        k = k % n; // Normalize k to avoid unnecessary full rotations
        for (int i = 0; i < k; i++) {
            // Remove the last element and add it to the front
            deque.addFirst(deque.removeLast());
        }
    }
}
