package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    Node root;

    void printLevelOrder(){

        if (root == null){
            return;
        }

        Queue<Node> q = new LinkedList<Node>();

        q.add(root);
        q.add(null);

        while(q.size() > 1){

            Node curr = q.poll();
            if (curr == null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key);
            if (curr.left != null){
                q.add(curr.left);
            }
            if (curr.right != null){
                q.add(curr.right);
            }

        }
    }
    public static void main(String args[])
    {

        LevelOrder tree_level = new LevelOrder();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println("Level order traversal " +
                "of binary tree is - ");
        tree_level.printLevelOrder();
    }
}
