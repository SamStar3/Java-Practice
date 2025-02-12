package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConvertLevel {

    static ArrayList<Integer> levelOrder(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.data);

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return result;
    }

    // Test the function
    public static void main(String[] args) {
        // Example 1
        Node root1 = new Node(5);
        root1.left = new Node(2);
        root1.right = new Node(7);
        root1.left.right = new Node(3);
        root1.right.right = new Node(8);

        System.out.println("Level Order Traversal: " + levelOrder(root1));

        // Example 2
        Node root2 = new Node(30);
        root2.left = new Node(10);
        root2.left.right = new Node(20);

        System.out.println("Level Order Traversal: " + levelOrder(root2));
    }
}
