package BinarySearchTree;

import java.util.Scanner;

public class ClosestBST {

    static int minDiff(Node root, int K) {
        int minDiff = Integer.MAX_VALUE;

        while (root != null) {
            // Update the minimum absolute difference
            minDiff = Math.min(minDiff, Math.abs(root.data - K));

            // Move left if K is smaller, right if K is larger
            if (K < root.data) {
                root = root.left;
            } else if (K > root.data) {
                root = root.right;
            } else {
                // Exact match found, return 0
                return 0;
            }
        }
        return minDiff;
    }
    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Main method for testing
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node root = null;
        System.out.println("Enter the nodes:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        System.out.print("Enter the value of K: ");
        int K = sc.nextInt();

        int result = minDiff(root, K);
        System.out.println("Minimum Absolute Difference: " + result);

        sc.close();
    }
}
