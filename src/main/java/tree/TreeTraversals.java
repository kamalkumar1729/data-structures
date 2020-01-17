package tree;

public class TreeTraversals {
    public static void main(String[] args) {
        TreeNode root = BinaryTree.getBinaryTree();
        preOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
    }

    private static void preOrderTraversal(TreeNode root) {
        /* ROOT -> LEFT -> RIGHT */
        if (root != null) {
            System.out.print(root.Data()); System.out.print(" ");
            preOrderTraversal(root.Left());
            preOrderTraversal(root.Right());
        }
    }

    private static void inOrderTraversal(TreeNode root) {
        /* LEFT -> ROOT -> RIGHT */
        if (root != null) {
            inOrderTraversal(root.Left());
            System.out.print(root.Data());System.out.print(" ");
            inOrderTraversal(root.Right());
        }
    }

    private static void postOrderTraversal(TreeNode root) {
        /* LEFT -> RIGHT -> ROOT */
        if (root != null) {
            postOrderTraversal(root.Left());
            postOrderTraversal(root.Right());
            System.out.print(root.Data()); System.out.print(" ");
        }
    }
}
