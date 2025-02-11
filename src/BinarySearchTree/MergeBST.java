package BinarySearchTree;

import java.util.ArrayList;
import java.util.Stack;

public class MergeBST {

    public ArrayList<Integer> merge(Node root1, Node root2) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        while (root1 != null || root2 != null || !s1.isEmpty() || !s2.isEmpty()) {
            // Traverse the left subtree of root1
            while (root1 != null) {
                s1.push(root1);
                root1 = root1.left;
            }
            // Traverse the left subtree of root2
            while (root2 != null) {
                s2.push(root2);
                root2 = root2.left;
            }

            // Compare the top elements of both stacks
            if (s2.isEmpty() || (!s1.isEmpty() && s1.peek().data <= s2.peek().data)) {
                root1 = s1.pop();
                res.add(root1.data);
                root1 = root1.right; // Move to the right subtree
            } else {
                root2 = s2.pop();
                res.add(root2.data);
                root2 = root2.right; // Move to the right subtree
            }
        }

        return res;
    }
    public static void main(String[] args){

    }
}
