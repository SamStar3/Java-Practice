package Tree;

public class SizeOfTree {

     Node root;


    int getSize() { return getSize(root); }
    static int getSize(Node root){


        if (root == null){
            return 0;
        }else {
            return 1 + getSize(root.left) + getSize(root.right);
        }
    }

    public static void main(String[] args){
        SizeOfTree tree = new SizeOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The size of binary tree is : "
                + tree.getSize());
    }
}
