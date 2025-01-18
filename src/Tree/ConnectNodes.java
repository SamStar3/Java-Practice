package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodes {

    static class Node {
        int data;
        Node left, right, nextRight;

        Node(int item) {
            data = item;
            left = right = nextRight = null;
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        // Use a queue for level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node prev = null;

            // Process each level
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                // Connect the previous node's nextRight to the current node
                if (prev != null) {
                    prev.nextRight = current;
                }
                prev = current;

                // Add children to the queue for the next level
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            // Set the nextRight of the last node in the current level to null
            if (prev != null) {
                prev.nextRight = null;
            }
        }

        return root;
    }

    // Helper method for printing the nextRight pointers
    public void printNextRight(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " -> ");
                if (current.nextRight != null) {
                    System.out.print(current.nextRight.data + " ");
                } else {
                    System.out.print("NULL ");
                }
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            System.out.println();
        }
    }

    // Driver code for testing
    public static void main(String[] args) {
        ConnectNodes solution = new ConnectNodes();

        // Example tree
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        solution.connect(root);
        solution.printNextRight(root);
        // Expected Output:
        // 10 -> NULL
        // 20 -> 30 -> NULL
        // 40 -> 60 -> NULL
    }
}
