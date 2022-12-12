package second.ds.linkedlist;

public class DeleteMiddleNode_2 {

    public static void main(String[] args) {

        SingleNode head = SinglyLinkedListUtil.getSinglyLinkedList();

        deleteMiddleNode(head);
        SinglyLinkedListUtil.traverse(head);

    }

    private static void deleteMiddleNode(SingleNode head) {

        SingleNode slow = head, fast = head, prev = head;

        while (fast != null && fast.next != null) {
            prev = slow;

            System.out.println("fast : " + fast.data + " slow : " + slow.data);

            slow = slow.next;
            fast = fast.next.next;

        }


        System.out.println("Middle node is : " + slow.data);

        // slow  = middle now.
        // delete this node.
        // eske previous wale ko iske next ko point karwa do bus.

        prev.next = slow.next;

    }
}
