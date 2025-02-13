package BinarySearchTree;

public class GetCount {
    int getCount(Node root, int l, int h) {
        // Base case: If the tree is empty
        if (root == null) {
            return 0;
        }

        // If the current node's value lies within the range
        if (root.data >= l && root.data <= h) {
            // Count this node and check in both left and right subtrees
            return 1 + getCount(root.left, l, h) + getCount(root.right, l, h);
        }

        // If the current node's value is smaller than l, ignore the left subtree
        if (root.data < l) {
            return getCount(root.right, l, h);
        }

        // If the current node's value is greater than h, ignore the right subtree
        return getCount(root.left, l, h);
    }
}
