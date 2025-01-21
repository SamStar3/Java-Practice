package Tree;

import java.util.ArrayList;

public class NonAdjacent {

    static int getMaxSum(Node root) {
        // Helper function to calculate the maximum sum for each node.
        int[] result = solve(root);
        // The result is the maximum of including or excluding the root.
        return Math.max(result[0], result[1]);
    }

    // Helper function to calculate the include and exclude values.
    private static int[] solve(Node node) {
        // Base case: if the node is null, both include and exclude are 0.
        if (node == null) {
            return new int[]{0, 0};
        }

        // Recursively calculate for left and right subtrees.
        int[] left = solve(node.left);
        int[] right = solve(node.right);

        // Include the current node: node's value + exclude from left and right.
        int include = node.key + left[1] + right[1];

        int exclude = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{include, exclude};
    }

    public static void main(String[] args) {
        // Constructing the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        NonAdjacent solution = new NonAdjacent();
        System.out.println("Maximum Sum of Non-Adjacent Nodes: " + solution.getMaxSum(root));
    }
}
