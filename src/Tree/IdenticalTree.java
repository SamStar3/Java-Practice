package Tree;

public class IdenticalTree {

    boolean isIdentical(Node r1, Node r2) {
        // If both nodes are null, they are identical.
        if (r1 == null && r2 == null) {
            return true;
        }

        // If one node is null and the other is not, they are not identical.
        if (r1 == null || r2 == null) {
            return false;
        }

        // Check if the current nodes' data match and their subtrees are identical.
        return (r1.key == r2.key)
                && isIdentical(r1.left, r2.left)
                && isIdentical(r1.right, r2.right);
    }
    public static void main(String[] args) {
        // Create first tree
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        // Create second tree
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        // Create solution instance
        IdenticalTree solution = new IdenticalTree();

        // Check if the trees are identical
        boolean result = solution.isIdentical(root1, root2);
        System.out.println("Are the trees identical? " + result);

        // Test with another example
        root2.right.key = 4; // Change data to make the trees non-identical
        result = solution.isIdentical(root1, root2);
        System.out.println("Are the trees identical? " + result);
    }
}
