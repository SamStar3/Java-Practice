package Deque;

import java.util.Iterator;
import java.util.ArrayDeque;

public class DequeTraversal {

    public static void printDeque(ArrayDeque<Integer> deq) {
        Iterator<Integer> it = deq.iterator();

        // Traverse and print elements using the iterator
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // Print a newline at the end
        System.out.println();
    }
}
