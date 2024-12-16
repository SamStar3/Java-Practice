package Tree;

public class SubTree {
    public static boolean isSubtree(Node T, Node S) {
        // Base cases
        if (S == null) {
            return true; // An empty tree is always a subtree
        }
        if (T == null) {
            return false; // If T is empty and S is not, S cannot be a subtree
        }

        // Check if the current trees rooted at T and S are identical
        if (areIdentical(T, S)) {
            return true;
        }

        // Recursively check in the left and right subtrees of T
        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }

    // Helper function to check if two trees are identical
    private static boolean areIdentical(Node T, Node S) {
        // Base cases
        if (T == null && S == null) {
            return true; // Both trees are empty
        }
        if (T == null || S == null) {
            return false; // One of the trees is empty
        }

        // Check if the data of the current nodes match and if the subtrees match
        return (T.key == S.key) && areIdentical(T.left, S.left) && areIdentical(T.right, S.right);
    }

}
