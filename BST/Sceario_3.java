class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Sceario_3 {

    static Node delete(Node node, int key) {

        if (node == null) {
            return null;
        }

        if (key < node.val) {
            node.left = delete(node.left, key);
        } else if (key > node.val) {
            node.right = delete(node.right, key);
        } else {

            // Case 1: No child
            if (node.left == null && node.right == null) {
                return null;
            }

            // Case 2: One child
            if (node.left == null) {
                return node.right;
            }

            if (node.right == null) {
                return node.left;
            }

            // Case 3: Two children
            Node successor = node.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            node.val = successor.val;

            node.right = delete(node.right, successor.val);
        }

        return node;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(40);

        root.left = new Node(20);
        root.right = new Node(60);

        root.left.left = new Node(10);
        root.left.right = new Node(30);

        root.right.left = new Node(50);
        root.right.right = new Node(70);

        System.out.println("Before Deletion:");
        inorder(root);

        root = delete(root, 60);

        System.out.println("\nAfter Deleting 60:");
        inorder(root);
    }
}