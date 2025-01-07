package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class ListToTree {

    static class Tree {
        int data;
        Tree left;
        Tree right;

        Tree(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    // Linked List Node class
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Tree linkedListToBinaryTree(Node head) {
        if (head == null) return null;

        // Create the root of the binary tree
        Tree root = new Tree(head.data);
        head = head.next;

        // Use a queue to perform level-order construction
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        while (head != null) {
            // Get the current node from the queue
            Tree current = queue.poll();

            // Create the left child
            current.left = new Tree(head.data);
            queue.add(current.left);
            head = head.next;

            // If more nodes exist, create the right child
            if (head != null) {
                current.right = new Tree(head.data);
                queue.add(current.right);
                head = head.next;
            }
        }

        return root;
    }

    // Function to perform level order traversal and print
    public void levelOrder(Tree root) {
        if (root == null) return;

        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Tree current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
}
