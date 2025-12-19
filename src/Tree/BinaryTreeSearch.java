package Tree;

public class BinaryTreeSearch {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    boolean search(Node node, int key) {

        if (node == null)
            return false;

        if (node.data == key)
            return true;

        return search(node.left, key) || search(node.right, key);
    }

    public static void main(String[] args) {

        BinaryTreeSearch tree = new BinaryTreeSearch();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);


        System.out.println(tree.search(tree.root,4));


    }
}

