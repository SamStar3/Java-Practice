package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class InsertNode {

    Node insert(Node root, int Key) {
        if (root == null) {
            return new Node(Key);
        }
        if (Key < root.data) {
            root.left = insert(root.left, Key);
        } else if (Key > root.data) {
            root.right = insert(root.right, Key);
        }
        return root;
    }

    // Helper function to generate in-order traversal.
    void inorderTraversal(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, result);
        result.add(root.data);
        inorderTraversal(root.right, result);
    }

    // Function to test the insertion.
    public static void main(String[] args) {
        InsertNode solution = new InsertNode();

        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);

        int key = 4;
        root = solution.insert(root, key);

        List<Integer> result = new ArrayList<>();
        solution.inorderTraversal(root, result);

        System.out.println(result); // Output: [1, 2, 3, 4]
    }
}
