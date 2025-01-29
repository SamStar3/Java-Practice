package BinarySearchTree;

public class DeletionBST {

    public static Node deleteNode(Node root, int x) {
        // Base case: If the tree is empty
        if (root == null) {
            return root;
        }

        // Recursive calls for ancestors of the node to be deleted
        if (x < root.data) {
            root.left = deleteNode(root.left, x);
        } else if (x > root.data) {
            root.right = deleteNode(root.right, x);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    // Function to find the minimum value in a given tree
    static int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Function for inorder traversal of the BST
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.right = new Node(8);
        root.right.right.left = new Node(5);
        root.right.right.right = new Node(11);

        // Example usage
        int x = 11; // Node to delete
        root = DeletionBST.deleteNode(root, x);
        DeletionBST.inorder(root);
    }
}
