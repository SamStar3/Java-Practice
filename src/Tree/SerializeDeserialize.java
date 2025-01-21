package Tree;

import java.util.ArrayList;

public class SerializeDeserialize {

    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        serializeHelper(root, result);
        return result;
    }

    private void serializeHelper(Node node, ArrayList<Integer> result) {
        if (node == null) {
            result.add(-1); // Using -1 to represent null nodes.
            return;
        }
        result.add(node.key);
        serializeHelper(node.left, result);
        serializeHelper(node.right, result);
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        // Using an index wrapped in an array to keep track of current position during recursion.
        int[] index = {0};
        return deSerializeHelper(arr, index);
    }

    private Node deSerializeHelper(ArrayList<Integer> arr, int[] index) {
        if (index[0] >= arr.size() || arr.get(index[0]) == -1) {
            index[0]++;
            return null;
        }

        Node root = new Node(arr.get(index[0]));
        index[0]++;
        root.left = deSerializeHelper(arr, index);
        root.right = deSerializeHelper(arr, index);

        return root;
    }
    public static void main(String[] args) {
        // Constructing a binary tree
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        SerializeDeserialize tree = new SerializeDeserialize();

        // Serialize the tree
        ArrayList<Integer> serializedTree = tree.serialize(root);
        System.out.println("Serialized Tree: " + serializedTree);

        // Deserialize the tree
        Node deserializedRoot = tree.deSerialize(serializedTree);

        // Print the in-order traversal of the deserialized tree
        printInOrder(deserializedRoot);
    }

    public static void printInOrder(Node root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.key + " ");
        printInOrder(root.right);
    }
}
