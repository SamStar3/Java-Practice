package Tree;

public class FoldableTree {

    boolean IsFoldable(Node node)
    {
        // your code
        if (node == null) {
            return true;
        }
        return isMirrorStructure(node.left, node.right);
    }
    boolean isMirrorStructure(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return isMirrorStructure(left.left, right.right) &&
                isMirrorStructure(left.right, right.left);
    }

    public static void main(String[] args) {

        Node root1 = new Node(10);
        root1.left = new Node(7);
        root1.right = new Node(15);
        root1.left.right = new Node(9);
        root1.right.left = new Node(11);

        FoldableTree tree1 = new FoldableTree();
        System.out.println(tree1.IsFoldable(root1) ? "Yes" : "No");
    }
}
