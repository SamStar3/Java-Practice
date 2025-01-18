package Tree;

public class DiameterTree {
    static class Height {
        int value = 0;
    }

    // Function to calculate the diameter of the binary tree
    public int diameter(Node root) {
        // Create a Height object to store the diameter
        Height diameter = new Height();
        calculateHeight(root, diameter);
        return diameter.value;
    }

    // Helper function to calculate the height of the tree and update the diameter
    private int calculateHeight(Node node, Height diameter) {
        if (node == null) {
            return 0; // Base case: height of an empty tree is 0
        }

        // Recursively calculate the height of the left and right subtrees
        int leftHeight = calculateHeight(node.left, diameter);
        int rightHeight = calculateHeight(node.right, diameter);

        // Update the diameter: maximum of current diameter and path through this node
        diameter.value = Math.max(diameter.value, leftHeight + rightHeight);

        // Return the height of the subtree rooted at this node
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Driver code for testing
    public static void main(String[] args) {
        DiameterTree solution = new DiameterTree();

        // Example tree
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        // Output the diameter
        System.out.println(solution.diameter(root)); // Expected Output: 3
    }
}
