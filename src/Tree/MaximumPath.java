package Tree;

public class MaximumPath {
    private int maxSum = Integer.MIN_VALUE;

    // Function to return the maximum path sum
    int findMaxSum(Node node) {
        calculateMaxPathSum(node);
        return maxSum;
    }

    // Helper function to calculate the maximum path sum from any node
    private int calculateMaxPathSum(Node node) {
        if (node == null) {
            return 0; // Base case: no path sum for a null node
        }

        // Recursively calculate the maximum path sum for the left and right subtrees
        int leftMax = Math.max(0, calculateMaxPathSum(node.left)); // Ignore negative paths
        int rightMax = Math.max(0, calculateMaxPathSum(node.right)); // Ignore negative paths

        // Update the maximum path sum using the path through this node
        maxSum = Math.max(maxSum, leftMax + rightMax + node.key);

        // Return the maximum path sum that includes this node and one subtree
        return node.key + Math.max(leftMax, rightMax);
    }

    // Driver code for testing
    public static void main(String[] args) {

        MaximumPath solution = new MaximumPath();

        // Example tree
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        // Output the maximum path sum
        System.out.println(solution.findMaxSum(root)); // Expected Output: 42
    }
}
