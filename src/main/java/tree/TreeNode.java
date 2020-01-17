package tree;

public class TreeNode {

    private Integer data;
    private TreeNode left;
    private TreeNode right;

    TreeNode(Integer data) {
        this.data = data;
        left = null;
        right = null;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public Integer Data() {
        return data;
    }

    public TreeNode Left() {
        return left;
    }

    public TreeNode Right() {
        return right;
    }

}
