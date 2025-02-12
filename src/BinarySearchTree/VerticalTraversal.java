package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalTraversal {

    static ArrayList<Integer> verticalOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // Map to store horizontal distance -> List of nodes
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

        // Queue for level order traversal
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair temp = queue.poll();
            Node node = temp.node;
            int hd = temp.hd;

            // Store node at its respective horizontal distance
            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(node.data);

            // Process left and right children
            if (node.left != null) queue.add(new Pair(node.left, hd - 1));
            if (node.right != null) queue.add(new Pair(node.right, hd + 1));
        }

        // Extract elements in sorted order of horizontal distance
        for (ArrayList<Integer> list : map.values()) {
            result.addAll(list);
        }

        return result;
    }

    // Helper class to store node with its horizontal distance
    static class Pair {
        Node node;
        int hd;
        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    // Helper function to print result
    public static void printList(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
              1
            /   \
           2     3
         /   \     \
        4     5     6
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        ArrayList<Integer> result = verticalOrder(root);
        System.out.println("Vertical Order Traversal:");
        printList(result);
    }
}
