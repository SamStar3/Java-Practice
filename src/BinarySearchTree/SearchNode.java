package BinarySearchTree;

import Tree.BinaryTree;

public class SearchNode {

    static class Node {
        int data;
        Node left, right;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    boolean search(Node root, int x) {
        if (root == null) {
            return false;
        }
        if (root.data == x) {
            return true;
        }
        if (x < root.data) {
            return search(root.left, x);
        }
        return search(root.right, x);
    }

    public static void main(String[] args) {
        // Create a BST manually
        Node root = new Node(2);
        root.right = new Node(81);
        root.right.left = new Node(42);
        root.right.right = new Node(87);
        root.right.left.right = new Node(66);
        root.right.left.right.left = new Node(45);
        root.right.right.right = new Node(90);

        // Create an instance of BST
        SearchNode bst = new SearchNode();

        // Test cases
        int x1 = 87; // Node to search for
        int x2 = 11; // Node to search for

        // Search for x1
        if (bst.search(root, x1)) {
            System.out.println(x1 + " is present in the BST.");
        } else {
            System.out.println(x1 + " is not present in the BST.");
        }

        // Search for x2
        if (bst.search(root, x2)) {
            System.out.println(x2 + " is present in the BST.");
        } else {
            System.out.println(x2 + " is not present in the BST.");
        }
    }
}
