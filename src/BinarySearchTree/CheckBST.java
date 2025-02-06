package BinarySearchTree;

import java.util.Scanner;

public class CheckBST {

    Node prev = null;

    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        return isBSTUtil(root);
    }

    // Helper function to perform inorder traversal and check BST property
    boolean isBSTUtil(Node root) {
        if (root == null) {
            return true;
        }

        // Left subtree check
        if (!isBSTUtil(root.left)) {
            return false;
        }

        // Current node check (should be greater than previous)
        if (prev != null && root.data <= prev.data) {
            return false;
        }
        prev = root;

        // Right subtree check
        return isBSTUtil(root.right);
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

        CheckBST obj = new CheckBST();
        boolean result = obj.isBST(root);

        System.out.println("Is the given tree a BST? " + result);
        sc.close();
    }
}
