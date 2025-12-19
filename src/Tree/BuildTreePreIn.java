package Tree;

public class BuildTreePreIn {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int preIndex = 0;

    static Node buildTree(int[] preorder, int[] inorder, int start, int end) {

        if (start > end)
            return null;

        int rootValue = preorder[preIndex++];
        Node root = new Node(rootValue);

        if (start == end)
            return root;
        int inIndex = search(inorder, start, end, rootValue);

        root.left = buildTree(preorder, inorder, start, inIndex - 1);
        root.right = buildTree(preorder, inorder, inIndex + 1, end);

        return root;
    }

    static int search(int[] inorder, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value)
                return i;
        }
        return -1;
    }

    static void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {

        int[] preorder = {1, 2, 4, 5, 3};
        int[] inorder  = {4, 2, 5, 1, 3};

        Node root = buildTree(preorder, inorder, 0, inorder.length - 1);

        System.out.print("Inorder traversal of constructed tree: ");
        printInorder(root);
    }
}
