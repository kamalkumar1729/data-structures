package second.ds.linkedlist;

public class Sorting_3 {

    // how to sort linked list.


    public static void main(String[] args) {

        SingleNode head = SinglyLinkedListUtil.getSinglyLinkedList();
        sort(head, head.next);
        SinglyLinkedListUtil.traverse(head);
    }

    private static void sort(SingleNode sorted, SingleNode unsorted) {

        // TODO : later .

        // take one node from unsorted and
        // put it in right place in sorted list.

        SingleNode nextElement = unsorted.next;

        sort(sorted,unsorted.next);


























    }
}
