package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZag {

    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>(); // List to store the traversal result
        if (root == null) {
            return result; // If the tree is empty, return an empty list
        }

        Queue<Node> queue = new LinkedList<>(); // Queue for BFS traversal
        queue.add(root); // Add the root node to the queue
        boolean leftToRight = true; // Flag to track the direction of traversal

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at the current level
            ArrayList<Integer> level = new ArrayList<>(); // List to store the current level's nodes

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll(); // Remove the front node
                level.add(current.key); // Add the current node's value

                // Add left and right children to the queue if they exist
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            // Reverse the level list if the direction is right to left
            if (!leftToRight) {
                Collections.reverse(level);
            }

            result.addAll(level); // Add the current level to the result
            leftToRight = !leftToRight; // Toggle the direction for the next level
        }

        return result; // Return the final zig-zag traversal
    }



}
