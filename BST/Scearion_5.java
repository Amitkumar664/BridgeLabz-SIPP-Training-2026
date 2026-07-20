import java.util.ArrayDeque;
import java.util.Deque;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Scearion_5 {

    static int kthSmallest(Node root, int k) {

        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            count++;

            if (count == k) {
                return current.val;
            }

            current = current.right;
        }

        return -1;
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.left = new Node(6);
        root.right.right = new Node(8);

        int k = 3;

        System.out.println(kthSmallest(root, k));
    }
}