package linkedlist;

public class LinkedList2 {

    public static void main(String[] args) {
        SingleNode head = LinkedList.getSinglyLinkedList();
        printLinkedList(pairwiseSwap(head));
    }

    // TODO: 15-05-2020 pairwise using data only.
    //  LATER: By using links;
    private static SingleNode pairwiseSwap(SingleNode head) {
        SingleNode current = head;
        Integer temp;
        while (current != null) {
            // swap(current.Data(),current.Next().Data());
            temp = current.Data();
            current.setData(current.Next().Data());
            current.Next().setData(temp);

            // update current by moving 2 places;
            current = current.Next().Next();
        }
        return head;
    }

    private static void printLinkedList(SingleNode head) {
        SingleNode current = head;
        while (current != null) {
            System.out.print(current.Data() + "-");
            current = current.Next();
        }
    }
}
