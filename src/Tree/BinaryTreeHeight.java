package Tree;

public class BinaryTreeHeight {

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    int height(Node node){

        if(node == null)
            return 0;

        int leftheight = height(node.left);
        int rightheight = height(node.right);

        return Math.max(leftheight, rightheight) + 1;
    }

    public static void main(String[] args) {

        BinaryTreeHeight tree = new BinaryTreeHeight();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(tree.height(tree.root));
    }
}
