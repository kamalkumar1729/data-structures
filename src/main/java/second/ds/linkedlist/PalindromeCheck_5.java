package second.ds.linkedlist;

import java.util.Stack;

public class PalindromeCheck_5 {


    public static void main(String[] args) {

        SingleNode head = SinglyLinkedListUtil.getPalindromicSinglyLinkedList();

        System.out.println("LinkedList is palindromic : " + isPalindrome(head));


    }

    private static boolean isPalindrome(SingleNode head) {

        SingleNode iter = head, iter2 = head;
        boolean flag = false;
        Stack<SingleNode> stack = new Stack<>();

        while (iter != null) {
            stack.push(iter);
            iter = iter.next;
        }
        while (iter2 != null) {
            System.out.println("Compared : "+ stack.peek().data + " == " + iter2.data);
            flag = stack.pop().data.equals(iter2.data);

            iter2 = iter2.next;
        }

        return flag;
    }
}
