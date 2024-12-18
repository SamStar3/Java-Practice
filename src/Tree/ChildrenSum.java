package Tree;

public class ChildrenSum {

    public static int isSumProperty(Node root)
    {
        // add your code here
        if (root == null || (root.left == null && root.right == null)) {
            return 1;
        }

        int leftData = (root.left != null) ? root.left.key : 0;
        int rightData = (root.right != null) ? root.right.key : 0;

        if (root.key == leftData + rightData) {
            int leftResult = isSumProperty(root.left);
            int rightResult = isSumProperty(root.right);

            return (leftResult == 1 && rightResult == 1) ? 1 : 0;
        } else {
            return 0;
        }
    }
}
