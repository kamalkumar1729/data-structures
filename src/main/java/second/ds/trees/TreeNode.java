package second.ds.trees;

class TreeNode implements Comparable {

    Integer data;
    TreeNode left;
    TreeNode right;

    TreeNode (Integer data) {
        this.data = data;
    }

    @Override
    public int compareTo(Object o) {
        TreeNode t = (TreeNode) o;
        return data > t.data ? 1 : 0;
    }
}