package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfTree {

    ArrayList<Integer> rightView(Node root) {
        // add code here.

        ArrayList<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            int count = q.size();

            for(int i = 0; i < count; i++){

                Node curr = q.poll();

                if(i == count -1){
                    result.add(curr.key);
                }
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null ) {
                    q.add(curr.right);
                }
            }
        }
        return result;
    }
}
