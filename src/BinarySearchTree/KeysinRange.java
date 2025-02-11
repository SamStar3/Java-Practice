package BinarySearchTree;

import java.util.ArrayList;

public class KeysinRange {

    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        ArrayList<Integer> result = new ArrayList<>();
        inorderTraversal(root, low, high, result);
        return result;
    }

    private static void inorderTraversal(Node root, int low, int high, ArrayList<Integer> result) {
        if (root == null) return;

        // Traverse left subtree only if root's value is greater than low
        if (root.data > low) {
            inorderTraversal(root.left, low, high, result);
        }

        // If root's value is within range, add to result
        if (root.data >= low && root.data <= high) {
            result.add(root.data);
        }

        // Traverse right subtree only if root's value is less than high
        if (root.data < high) {
            inorderTraversal(root.right, low, high, result);
        }
    }

    // Helper function to print the list
    public static void printList(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
              BST:
                   17
                 /    \
                4     18
              /   \
             2     9
            l = 4, h = 24
        */
        Node root = new Node(17);
        root.left = new Node(4);
        root.right = new Node(18);
        root.left.left = new Node(2);
        root.left.right = new Node(9);

        int low = 4, high = 24;

        ArrayList<Integer> result = printNearNodes(root, low, high);
        System.out.println("Numbers in Range [" + low + ", " + high + "]:");
        printList(result);
    }
}
