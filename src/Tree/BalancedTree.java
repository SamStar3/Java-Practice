package Tree;

public class BalancedTree {

    private int checkHeight(Node root) {
        if (root == null) {
            return 0; // A null tree has height 0
        }

        // Recursively calculate the height of the left and right subtrees
        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);

        // If either subtree is unbalanced, propagate -1 upwards
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // -1 indicates the tree is not balanced
        }

        // Return the height of the current subtree
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Main function to check if the tree is height-balanced
    public boolean isBalanced(Node root) {
        return checkHeight(root) != -1; // If -1 is returned, the tree is unbalanced
    }
}
