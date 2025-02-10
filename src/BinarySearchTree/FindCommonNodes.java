package BinarySearchTree;

import java.util.ArrayList;
import java.util.Stack;

public class FindCommonNodes {    public static ArrayList<Integer> findCommon(Node root1, Node root2) {
    ArrayList<Integer> result = new ArrayList<>();
    Stack<Node> stack1 = new Stack<>();
    Stack<Node> stack2 = new Stack<>();

    while (true) {
        // Traverse left subtree of both BSTs
        while (root1 != null) {
            stack1.push(root1);
            root1 = root1.left;
        }
        while (root2 != null) {
            stack2.push(root2);
            root2 = root2.left;
        }

        // If any stack is empty, we are done
        if (stack1.isEmpty() || stack2.isEmpty()) {
            break;
        }

        // Get the top elements
        Node top1 = stack1.peek();
        Node top2 = stack2.peek();

        if (top1.data == top2.data) {
            result.add(top1.data);
            stack1.pop();
            stack2.pop();
            root1 = top1.right;
            root2 = top2.right;
        } else if (top1.data < top2.data) {
            stack1.pop();
            root1 = top1.right;
        } else {
            stack2.pop();
            root2 = top2.right;
        }
    }

    return result;
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
            BST1:
                  5
               /     \
             1        10
           /   \      /
          0     4    7
                      \
                       9
            BST2:
                10
              /    \
             7     20
           /   \
          4     9
        */
        Node root1 = new Node(5);
        root1.left = new Node(1);
        root1.right = new Node(10);
        root1.left.left = new Node(0);
        root1.left.right = new Node(4);
        root1.right.left = new Node(7);
        root1.right.left.right = new Node(9);

        Node root2 = new Node(10);
        root2.left = new Node(7);
        root2.right = new Node(20);
        root2.left.left = new Node(4);
        root2.left.right = new Node(9);

        ArrayList<Integer> commonNodes = findCommon(root1, root2);
        System.out.println("Common Nodes in Sorted Order:");
        printList(commonNodes);
    }
}
