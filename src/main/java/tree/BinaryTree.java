package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    // TODO :: Only 10 Questions. Please.

    public static void main(String[] args) {
        TreeNode root = BinaryTree.getBinaryTree();

        // preOrderRecursive(root);
        System.out.println();
        // preOrderIterative(root);

        //inOrderRecursive(root);
        System.out.println();
        //inOrderIterative(root);

       // postOrderRecursive(root);
        System.out.println();
       // postOrderIterative(root);


        levelOrderTraversal(root);
    }

    private static void inOrderIterative(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            TreeNode current = root;

            /**go to the leftest stack all in between
             * pop and print (popped)
             * repeat 1,2 for popped.Right() */

            while (true) {
                while (current != null) {
                    stack.push(current);
                    current = current.Left();
                }

                if (stack.isEmpty()) break;

                current = stack.pop();
                System.out.print(current.Data() + "-");
                current = current.Right();
            }
        }
    }


    private static void postOrderIterative(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            Stack<TreeNode> output = new Stack<>();
            TreeNode current;

            stack.push(root);

            /**The only difference is that the right child is visited before left child,
             *  and therefore the sequence is “root right left” instead of “root left right”.
             *  So, we can do something like iterative preorder traversal with the following differences:
             a) Instead of printing an item, we push it to a stack.
             b) We push the left subtree before the right subtree */

            /**
             push on output stack ;
             push left;
             push right ; */

            while (!stack.isEmpty()) {
                current = stack.pop();
                output.push(current);
                if (current.Left() != null)
                    stack.push(current.Left());
                if (current.Right() != null)
                    stack.push(current.Right());
            }

            // print the output stack
            while (!output.isEmpty())
                System.out.print(output.pop().Data() + "-");
        }
    }



    /* Using stack */
    private static void preOrderIterative(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            /**
                process ;
                push right;
                push left; */

            /**  push left last; it is to be processed first.*/
            stack.push(root);
            while (!stack.empty()) {
                TreeNode node = stack.pop();
                System.out.print(node.Data() + "-");
                if (node.Right() != null)
                    stack.push(node.Right());
                if (node.Left() != null)
                    stack.push(node.Left());
            }
        }
    }


    private static void preOrderRecursive(TreeNode root) {
        /* ROOT -> LEFT -> RIGHT */
        if (root != null) {
            System.out.print(root.Data() + "-");
            preOrderRecursive(root.Left());
            preOrderRecursive(root.Right());
        }
    }

    private static void inOrderRecursive(TreeNode root) {
        /* LEFT -> ROOT -> RIGHT */
        if (root != null) {
            inOrderRecursive(root.Left());
            System.out.print(root.Data() + "-");
            inOrderRecursive(root.Right());
        }
    }

    private static void postOrderRecursive(TreeNode root) {
        /* LEFT -> RIGHT -> ROOT */
        if (root != null) {
            postOrderRecursive(root.Left());
            postOrderRecursive(root.Right());
            System.out.print(root.Data() + "-");
        }
    }

    private static void levelOrderTraversal(TreeNode root) {
        /** Using a Queue */
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode temp = queue.remove();
                System.out.print(temp.Data() + "-");
                if (temp.Left() != null)
                    queue.add(temp.Left());
                if (temp.Right() != null)
                    queue.add(temp.Right());
            }
        }
    }




    public static TreeNode getBinaryTree() {
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
            node3.setLeft(node7);
            node7.setLeft(node8);

            return root;
    }
}
