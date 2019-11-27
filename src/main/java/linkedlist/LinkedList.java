package linkedlist;

public class LinkedList {

    public static void main(String[] args) {

        SingleNode head = getSinglyLinkedList();

        traverseLinkedList(head);
        deleteNodeAtIndex(head,0);
        System.out.println();
        traverseLinkedList(head);
    }

    private static void traverseLinkedList(SingleNode head) {
        if (head != null) {
            SingleNode current = head;
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            }
        } else {
            System.out.println("Linked list is empty.");
        }
    }

    private static void deleteNodeAtIndex(SingleNode head, int index) {
        if (head != null) {
            SingleNode iter = head;
            for (int i=0; i < index-1 ; i++) {
                iter = iter.getNext();
            }
            SingleNode beforeDelNode = iter;
            SingleNode delNode = iter.getNext();
            beforeDelNode.setNext(delNode.getNext());
        }
    }

    private static SingleNode getSinglyLinkedList() {
        SingleNode head = new SingleNode(21);
        SingleNode second = new SingleNode(22);
        SingleNode third = new SingleNode(23);
        SingleNode fourth = new SingleNode(24);
        SingleNode fifth = new SingleNode(25);
        SingleNode sixth = new SingleNode(26);
        SingleNode seventh = new SingleNode(27);

        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);

        return head;
    }

}
