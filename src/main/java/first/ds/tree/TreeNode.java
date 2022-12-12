package first.ds.tree;

class TreeNode {

    private Integer data;
    private TreeNode left;
    private TreeNode right;

    TreeNode(Integer data) {
        this.data = data;
        left = null;
        right = null;
    }

    void setLeft(TreeNode left) {
        this.left = left;
    }

    void setRight(TreeNode right) {
        this.right = right;
    }

    Integer Data() {
        return data;
    }

    TreeNode Left() {
        return left;
    }

    TreeNode Right() {
        return right;
    }

}
