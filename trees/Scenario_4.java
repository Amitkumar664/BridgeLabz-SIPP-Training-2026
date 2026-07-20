class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Scenario_4 {

    static int height(Node node) {

        if (node == null) {
            return -1;
        }

        return Math.max(height(node.left), height(node.right)) + 1;
    }

    static boolean isTooDeep(Node root, int threshold) {

        return height(root) > threshold;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);

        int h = height(root);

        System.out.println("Height = " + h);

        System.out.println("Exceeds Threshold (1)? " + isTooDeep(root, 1));

        System.out.println("Exceeds Threshold (3)? " + isTooDeep(root, 3));
    }
}