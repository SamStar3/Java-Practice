package Tree;

public class MaximumInTree {

    Node root;

    int getMax(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
    }
    public static void main(String[] args){
        MaximumInTree tree = new MaximumInTree();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);

        // Function call
        System.out.println("Maximum element is "
                + tree.getMax(tree.root));
    }
}
