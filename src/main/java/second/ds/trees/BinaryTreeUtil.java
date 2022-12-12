package second.ds.trees;

class BinaryTreeUtil {

    static TreeNode getBinaryTree() {

        TreeNode node1 = new TreeNode(24);
        TreeNode node2 = new TreeNode(62);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(21);
        TreeNode node5 = new TreeNode(44);
        TreeNode node6 = new TreeNode(76);
        TreeNode node7 = new TreeNode(35);
        TreeNode node8 = new TreeNode(47);
        TreeNode node9 = new TreeNode(20);
        TreeNode node10 =new TreeNode(49);
        TreeNode node11 =new TreeNode(36);
        TreeNode node12 =new TreeNode(98);
        TreeNode node13 =new TreeNode(12);
        TreeNode node14 =new TreeNode(31);
        TreeNode node15 =new TreeNode(29);
        TreeNode node16 =new TreeNode(40);

         // left subtree
        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node5.right = node6;
        node6.left = node7;


        // right subtree
        node3.left = node8;
        node3.right = node9;

        node8.left = node10;
        node8.right = node11;

        node9.left = node12;
        node9.right = node13;

        node13.left = node14;
        node13.right = node15;

        node14.right = node16;


        return node1;
    }

}
