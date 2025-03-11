package HackerRank;

import java.io.*;
import java.util.*;

enum Color {
    RED, GREEN
}

abstract class Tree {
    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {
    private List<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);
        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {
    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends TreeVis {
    private int sum = 0;

    public int getResult() {
        return sum;
    }

    public void visitNode(TreeNode node) {
        // Do nothing
    }

    public void visitLeaf(TreeLeaf leaf) {
        sum += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long product = 1;
    private final int MODULO = 1000000007;

    public int getResult() {
        return (int) product;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            product = (product * node.getValue()) % MODULO;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            product = (product * leaf.getValue()) % MODULO;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int sumEvenDepthNonLeaf = 0;
    private int sumGreenLeaves = 0;

    public int getResult() {
        return Math.abs(sumEvenDepthNonLeaf - sumGreenLeaves);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            sumEvenDepthNonLeaf += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            sumGreenLeaves += leaf.getValue();
        }
    }
}

public class JavaVisitorPattern {


    private static Tree root;
    private static Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
    private static int[] values;
    private static Color[] colors;

    public static Tree solve() {
        boolean[] visited = new boolean[values.length];
        return buildTree(0, 0, visited);
    }

    private static Tree buildTree(int nodeIndex, int depth, boolean[] visited) {
        visited[nodeIndex] = true;
        List<Integer> neighbors = adjacencyList.get(nodeIndex);
        boolean isLeaf = true;
        TreeNode node = new TreeNode(values[nodeIndex], colors[nodeIndex], depth);
        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                isLeaf = false;
                node.addChild(buildTree(neighbor, depth + 1, visited));
            }
        }
        return isLeaf ? new TreeLeaf(values[nodeIndex], colors[nodeIndex], depth) : node;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        values = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        colors = Arrays.stream(br.readLine().trim().split(" ")).map(s -> s.equals("0") ? Color.RED : Color.GREEN).toArray(Color[]::new);

        for (int i = 0; i < n - 1; i++) {
            String[] edge = br.readLine().trim().split(" ");
            int u = Integer.parseInt(edge[0]) - 1;
            int v = Integer.parseInt(edge[1]) - 1;
            adjacencyList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adjacencyList.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        root = solve();

        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        System.out.println(vis1.getResult());
        System.out.println(vis2.getResult());
        System.out.println(vis3.getResult());
    }
}
