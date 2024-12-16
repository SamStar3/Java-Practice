package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfTree {

    void printLift(Node root){
        if (root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()){
            int count = q.size();

            for (int i = 0; i < count; i++){

                Node curr = q.poll();

                if (i == 0){
                    System.out.print(curr.key);
                }

                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args){

    }
}
