package BinarySearchTree;

import java.util.ArrayList;

public class Preorder {
    private int index = 0;

    // Function that constructs BST from its preorder traversal.
    public Node Bst(int[] pre, int size) {
        return constructBST(pre, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Helper function to construct the BST
    private Node constructBST(int[] pre, int min, int max) {
        // Base case: if index is out of bounds or the value is not in range
        if (index >= pre.length || pre[index] < min || pre[index] > max) {
            return null;
        }

        // Create a new node with the current value
        int val = pre[index++];
        Node root = new Node(val);

        // Recursively build the left and right subtrees
        root.left = constructBST(pre, min, val);
        root.right = constructBST(pre, val, max);

        return root;
    }
    public static void main(String[] args) {
        Preorder solution = new Preorder();

        // Example 1
        int[] arr1 = {40, 30, 35, 80, 100};
        Node root1 = solution.Bst(arr1, arr1.length);
        ArrayList<Integer> result1 = new ArrayList<>();
        System.out.println(result1); // Output: [35, 30, 100, 80, 40]

        // Example 2
        int[] arr2 = {40, 30, 32, 35, 80, 90, 100, 120};
        Node root2 = solution.Bst(arr2, arr2.length);
        ArrayList<Integer> result2 = new ArrayList<>();
        System.out.println(result2); // Output: [35, 32, 30, 120, 100, 90, 80, 40]
    }
}
