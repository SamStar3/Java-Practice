package Tree;

import java.util.ArrayList;

public class PostorderTraversal {

    static ArrayList<Integer> postOrder(Node root){

        ArrayList<Integer> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        result.addAll(postOrder(root.left));
        result.addAll(postOrder(root.right));
        result.add(root.key);

        return result;
    }

    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);

        ArrayList<Integer> result = postOrder(root);

        System.out.println(result);
    }
}
