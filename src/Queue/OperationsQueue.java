package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class OperationsQueue {

    void enqueue(Queue<Integer> q, int x) {
        q.add(x);  // Adds element x to the rear of the queue
    }

    // Function to remove front element from queue.
    void dequeue(Queue<Integer> q) {
        if (!q.isEmpty()) {
            q.remove();  // Removes the front element from the queue
        }
    }

    // Function to find the front element of queue.
    int front(Queue<Integer> q) {
        return q.isEmpty() ? -1 : q.peek();  // Returns front element or -1 if queue is empty
    }

    // Function to find an element in the queue.
    String find(Queue<Integer> q, int x) {
        return q.contains(x) ? "Yes" : "No";  // Returns "Yes" if x is found, else "No"
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperationsQueue solution = new OperationsQueue();
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter the number of queries: ");
        int Q = sc.nextInt();

        // Processing each query
        for (int i = 0; i < Q; i++) {
            String queryType = sc.next();

            switch (queryType) {
                case "i":
                    int x = sc.nextInt();
                    solution.enqueue(queue, x);
                    break;
                case "r":
                    solution.dequeue(queue);
                    break;
                case "h":
                    System.out.println(solution.front(queue));
                    break;
                case "f":
                    int y = sc.nextInt();
                    System.out.println(solution.find(queue, y));
                    break;
            }
        }

        sc.close();
    }
}
