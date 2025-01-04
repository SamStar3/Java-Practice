package Tree;

public class TreeToDLL {
    Node prev = null;

    // Function to convert binary tree to doubly linked list and return its head
    Node bToDLL(Node root) {
        // Base case: If the tree is empty, return null
        if (root == null) {
            return null;
        }

        // Pointer to store the head of the DLL
        Node head = null;

        // Convert the left subtree and find the head of the DLL
        head = bToDLL(root.left);

        // If prev is null, it means this is the leftmost node (head of DLL)
        if (prev == null) {
            head = root; // Set the current node as the head
        } else {
            // Link the current node with the previous node
            prev.right = root;
            root.left = prev;
        }

        // Update the previous pointer to the current node
        prev = root;

        // Convert the right subtree
        bToDLL(root.right);

        // Return the head of the DLL
        return head;
    }

    public static void main(String[] args){

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        TreeToDLL sol = new TreeToDLL();
        Node head = sol.bToDLL(root);

// Print the DLL
        Node current = head;
        while (current != null) {
            System.out.print(current.key + " ");
            current = current.right;
        }

    }
}
