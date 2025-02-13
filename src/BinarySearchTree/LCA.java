package BinarySearchTree;

public class LCA {

    Node LCA(Node root, Node n1, Node n2) {
        // Base case: If the root is null, there is no LCA
        if (root == null) {
            return null;
        }

        // If both n1 and n2 are smaller than root, LCA lies in the left subtree
        if (n1.data < root.data && n2.data < root.data) {
            return LCA(root.left, n1, n2);
        }

        // If both n1 and n2 are greater than root, LCA lies in the right subtree
        if (n1.data > root.data && n2.data > root.data) {
            return LCA(root.right, n1, n2);
        }

        // If one node is on the left and the other is on the right (or one of them equals root), root is the LCA
        return root;
    }
}
