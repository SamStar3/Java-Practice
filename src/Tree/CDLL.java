package Tree;

public class CDLL {

    Node head = null;
    Node prev = null;
    Node bTreeToClist(Node root) {
        if (root == null) {
            return null;
        }

        // Perform in-order traversal and build the CDLL
        convertToCDLL(root);

        // Make the list circular by linking head and the last node (prev)
        head.left = prev; // Head's left points to the last node
        prev.right = head; // Last node's right points to the head

        return head;
    }

    // Helper function to perform in-order traversal and build the CDLL
    private void convertToCDLL(Node curr) {
        if (curr == null) {
            return;
        }

        // Recur for the left subtree
        convertToCDLL(curr.left);

        // Process the current node
        if (head == null) {
            // First node becomes the head
            head = curr;
        } else {
            // Link the previous node with the current node
            prev.right = curr;
            curr.left = prev;
        }

        // Update prev to the current node
        prev = curr;

        // Recur for the right subtree
        convertToCDLL(curr.right);
    }
}
