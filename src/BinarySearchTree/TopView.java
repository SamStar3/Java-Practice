package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {

    static ArrayList<Integer> topView(Node root) {
        // List to store the result
        ArrayList<Integer> result = new ArrayList<>();

        // Base case: If the tree is empty
        if (root == null) {
            return result;
        }

        // Map to store the first node at each horizontal distance (hd)
        TreeMap<Integer, Integer> topViewMap = new TreeMap<>();

        // Queue for level order traversal (stores pairs of nodes and their horizontal distance)
        Queue<Pair> queue = new LinkedList<>();

        // Start with the root node at horizontal distance 0
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            // Remove the front element from the queue
            Pair current = queue.poll();
            Node currentNode = current.node;
            int hd = current.hd;

            // If this horizontal distance is not already in the map, add it
            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, currentNode.data);
            }

            // Add the left child to the queue with horizontal distance - 1
            if (currentNode.left != null) {
                queue.add(new Pair(currentNode.left, hd - 1));
            }

            // Add the right child to the queue with horizontal distance + 1
            if (currentNode.right != null) {
                queue.add(new Pair(currentNode.right, hd + 1));
            }
        }

        // Extract the values from the TreeMap (sorted by horizontal distance)
        for (int value : topViewMap.values()) {
            result.add(value);
        }

        return result;
    }

    // Helper class to store a node and its horizontal distance
    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}
