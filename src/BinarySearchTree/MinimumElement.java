package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumElement {

    int minValue(Node root) {
        // If the root is null, there is no minimum value.
        if (root == null) {
            return -1; // Or any indication of an empty tree
        }

        // The minimum value in a BST is located at the leftmost node.
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }

        // Return the value of the leftmost node.
        return current.data;
    }
}
