package Tree;

import dev.lpa.Array;

import java.util.ArrayList;

public class InorderTraversal {

    static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        result.addAll(inOrder(root.left));

        result.add(root.key);

        result.addAll(inOrder(root.right));

        return result;
    }
    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);

        ArrayList<Integer> result = inOrder(root);

        System.out.println(result);
    }
}
