package BinarySearchTree;

public class FixingNodes {

    Node first, middle, last, prev;

    void correctBST(Node root) {
        first = middle = last = prev = null;
        inorder(root);

        // Case 1: Non-adjacent swapped nodes
        if (first != null && last != null) {
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
        }
        // Case 2: Adjacent swapped nodes
        else if (first != null && middle != null) {
            int temp = first.data;
            first.data = middle.data;
            middle.data = temp;
        }
    }

    void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);

        if (prev != null && root.data < prev.data) {
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }

        prev = root;
        inorder(root.right);
    }
    void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
    public static void main(String[] args) {


        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(20);

        System.out.println("Before correction (Inorder Traversal):");
        FixingNodes solution = new FixingNodes();
        solution.printInorder(root);
        System.out.println();

        solution.correctBST(root);

        System.out.println("After correction (Inorder Traversal):");
        solution.printInorder(root);
    }
}
