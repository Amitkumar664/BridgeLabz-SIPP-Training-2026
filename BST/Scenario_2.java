class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Scenario_2 {

    static Node insert(Node root, int id) {

        if (root == null) {
            return new Node(id);
        }

        if (id < root.val) {
            root.left = insert(root.left, id);
        } else {
            root.right = insert(root.right, id);
        }

        return root;
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

        Node root = null;

        root = insert(root, 40);
        root = insert(root, 20);
        root = insert(root, 60);
        root = insert(root, 10);
        root = insert(root, 30);
        root = insert(root, 50);
        root = insert(root, 70);

        System.out.println("Before inserting 25:");
        inorder(root);

        root = insert(root, 25);

        System.out.println("\nAfter inserting 25:");
        inorder(root);
    }
}