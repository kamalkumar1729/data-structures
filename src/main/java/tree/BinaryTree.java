package tree;

public class BinaryTree {
    // TODO :: Only 10 Questions. Please.

    public static void main(String[] args) {
        TreeNode root = getBinaryTree();
    }

    static TreeNode getBinaryTree() {
            TreeNode root = new TreeNode(13);
            TreeNode node1 = new TreeNode(28);
            TreeNode node2 = new TreeNode(2);
            TreeNode node3 = new TreeNode(7);
            TreeNode node4 = new TreeNode(45);
            TreeNode node5 = new TreeNode(22);
            TreeNode node6 = new TreeNode(3);
            TreeNode node7 = new TreeNode(17);
            TreeNode node8 = new TreeNode(6);

            root.setLeft(node1);root.setRight(node2);
            node1.setLeft(node3);node1.setRight(node4);
            node2.setLeft(node5);node2.setRight(node6);
            node4.setLeft(node7);
            node7.setLeft(node8);

            return root;
    }
}
