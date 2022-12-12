package second.ds.linkedlist;

public class Reverse_1 {

    public static void main(String[] args) {

        SingleNode head = SinglyLinkedListUtil.getSinglyLinkedList();

        SinglyLinkedListUtil.traverse(head);

        SinglyLinkedListUtil.traverse(reverse(head));

    }

    private static SingleNode reverse(SingleNode head) {

        SingleNode curr = head;
        SingleNode next = null, prev = null;

        while (curr != null) {
            // save the next node
            next = curr.next;

            // actual node swapping
            curr.next = prev;

            // update variables prev, curr
            prev = curr;
            curr = next;
        }

        return prev;
    }


    private static SingleNode reverseLinkedList(SingleNode head) {

        SingleNode current = head, next = null, prev = null;

        while (current != null) {
            // save next reference, else it will get lost
            next = current.next;

            // do the swapping
            current.next = prev;

            // Update prev & current for next iteration
            prev = current;
            current = next;

        }

        // return last node, which is first node now
        return prev;

    }















}
