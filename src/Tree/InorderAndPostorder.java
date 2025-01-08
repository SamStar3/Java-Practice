package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InorderAndPostorder {
    public Node createTree(int parent[]) {
        int n = parent.length;
        Node[] nodes = new Node[n];
        Node root = null;

        // Create nodes for each index
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }

        // Build the tree using the parent array
        for (int i = 0; i < n; i++) {
            if (parent[i] == -1) {
                root = nodes[i]; // Root node
            } else {
                Node parentNode = nodes[parent[i]];

                // Assign left or right child based on availability
                if (parentNode.left == null) {
                    parentNode.left = nodes[i];
                } else {
                    parentNode.right = nodes[i];
                }
            }
        }

        return root;
    }

    // Function to perform level order traversal
    public void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.key + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }


    public static void main(String[] args) {
        InorderAndPostorder solution = new InorderAndPostorder();

        // Example input
        int[] parent = {-1, 0, 0, 1, 1, 3, 5};

        // Create the tree
        Node root = solution.createTree(parent);

        solution.levelOrder(root);
    }
}
