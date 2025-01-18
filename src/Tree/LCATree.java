package Tree;

public class LCATree {
    Node lca(Node root, int n1, int n2) {
        // Base case: if root is null or matches one of the nodes, return root.
        if (root == null || root.key == n1 || root.key == n2) {
            return root;
        }

        // Recur for left and right subtrees.
        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);

        // If both left and right are non-null, root is the LCA.
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // Otherwise, return the non-null node.
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    // Driver code for testing.
    public static void main(String[] args) {
        LCATree solution = new LCATree();

        // Example tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Test cases
        System.out.println(solution.lca(root, 5, 6).key); // Expected Output: 1
        System.out.println(solution.lca(root, 3, 4).key); // Expected Output: 1
        System.out.println(solution.lca(root, 2, 4).key); // Expected Output: 2
    }
}
