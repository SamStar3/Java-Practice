package BinarySearchTree;

import java.util.ArrayList;

public class InorderTraversal {

    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    // Helper function to perform the in-order traversal.
    void inOrderTraversal(Node root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        // Traverse the left subtree.
        inOrderTraversal(root.left, result);
        // Visit the current node.
        result.add(root.data);
        // Traverse the right subtree.
        inOrderTraversal(root.right, result);
    }
    public static void main(String[] args) {

        InorderTraversal tree = new InorderTraversal();

        // Creating the BST.
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.right = new Node(3);
        root.right.right = new Node(8);

        // Performing in-order traversal.
        ArrayList<Integer> result = tree.inOrder(root);
        System.out.println(result);
    }
}
