class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Scenario_1 {

    static boolean search(Node root, int target) {

        Node current = root;

        while (current != null) {

            if (target == current.val) {
                return true;
            }

            if (target < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }
}