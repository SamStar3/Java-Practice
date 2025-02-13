package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // TreeMap to store the bottom view (key: HD, value: node's data)
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // Queue for level-order traversal (stores node and its HD)
        Queue<Pair> queue = new LinkedList<>();

        // Initialize the queue with the root node and HD = 0
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            Node node = current.node;
            int hd = current.hd;

            // Update the map with the current node (bottom-most node at this HD)
            map.put(hd, node.data);

            // Add left and right children to the queue with updated HD
            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }

        // Add the values from the map to the result list
        for (int value : map.values()) {
            result.add(value);
        }

        return result;
    }

    // Helper class to store a node and its horizontal distance
    static class Pair {
        Node node;
        int hd;

        public Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        BottomView solution = new BottomView();
        ArrayList<Integer> bottomView = solution.bottomView(root);
        System.out.println(bottomView); // Output: [5, 10, 14, 4, 25]
    }
}
