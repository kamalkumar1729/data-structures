package second.ds.trees;

class TraversalsRecursive {

    public static void main(String[] args) {

        TreeNode root = BinaryTreeUtil.getBinaryTree();

        inOrderRecursive(root);

    }

    static void preOrderRecursive(TreeNode root) {

        if (root != null) {
            System.out.print(root.data + "-");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }

    }

    static void inOrderRecursive(TreeNode root) {

        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.data + "-");
            inOrderRecursive(root.right);
        }

    }

    static void postOrderRecursive(TreeNode root) {

        if (root != null) {
            inOrderRecursive(root.left);
            inOrderRecursive(root.right);
            System.out.print(root.data + "-");
        }
    }
}