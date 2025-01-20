package Tree;

public class SubTreeSum {

    private int count = 0;

    // Function to count the number of subtrees with a given sum X
    int countSubtreesWithSumX(Node root, int X)
    {
        // Perform the subtree sum calculation
        calculateSubtreeSum(root, X);
        // Return the final count
        return count;
    }

    // Helper function to calculate the sum of the subtree rooted at 'node'
    private int calculateSubtreeSum(Node node, int X)
    {
        // Base case: if the node is null, return 0
        if (node == null) {
            return 0;
        }

        // Calculate the sum of the left and right subtrees
        int leftSum = calculateSubtreeSum(node.left, X);
        int rightSum = calculateSubtreeSum(node.right, X);

        // Calculate the total sum for the current subtree
        int totalSum = leftSum + rightSum + node.key;

        // Check if the total sum equals the target sum X
        if (totalSum == X) {
            count++;
        }

        // Return the total sum of the current subtree to the parent
        return totalSum;
    }
}
