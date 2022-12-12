package first.ds.linkedlist;

public class Reversal2 {
    public static void main(String[] args) {
        SingleNode head = LinkedList.getSinglyLinkedList();
        printLinkedList(reverse3(head));
    }

    private static void printLinkedList(SingleNode head) {
        SingleNode iter = head;
        while (iter != null) {
            System.out.print( iter.Data() + "-");
            iter = iter.Next();
        }
    }


    private static SingleNode reverse(SingleNode head) {
        SingleNode current = head, prev = null, next = null;
        while (current != null) {
            next = current.Next();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }


    private static SingleNode reverse2(SingleNode head) {
        SingleNode current = head, next = null,  prev = null;
        while (current != null) {
            next = current.Next();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }

    private static SingleNode reverse3(SingleNode head) {

        SingleNode iter = head, prev = null, next = null;

        while (iter != null) {
            next = iter.Next();
            iter.setNext(prev);
            prev = iter;
            iter = next;
        }
        return prev;
    }
}
