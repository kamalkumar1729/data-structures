package second.ds.linkedlist;

public class NodeFromEnd_4 {
    public static void main(String[] args) {

        SingleNode head = SinglyLinkedListUtil.getSinglyLinkedList();
        SinglyLinkedListUtil.traverse(head);
        System.out.println("length of linked list : " + findLength(head));

        findNthNodeFromEnd(head, 1);





    }

    private static void findNthNodeFromEnd(SingleNode head, int n) {

        SingleNode iter = head;

        for (int i = 1; i <=n; i++) {
            head = head.next;
        }

        while (head != null) {
            iter = iter.next;
            head = head.next;
        }

        System.out.println(n +"th node from end : " + iter.data);
    }


    private static int findLength(SingleNode head) {

        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }
}