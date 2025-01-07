package Tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructTree {
    Node buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }
        // Create a hashmap to store the index of each value in the inorder array
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        // Start building the tree recursively
        return buildTreeHelper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, inorderMap);
    }

    private Node buildTreeHelper(int[] inorder, int inStart, int inEnd,
                                 int[] postorder, int postStart, int postEnd,
                                 Map<Integer, Integer> inorderMap) {
        // Base case: if there are no elements to construct the tree
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }

        // The last element in the postorder traversal is the root of the current subtree
        int rootValue = postorder[postEnd];
        Node root = new Node(rootValue);

        // Find the index of the root value in the inorder traversal
        int rootIndex = inorderMap.get(rootValue);

        // Calculate the number of elements in the left subtree
        int leftTreeSize = rootIndex - inStart;

        // Recursively build the left and right subtrees
        root.left = buildTreeHelper(inorder, inStart, rootIndex - 1,
                postorder, postStart, postStart + leftTreeSize - 1,
                inorderMap);
        root.right = buildTreeHelper(inorder, rootIndex + 1, inEnd,
                postorder, postStart + leftTreeSize, postEnd - 1,
                inorderMap);

        return root;
    }
    void printPreorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {
        ConstructTree solution = new ConstructTree();

        int[] inorder = {4, 8, 2, 5, 1, 6, 3, 7};
        int[] postorder = {8, 4, 5, 2, 6, 7, 3, 1};

        Node root = solution.buildTree(inorder, postorder);
        solution.printPreorder(root); // Expected Output: 1 2 4 8 5 3 6 7
    }
}
