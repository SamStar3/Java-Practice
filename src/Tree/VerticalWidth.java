package Tree;

import java.util.TreeSet;

public class VerticalWidth {

    public int verticalWidth(Node root) {
        if (root == null) {
            return 0;
        }

        TreeSet<Integer> horizontalDistances = new TreeSet<>();

        calculateHorizontalDistances(root, 0, horizontalDistances);

        return horizontalDistances.size();
    }

    private void calculateHorizontalDistances(Node node, int hd, TreeSet<Integer> set) {
        if (node == null) {
            return;
        }

        set.add(hd);

        calculateHorizontalDistances(node.left, hd - 1, set);
        calculateHorizontalDistances(node.right, hd + 1, set);
    }

    public static void main(String[] args) {
        // Construct the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);

        // Create the Tree object and calculate vertical width
        VerticalWidth tree = new VerticalWidth();
        int width = tree.verticalWidth(root);

        // Print the result
        System.out.println("Vertical Width of the tree: " + width); // Expected Output: 6
    }
}
