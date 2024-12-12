package Tree;

import java.util.ArrayList;

public class PreorderTraversal {

    static ArrayList<Integer> preorder(Node root) {
        // write code here

        ArrayList<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }
        result.add(root.key);


        result.addAll(preorder(root.left));

        result.addAll(preorder(root.right));

        return result;
    }

    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);

        // Call the preorder function
        ArrayList<Integer> result = preorder(root);

        // Print the result
        System.out.println(result);

    }
}
