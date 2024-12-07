package Deque;

import java.util.ArrayDeque;
public class RotateDequeByK {

    public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int k) {
        // Your code here
        int n = deque.size();
        k = k % n;
        for(int i = 0; i < k; i++){
            deque.addLast(deque.removeFirst());
        }
    }

    public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int k) {
        // Your code here

        int n = deque.size();
        k = k % n;
        for(int i = 0; i < k; i++){
            deque.addFirst(deque.removeLast());
        }
    }
}
