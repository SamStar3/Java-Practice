package Tree;

public class Ancestor {

    int maxDiff(Node root) {
        // Helper function to calculate the maximum difference recursively.
        return maxDiffUtil(root, root.key);
    }

    // Utility function to find the maximum difference between node and ancestor.
    private int maxDiffUtil(Node node, int ancestorMin) {
        // Base case: if the node is null, return a very small value.
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        // Calculate the difference between the current node's value and the minimum ancestor value.
        int currentDiff = node.key - ancestorMin;

        // Update the minimum ancestor value for the left and right subtrees.
        ancestorMin = Math.min(ancestorMin, node.key);

        // Recur for left and right subtrees.
        int leftDiff = maxDiffUtil(node.left, ancestorMin);
        int rightDiff = maxDiffUtil(node.right, ancestorMin);

        // Return the maximum of the current difference, left subtree difference, and right subtree difference.
        return Math.max(currentDiff, Math.max(leftDiff, rightDiff));
    }

    // Driver code for testing
    public static void main(String[] args) {
        Ancestor tree = new Ancestor();

        // Create a sample binary tree.
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(1);

        // Output: 4
        System.out.println(tree.maxDiff(root));

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(7);

        // Output: -1
        System.out.println(tree.maxDiff(root));
    }
}
