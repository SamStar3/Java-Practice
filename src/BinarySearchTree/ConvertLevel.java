package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConvertLevel {

    public Node constructBST(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        // Queue to store nodes and their permissible value range
        Queue<Pair> queue = new LinkedList<>();
        Node root = new Node(arr[0]);
        queue.add(new Pair(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        int index = 1;
        while (index < arr.length) {
            Pair current = queue.poll();
            Node currentNode = current.node;
            int min = current.min;
            int max = current.max;

            // Add left child if it exists and is within the range
            if (index < arr.length && arr[index] > min && arr[index] < currentNode.data) {
                currentNode.left = new Node(arr[index]);
                queue.add(new Pair(currentNode.left, min, currentNode.data));
                index++;
            }

            // Add right child if it exists and is within the range
            if (index < arr.length && arr[index] > currentNode.data && arr[index] < max) {
                currentNode.right = new Node(arr[index]);
                queue.add(new Pair(currentNode.right, currentNode.data, max));
                index++;
            }
        }

        return root;
    }

    // Utility function to perform preorder traversal
    public void preorderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    // Helper class to store node and its permissible range
    class Pair {
        Node node;
        int min, max;

        Pair(Node node, int min, int max) {
            this.node = node;
            this.min = min;
            this.max = max;
        }
    }

    // Driver code to test the implementation
    public static void main(String[] args) {
        ConvertLevel gfg = new ConvertLevel();

        // Example 1
        int[] arr1 = {7, 4, 12, 3, 6, 8, 1, 5, 10};
        Node root1 = gfg.constructBST(arr1);
        System.out.print("Preorder Traversal: ");
        gfg.preorderTraversal(root1); // Output: 7 4 3 1 6 5 12 8 10

        System.out.println();

        // Example 2
        int[] arr2 = {1, 3, 4, 6, 7, 8};
        Node root2 = gfg.constructBST(arr2);
        System.out.print("Preorder Traversal: ");
        gfg.preorderTraversal(root2); // Output: 1 3 4 6 7 8
    }
}
