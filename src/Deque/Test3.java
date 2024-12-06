package Deque;

import java.util.ArrayDeque;
public class Test3 {

    public static ArrayDeque<Integer> deque_Init(int arr[], int n) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            deque.addLast(arr[i]);
        }

        return deque;
    }
}
