package second.ds.trees;

import java.util.PriorityQueue;

public class BFS {

    // Breath First Search (Level-Order Traversal)

    public static void main(String[] args) {

        TreeNode root = BinaryTreeUtil.getBinaryTree();
        BreathFirstSearch(root);

    }

    private static void BreathFirstSearch(TreeNode root) {

        // take a queue and add root
        PriorityQueue<TreeNode> toBeVisitedNodes = new PriorityQueue<>();
        toBeVisitedNodes.add(root);

        while (!toBeVisitedNodes.isEmpty()) {

            // pop node and print
            // push node.left and node.right to queue

            TreeNode node = toBeVisitedNodes.poll();
            System.out.print(node.data + "-");

            if (node.left != null)
                toBeVisitedNodes.add(node.left);
            if (node.right != null)
                toBeVisitedNodes.add(node.right);

        }
    }
}
